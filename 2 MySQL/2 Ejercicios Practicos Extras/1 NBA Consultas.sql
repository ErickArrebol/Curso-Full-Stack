/*Abrir el script de la base de datos llamada “nba.sql” y ejecutarlo para crear todas las tablas e
insertar datos en las mismas. A continuación, generar el modelo de entidad relación. Deberá
obtener un diagrama de entidad relación igual al que se muestra a continuación:*/
use nba;
SELECT * FROM  jugadores;
SELECT * FROM  equipos;
SELECT * FROM  estadisticas;
SELECT * FROM partidos;

				-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:
-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT nombre FROM jugadores ORDER BY nombre ;
-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
SELECT * FROM jugadores WHERE posicion LIKE 'C' AND peso >200 ORDER BY nombre ;
-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT nombre FROM equipos ORDER BY nombre;
-- 4. Mostrar el nombre de los equipos del este (East).
SELECT nombre,conferencia FROM equipos WHERE conferencia LIKE 'East';
-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT nombre,ciudad FROM equipos WHERE ciudad LIKE 'c%';
-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT nombre,Nombre_equipo FROM jugadores ORDER BY Nombre_equipo;
-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
SELECT nombre,Nombre_equipo fROM jugadores WHERE Nombre_equipo LIKE 'Raptors';
-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT e.Puntos_por_partido FROM jugadores j INNER JOIN estadisticas e ON jugadores.codigo = e.jugador WHERE jugadores.Nombre = 'Pau Gasol';
SELECT j.Nombre ,e.Puntos_por_partido FROM jugadores j, estadisticas e WHERE j.codigo = e.jugador AND e.jugador=(SELECT DISTINCT codigo FROM jugadores WHERE Nombre LIKE 'Pau Gasol');
-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT estadisticas.Puntos_por_partido FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador WHERE jugadores.Nombre = 'Pau Gasol' AND estadisticas.temporada = '04/05';
SELECT Puntos_por_partido FROM estadisticas WHERE jugador = ( SELECT codigo FROM jugadores WHERE Nombre = 'Pau Gasol') AND temporada = '04/05';
-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT Nombre, (SELECT SUM(Puntos_por_partido)FROM estadisticas WHERE jugador = codigo) AS Puntos_totales FROM jugadores ;
-- 11. Mostrar el número de jugadores de cada equipo.
SELECT nombre_equipo,COUNT(nombre_equipo) as 'cantidad' from jugadores group by nombre_equipo;
-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT jugadores.nombre AS 'Jugador',(SELECT ROUND(SUM(Puntos_por_partido)) FROM estadisticas WHERE jugador = codigo) AS 'Puntos Totales' FROM jugadores ORDER BY (SELECT ROUND(SUM(Puntos_por_partido)) FROM estadisticas WHERE jugador = codigo) DESC Limit 1;
-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.}
SELECT Nombre AS 'Nombre Equipo', Conferencia, Division FROM equipos WHERE Nombre = (SELECT Nombre_equipo As 'Nombre del Equipo' FROM jugadores WHERE Altura = (SELECT  MAX(Altura) FROM jugadores));
-- 14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
SELECT Nombre FROM equipos WHERE Division LIKE 'Pacific';
SELECT AVG(puntos_local + puntos_visitante) AS 'Media de Puntos ' FROM partidos WHERE puntos_local IN (SELECT Nombre FROM equipos WHERE Division LIKE 'Pacific') OR equipo_visitante IN (SELECT Nombre FROM equipos WHERE Division = 'Pacific');
-- 15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT (puntos_local - puntos_visitante) AS Diferencia FROM partidos WHERE (puntos_local  -puntos_visitante) >0 ORDER BY Diferencia DESC;
SELECT (puntos_visitante - puntos_local) AS Diferencia FROM partidos  WHERE (puntos_visitante - puntos_local) >0 ORDER BY Diferencia DESC;

SELECT MAX(ABS(puntos_local - puntos_visitante))FROM partidos;

SELECT p.*, (SELECT MAX(ABS(puntos_local - puntos_visitante))FROM partidos) AS 'Diferencias'
FROM partidos p
WHERE CASE
        WHEN (puntos_local - puntos_visitante) < 0 THEN (puntos_visitante - puntos_local)
        ELSE (puntos_local - puntos_visitante)
      END = (SELECT MAX(ABS(puntos_local - puntos_visitante))
            FROM partidos);
-- 16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
SELECT AVG(puntos_local + puntos_visitante)AS 'Media de Puntos ', division FROM partidos  p INNER JOIN equipos e ON e.nombre = p.equipo_local OR e.nombre = p.equipo_visitante WHERE e.division = "Pacific";
-- 17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.
SELECT equipo_local AS 'Equipo Local', puntos_local, equipo_visitante AS 'Equipo visitante', puntos_visitante FROM partidos  p INNER JOIN equipos e ON p.equipo_local = e.nombre;
-- 18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
SELECT * FROM partidos WHERE puntos_local =puntos_visitante;
SELECT codigo, equipo_local, equipo_visitante, IF(puntos_local > puntos_visitante, equipo_local, IF(puntos_local < puntos_visitante, equipo_visitante, NULL)) AS equipo_ganador FROM partidos;
