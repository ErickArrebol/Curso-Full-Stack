/*Abrir el script de la base de datos llamada “jardineria.sql” y ejecutarlo para crear todas las
tablas e insertar datos en las mismas. Deberá obtener un diagrama de entidad relación igual al
que se muestra a continuación:*/

USE jardineria;
SHOW TABLES;

								-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:
                                
-- Consultas sobre una tabla
            
-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
SELECT codigo_oficina, ciudad  FROM oficina;

-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
SELECT ciudad , telefono FROM oficina  WHERE codigo_oficina LIKE'%ES%';

-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
SELECT nombre, apellido1, apellido2, email FROM empleado WHERE codigo_jefe = 7;

-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
SELECT puesto, nombre, CONCAT(apellido1, apellido2) AS 'apellidos' , email FROM empleado WHERE puesto = 'Director general';

-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
SELECT nombre, CONCAT(apellido1, apellido2) AS 'apellidos',puesto FROM empleado WHERE puesto <> 'Representante Ventas';

-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.
SELECT nombre_cliente FROM cliente WHERE pais = 'Spain';

-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
SELECT DISTINCT estado FROM pedido;

-- 8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. 
-- Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos. Resuelva la consulta:
-- o Utilizando la función YEAR de MySQL.
-- o Utilizando la función DATE_FORMAT de MySQL.
-- o Sin utilizar ninguna de las funciones anteriores.
SELECT codigo_cliente FROM cliente WHERE codigo_cliente IN(SELECT DISTINCT codigo_cliente FROM pago WHERE YEAR(fecha_pago) =2008);
SELECT codigo_cliente FROM cliente WHERE codigo_cliente IN(SELECT DISTINCT codigo_cliente FROM pago WHERE DATE_FORMAT(fecha_pago,'%Y') =2008);
SELECT codigo_cliente FROM cliente WHERE codigo_cliente IN(SELECT DISTINCT codigo_cliente FROM pago WHERE fecha_pago LIKE '%2008%');

-- 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo.
SELECT codigo_pedido, codigo_cliente, fecha_esperada,  fecha_entrega , (fecha_entrega-fecha_esperada)AS 'Dias Restrazo' FROM pedido WHERE (fecha_entrega-fecha_esperada) >0;

-- 10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos cuya fecha de 
-- entrega ha sido al menos dos días antes de la fecha esperada.
-- o Utilizando la función ADDDATE de MySQL.
-- o Utilizando la función DATEDIFF de MySQL.
SELECT codigo_pedido, codigo_cliente, fecha_esperada,  fecha_entrega , (fecha_esperada-fecha_entrega)AS 'Dias ANTICIPACION' FROM pedido WHERE fecha_entrega = ADDDATE(fecha_esperada, INTERVAL -2 DAY);
SELECT codigo_pedido, codigo_cliente, fecha_esperada,  fecha_entrega , (fecha_esperada-fecha_entrega)AS 'Dias ANTICIPACION' FROM pedido WHERE DATEDIFF(fecha_esperada, fecha_entrega) >= 2;
      
-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
SELECT * FROM pedido WHERE YEAR(fecha_pedido) =2009;

-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
SELECT * FROM pedido WHERE month(fecha_pedido) =1;

-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor.
SELECT * FROM pago WHERE forma_pago LIKE '%Paypal%' AND YEAR(fecha_pago) =2008;

-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en
-- cuenta que no deben aparecer formas de pago repetidas.
SELECT distinct forma_pago FROM pago;

-- 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades en stock. 
-- El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.
SELECT * FROM producto WHERE gama LIKE 'Ornamentales' AND cantidad_en_stock > 100 ORDER BY precio_venta DESC ;

-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de 
-- ventas tenga el código de empleado 11 o 30.
SELECT * FROM cliente WHERE ciudad = 'Madrid' AND codigo_empleado_rep_ventas IN (11 ,30);



							-- Consultas multitabla (Composición interna)
                            
-- Las consultas se deben resolver con INNER JOIN.
                            
-- 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas
SELECT nombre_cliente, nombre, CONCAT(apellido1, apellido2) FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas;

-- 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT nombre_cliente, nombre, CONCAT(apellido1, apellido2) FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente;

-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT nombre_cliente, nombre, CONCAT(apellido1, apellido2) FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas WHERE codigo_cliente NOT IN (SELECT codigo_cliente FROM pago);

-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT nombre_cliente, nombre, CONCAT(apellido1, apellido2), oficina.ciudad FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina;

-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT nombre_cliente, nombre, CONCAT(apellido1, apellido2), oficina.ciudad FROM empleado INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina WHERE codigo_cliente NOT IN (SELECT codigo_cliente FROM pago);

-- 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
SELECT oficina.linea_direccion1, oficina.linea_direccion2, cliente.nombre_cliente, cliente.ciudad FROM oficina INNER JOIN empleado ON oficina.codigo_oficina = empleado.codigo_oficina INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas WHERE cliente.ciudad = "Fuenlabrada";

-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT cliente.nombre_cliente, codigo_empleado, empleado.nombre, oficina.ciudad FROM cliente INNER JOIN empleado ON cliente.codigo_cliente = empleado.codigo_empleado INNER JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina;

-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
SELECT A.nombre AS "Nombre jefe", A.codigo_empleado AS "Código jefe", B.nombre "Nombre empleado", B.codigo_empleado AS "Código empleado" FROM empleado AS A INNER JOIN empleado AS B ON A.codigo_empleado = B.codigo_jefe;

-- 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
SELECT cliente.codigo_cliente, nombre_cliente, pedido.codigo_pedido, estado FROM cliente INNER JOIN pedido ON pedido.codigo_cliente = cliente.codigo_cliente WHERE estado = "pendiente";

-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
SELECT cliente.codigo_cliente, nombre_cliente, gama_producto.gama FROM cliente INNER JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente INNER JOIN detalle_pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido INNER JOIN producto ON detalle_pedido.codigo_producto = producto.codigo_producto INNER JOIN gama_producto ON gama_producto.gama = producto.gama;



						-- Consultas multitabla (Composición externa)
                        
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.

-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT cliente.nombre_cliente FROM cliente LEFT JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente WHERE pago.codigo_cliente IS NULL;

-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.
SELECT cliente.nombre_cliente FROM cliente LEFT JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente WHERE pedido.codigo_cliente IS NULL;

-- 3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido.
SELECT nombre_cliente, pedido.codigo_cliente, pago.codigo_cliente FROM cliente LEFT JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente LEFT JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente WHERE pedido.codigo_cliente IS NULL AND pago.codigo_cliente IS NULL;

-- 4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada.
SELECT empleado.* FROM empleado LEFT JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina WHERE oficina.codigo_oficina IS NULL;

-- 5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.
SELECT empleado.* FROM cliente RIGHT JOIN empleado ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas WHERE cliente.codigo_empleado_rep_ventas IS NULL;

-- 6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los que no tienen un cliente asociado.
SELECT empleado.* FROM cliente RIGHT JOIN empleado ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas LEFT JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina WHERE cliente.codigo_empleado_rep_ventas IS NULL AND oficina.codigo_oficina IS NULL;

-- 7. Devuelve un listado de los productos que nunca han aparecido en un pedido.
SELECT producto.codigo_producto, producto.nombre, detalle_pedido.codigo_pedido FROM producto LEFT JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto WHERE detalle_pedido.codigo_pedido IS NULL;

-- 8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas de algún 
-- cliente que haya realizado la compra de algún producto de la gama Frutales.
SELECT DISTINCT oficina.codigo_oficina FROM producto LEFT JOIN gama_producto ON producto.gama = gama_producto.gama LEFT JOIN detalle_pedido ON detalle_pedido.codigo_producto = producto.codigo_producto LEFT JOIN pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido LEFT JOIN cliente ON cliente.codigo_cliente = pedido.codigo_cliente LEFT JOIN empleado ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas RIGHT JOIN oficina ON oficina.codigo_oficina = empleado.codigo_oficina WHERE producto.gama != "Frutales" AND detalle_pedido.codigo_producto IS NOT NULL;

-- 9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado ningún pago.
SELECT cliente.nombre_cliente, cliente.codigo_cliente, pedido.codigo_pedido FROM cliente INNER JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente WHERE cliente.codigo_cliente NOT IN (SELECT DISTINCT cliente.codigo_cliente FROM cliente INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente);

-- 10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el nombre de su jefe asociado.
SELECT EMP.nombre AS jefe, EMP2.*, cliente.codigo_empleado_rep_ventas FROM empleado AS EMP LEFT JOIN cliente ON EMP.codigo_empleado = cliente.codigo_empleado_rep_ventas INNER JOIN empleado AS EMP2 ON EMP.codigo_empleado = EMP2.codigo_jefe WHERE cliente.codigo_empleado_rep_ventas IS NULL;



								-- Consultas resumen
                                
-- 1. ¿Cuántos empleados hay en la compañía?
SELECT COUNT(empleado.codigo_empleado) FROM empleado;

-- 2. ¿Cuántos clientes tiene cada país?
SELECT COUNT(cliente.pais), pais FROM cliente GROUP BY pais;

-- 3. ¿Cuál fue el pago medio en 2009?
SELECT AVG(total), YEAR(fecha_pago) AS anio_pago FROM pago GROUP BY YEAR(fecha_pago) HAVING anio_pago = 2009;

-- 4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el número de pedidos.
SELECT COUNT(estado) AS "Numero de Pedidos", estado FROM pedido GROUP BY estado ORDER BY "Numero de Pedidos" DESC;

-- 5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.
SELECT MAX(precio_venta), MIN(precio_venta) FROM producto;

-- 6. Calcula el número de clientes que tiene la empresa.
SELECT COUNT(*) AS "Cantidad de clientes" FROM cliente;

-- 7. ¿Cuántos clientes tiene la ciudad de Madrid?
SELECT COUNT(ciudad) AS "Clientes ciudad", ciudad FROM cliente GROUP BY ciudad HAVING ciudad = "MAdrid";

-- 8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?
SELECT COUNT(ciudad), ciudad FROM cliente GROUP BY ciudad HAVING ciudad LIKE "M%";

-- 9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende cada uno.
SELECT COUNT(codigo_cliente), codigo_empleado_rep_ventas, empleado.nombre FROM cliente INNER JOIN empleado ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas GROUP BY codigo_empleado_rep_ventas;

-- 10. Calcula el número de clientes que no tiene asignado representante de ventas.
SELECT COUNT(*) AS "Clientes sin representante de ventas" FROM cliente LEFT JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado WHERE cliente.codigo_empleado_rep_ventas IS NOT NULL;

-- 11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado deberá mostrar el nombre y los apellidos de cada cliente.
SELECT MAX(fecha_pago) AS "Último pago", MIN(fecha_pago) AS "Primer pago", cliente.nombre_cliente, cliente.codigo_cliente FROM pago INNER JOIN cliente ON cliente.codigo_cliente = pago.codigo_cliente GROUP BY cliente.codigo_cliente;

-- 12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.
SELECT COUNT(codigo_producto), pedido.codigo_pedido FROM pedido INNER JOIN detalle_pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido GROUP BY pedido.codigo_pedido;

-- 13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de los pedidos.
SELECT SUM((SELECT COUNT(codigo_producto) FROM pedido INNER JOIN detalle_pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido));

-- 14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que se han vendido de cada uno. 
-- El listado deberá estar ordenado por el número total de unidades vendidas.
SELECT COUNT(producto.codigo_producto) AS Cantidad_vendida, producto.nombre FROM producto INNER JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto GROUP BY producto.nombre ORDER BY Cantidad_vendida DESC LIMIT 20;

-- 15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el IVA y el total facturado. 
-- La base imponible se calcula sumando el coste del producto por el número de unidades vendidas de la tabla detalle_pedido. 
-- El IVA es el 21 % de la base imponible, y el total la suma de los dos campos anteriores.
SELECT (producto.precio_venta * detalle_pedido.cantidad) AS "Base Imponible", ((producto.precio_venta * detalle_pedido.cantidad) * 0.21) AS "I.V.A.", ((producto.precio_venta * detalle_pedido.cantidad) + ((producto.precio_venta * detalle_pedido.cantidad) * 0.21)) AS "Total Facturado" FROM producto INNER JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto;

-- 16. La misma información que en la pregunta anterior, pero agrupada por código de producto.
SELECT producto.codigo_producto, SUM((producto.precio_venta * detalle_pedido.cantidad)) AS "Base Imponible", SUM(((producto.precio_venta * detalle_pedido.cantidad) * 0.21)) AS "I.V.A.", SUM(((producto.precio_venta * detalle_pedido.cantidad) + ((producto.precio_venta * detalle_pedido.cantidad) * 0.21))) AS "Total Facturado" FROM producto INNER JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto GROUP BY producto.codigo_producto ORDER BY producto.codigo_producto ASC;

-- 17. La misma información que en la pregunta anterior, pero agrupada por código de producto filtrada por los códigos que empiecen por OR.
SELECT producto.codigo_producto, SUM((producto.precio_venta * detalle_pedido.cantidad)) AS "Base Imponible", SUM(((producto.precio_venta * detalle_pedido.cantidad) * 0.21)) AS "I.V.A.", SUM(((producto.precio_venta * detalle_pedido.cantidad) + ((producto.precio_venta * detalle_pedido.cantidad) * 0.21))) AS "Total Facturado" FROM producto INNER JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto GROUP BY producto.codigo_producto HAVING producto.codigo_producto LIKE "OR%" ORDER BY producto.codigo_producto ASC;

-- 18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, 
-- total facturado y total facturado con impuestos (21% IVA)
SELECT producto.codigo_producto, producto.nombre, COUNT(producto.codigo_producto) AS "Cantidad vendida", SUM((producto.precio_venta * detalle_pedido.cantidad)) AS "Base Imponible", SUM(((producto.precio_venta * detalle_pedido.cantidad) * 0.21)) AS "I.V.A.", SUM(((producto.precio_venta * detalle_pedido.cantidad) + ((producto.precio_venta * detalle_pedido.cantidad) * 0.21))) AS Total_Facturado FROM producto INNER JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto GROUP BY producto.codigo_producto HAVING Total_facturado > 3000 ORDER BY producto.codigo_producto ASC;



						-- Subconsultas con operadores básicos de comparación
                    
-- 1. Devuelve el nombre del cliente con mayor límite de crédito.
SELECT * FROM cliente WHERE limite_credito =(SELECT MAX(limite_credito) FROM cliente);

-- 2. Devuelve el nombre del producto que tenga el precio de venta más caro.
SELECT nombre FROM producto WHERE precio_venta = (SELECT MIN(precio_venta) FROM producto);

-- 3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta que tendrá que calcular cuál es el 
-- número total de unidades que se han vendido de cada producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa 
-- cuál es el código del producto, puede obtener su nombre fácilmente.)
SELECT nombre FROM producto WHERE producto.codigo_producto = (SELECT codigo_producto FROM(SELECT SUM(cantidad) AS cantidad_vendida, codigo_producto FROM detalle_pedido GROUP BY codigo_producto ORDER BY cantidad_vendida DESC LIMIT 1) AS sumatoria);

-- 4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar INNER JOIN).
SELECT cliente.codigo_cliente, cliente.nombre_cliente, cliente.limite_credito, suma_pago.suma_pagos FROM cliente, (SELECT SUM(total) AS suma_pagos, codigo_cliente FROM pago GROUP BY codigo_cliente) AS suma_pago WHERE cliente.limite_credito > suma_pago.suma_pagos AND cliente.codigo_cliente = suma_pago.codigo_cliente;

-- 5. Devuelve el producto que más unidades tiene en stock.
SELECT nombre, codigo_producto, cantidad_en_stock FROM producto WHERE cantidad_en_stock = (SELECT MAX(cantidad_en_stock) FROM producto);

-- 6. Devuelve el producto que menos unidades tiene en stock.
SELECT nombre, codigo_producto, cantidad_en_stock FROM producto WHERE cantidad_en_stock = (SELECT MIN(cantidad_en_stock) FROM producto);

-- 7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto Soria.
SELECT nombre, CONCAT(apellido1, " ", apellido2) FROM empleado WHERE empleado.codigo_jefe = (SELECT codigo_empleado FROM empleado WHERE nombre = "Alberto" AND apellido1 = "Soria");


								-- Subconsultas con ALL y ANY
-- 1. Devuelve el nombre del cliente con mayor límite de crédito.
SELECT nombre_cliente  FROM cliente WHERE limite_credito = ANY (SELECT MAX(limite_credito) FROM cliente);
SELECT nombre_cliente  FROM cliente WHERE limite_credito = ALL (SELECT MAX(limite_credito) FROM cliente);

-- 2. Devuelve el nombre del producto que tenga el precio de venta más caro.
SELECT nombre FROM producto WHERE precio_venta = ANY (SELECT MAX(precio_venta) FROM producto);
SELECT nombre FROM producto WHERE precio_venta = ALL (SELECT MAX(precio_venta) FROM producto);

-- 3. Devuelve el producto que menos unidades tiene en stock.
SELECT * FROM producto WHERE cantidad_en_stock = ANY (SELECT MIN(cantidad_en_stock) FROM producto);
SELECT * FROM producto WHERE cantidad_en_stock = ALL (SELECT MIN(cantidad_en_stock) FROM producto);

								-- Subconsultas con IN y NOT IN
-- 1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún cliente.
SELECT nombre, CONCAT(apellido1, apellido2) AS Apellidos, puesto FROM empleado WHERE codigo_empleado NOT IN (SELECT C.codigo_empleado_rep_ventas FROM cliente C INNER JOIN empleado E ON C.codigo_empleado_rep_ventas = E.codigo_empleado);
SELECT nombre, CONCAT(apellido1, apellido2) AS Apellidos, puesto FROM empleado WHERE codigo_empleado NOT IN (SELECT DISTINCT codigo_empleado_rep_ventas FROM cliente);

-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT * FROM cliente WHERE codigo_cliente NOT IN(SELECT DISTINCT codigo_cliente FROM pago);

-- 3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
SELECT * FROM cliente WHERE codigo_cliente IN(SELECT DISTINCT codigo_cliente FROM pago);

-- 4. Devuelve un listado de los productos que nunca han aparecido en un pedido.
SELECT * FROM producto WHERE codigo_producto NOT IN(SELECT DISTINCT codigo_producto FROM detalle_pedido ORDER BY codigo_pedido);

-- 5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que no sean representante de ventas de ningún cliente.
SELECT nombre, CONCAT(apellido1, apellido2) AS Apellidos,puesto, extension FROM empleado WHERE puesto  NOT LIKE 'Representante Ventas' AND codigo_empleado NOT IN (SELECT DISTINCT codigo_empleado_rep_ventas FROM cliente);

								-- Subconsultas con EXISTS y NOT EXISTS
-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT * FROM cliente WHERE NOT EXISTS(SELECT * FROM pago WHERE cliente.codigo_cliente = pago.codigo_cliente);

-- 2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
SELECT * FROM cliente WHERE EXISTS(SELECT * FROM pago WHERE cliente.codigo_cliente = pago.codigo_cliente);

-- 3. Devuelve un listado de los productos que nunca han aparecido en un pedido.
SELECT * FROM producto WHERE NOT EXISTS(SELECT* FROM detalle_pedido WHERE detalle_pedido.codigo_producto = producto.codigo_producto);

-- 4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.
SELECT * FROM producto WHERE EXISTS(SELECT* FROM detalle_pedido WHERE detalle_pedido.codigo_producto = producto.codigo_producto);
