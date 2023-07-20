USE pokemondb;
show tables; -- TE MUESTRA LA TABLAS CREADAS

																-- A continuación, se deben realizar las siguientes consultas:
            
-- 1. Mostrar el nombre de todos los pokemon.
SELECT * FROM pokemon;

-- 2. Mostrar los pokemon que pesen menos de 10k.
SELECT * FROM pokemon WHERE peso > 10;

-- 3. Mostrar los pokemon de tipo agua.
SELECT * FROM pokemon WHERE numero_pokedex IN (SELECT numero_pokedex FROM pokemon_tipo WHERE id_tipo =(SELECT id_tipo FROM tipo WHERE nombre like'Agua'));
SELECT p.*, t.nombre  FROM pokemon p INNER JOIN pokemon_tipo pt INNER JOIN tipo t ON p.numero_pokedex = pt.numero_pokedex AND pt.id_tipo = t.id_tipo WHERE t.nombre = ("agua") ;

-- 4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
SELECT * FROM pokemon WHERE numero_pokedex IN (SELECT numero_pokedex FROM pokemon_tipo WHERE id_tipo IN (SELECT id_tipo FROM tipo WHERE nombre IN ("agua", "fuego", "tierra")));
SELECT p.nombre, t.nombre  FROM pokemon p INNER JOIN pokemon_tipo pt INNER JOIN tipo t ON p.numero_pokedex = pt.numero_pokedex AND pt.id_tipo = t.id_tipo WHERE t.nombre IN ("agua", "fuego", "tierra") ORDER BY t.nombre;

-- 5. Mostrar los pokemon que son de tipo fuego y volador.
SELECT p.nombre,t.nombre FROM pokemon p INNER JOIN pokemon_tipo pt INNER JOIN tipo t ON p.numero_pokedex = pt.numero_pokedex AND pt.id_tipo = t.id_tipo WHERE t.nombre IN ( "fuego", "volador") ;
SELECT * FROM pokemon WHERE numero_pokedex IN (SELECT numero_pokedex FROM pokemon_tipo WHERE id_tipo IN (SELECT id_tipo FROM tipo WHERE nombre IN ("fuego", "volador")));

-- 6. Mostrar los pokemon con una estadística base de ps mayor que 200.
SELECT * FROM pokemon WHERE numero_pokedex IN (SELECT numero_pokedex FROM estadisticas_base WHERE ps > 200);
select p.*, eb.ps FROM pokemon p Join estadisticas_base eb ON p.numero_pokedex = eb.numero_pokedex Where ps > 200;

-- 7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
SELECT * FROM pokemon WHERE numero_pokedex =(SELECT pokemon_origen FROM evoluciona_de WHERE pokemon_evolucionado =(SELECT numero_pokedex FROM pokemon WHERE nombre LIKE 'Arbok'));

-- 8. Mostrar aquellos pokemon que evolucionan por intercambio.
SELECT * FROM pokemon WHERE numero_pokedex IN (SELECT numero_pokedex FROM pokemon_forma_evolucion WHERE id_forma_evolucion = (SELECT id_tipo_evolucion FROM tipo_evolucion WHERE tipo_evolucion LIKE 'Intercambio'));

-- 9. Mostrar el nombre del movimiento con más prioridad.
SELECT * FROM movimiento WHERE prioridad = (SELECT MAX(prioridad) FROM movimiento);

-- 10. Mostrar el pokemon más pesado.
SELECT * FROM pokemon WHERE peso = (SELECT MAX(peso) FROM pokemon);

-- 11. Mostrar el nombre y tipo del ataque con más potencia.
SELECT * FROM movimiento WHERE potencia = (SELECT MAX(potencia) FROM movimiento);

-- 12. Mostrar el número de movimientos de cada tipo.
SELECT COUNT(id_tipo)AS 'Cantidad de ataque(s)' , id_tipo AS 'Ataque' FROM movimiento GROUP BY id_tipo;

-- 13. Mostrar todos los movimientos que puedan envenenar.
SELECT * FROM movimiento WHERE descripcion LIKE '%envenena%';

-- 14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
SELECT * FROM movimiento WHERE descripcion LIKE '%causa daño%' ORDER BY nombre;

-- 15. Mostrar todos los movimientos que aprende pikachu.
SELECT ('pikachu') AS 'Nombre Pokemon', nombre AS 'Movimiento' FROM movimiento WHERE id_movimiento IN (SELECT id_movimiento FROM pokemon_movimiento_forma WHERE numero_pokedex =(SELECT numero_pokedex FROM pokemon WHERE nombre LIKE 'pikachu'));
SELECT DISTINCT m.nombre FROM pokemon p INNER JOIN pokemon_movimiento_forma pmf ON p.numero_pokedex = pmf.numero_pokedex INNER JOIN movimiento m ON pmf.id_movimiento = m.id_movimiento WHERE p.nombre = 'pikachu';

-- 16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
SELECT p.*, m.nombre AS 'Ataque', mt.MT FROM pokemon p INNER JOIN pokemon_movimiento_forma pmf ON p.numero_pokedex = pmf.numero_pokedex INNER JOIN movimiento m ON pmf.id_movimiento = m.id_movimiento INNER JOIN mt ON mt.id_forma_aprendizaje = pmf.id_forma_aprendizaje WHERE p.nombre = 'pikachu';

-- 17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
SELECT p.*, m.nombre AS 'Movimiento', t.nombre AS 'Tipo' FROM pokemon p INNER JOIN pokemon_movimiento_forma pmf ON p.numero_pokedex = pmf.numero_pokedex INNER JOIN movimiento m ON m.id_movimiento = pmf.id_movimiento INNER JOIN mt ON pmf.id_forma_aprendizaje = mt.id_forma_aprendizaje INNER JOIN tipo t ON t.id_tipo = m.id_tipo WHERE t.nombre = "normal" AND p.nombre = "pikachu";

-- 18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
SELECT * FROM efecto_secundario WHERE id_efecto_secundario IN (SELECT id_efecto_secundario FROM movimiento_efecto_secundario WHERE probabilidad > 30) ;

-- 19. Mostrar todos los pokemon que evolucionan por piedra.
SELECT * FROM pokemon WHERE numero_pokedex IN (SELECT numero_pokedex FROM pokemon_forma_evolucion WHERE id_forma_evolucion IN (SELECT id_forma_evolucion FROM forma_evolucion WHERE tipo_evolucion = (SELECT id_tipo_evolucion FROM tipo_evolucion WHERE tipo_evolucion LIKE 'Piedra')));
SELECT p.* FROM pokemon p INNER JOIN pokemon_forma_evolucion pfe ON P.numero_pokedex = pfe.numero_pokedex INNER JOIN forma_evolucion fe ON pfe.id_forma_evolucion = fe.id_forma_evolucion INNER JOIN tipo_evolucion te ON te.id_tipo_evolucion = fe.tipo_evolucion WHERE te.tipo_evolucion LIKE 'Piedra';

-- 20. Mostrar todos los pokemon que no pueden evolucionar.
SELECT * FROM pokemon WHERE nombre IN (SELECT nombre FROM pokemon_no_evolucionan);
SELECT p.* FROM pokemon p INNER JOIN pokemon_no_evolucionan pne ON p.numero_pokedex = pne.numero_pokedex;

-- 21. Mostrar la cantidad de los pokemon de cada tipo.
SELECT t.nombre, COUNT(t.id_tipo) AS 'Cantidad' FROM pokemon p INNER JOIN pokemon_tipo pt ON p.numero_pokedex = pt.numero_pokedex INNER JOIN tipo t ON pt. id_tipo =t.id_tipo GROUP BY t.nombre ORDER BY t.nombre;
