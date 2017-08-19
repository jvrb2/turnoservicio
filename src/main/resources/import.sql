-- Turno
insert into turno (servicio) values ('prueba');
insert into turno (servicio) values ('prueba2');
insert into turno (servicio) values ('prueba1');

-- mesas
INSERT INTO `MESA_MESAS` (id,mesa_nombre,mesa_ip) VALUES (1,'Mesa 1','10.3.5.11'),(2,'Mesa 2','10.3.5.12'),(3,'Mesa 3','10.3.5.13'),(4,'Mesa 4','10.3.5.14'),(5,'Mesa 5','10.3.5.15'),(6,'Mesa 6','10.3.5.16'),(7,'Mesa Especial','192.168.56.1'),(8,'rafa','10.3.12.57'),(9,'Mesa 7','10.3.5.17'),(10,'Mesa 8','10.3.5.18'),(11,'Mesa 9','10.3.5.19'),(12,'fct','10.3.5.181'),(13,'Coordinación','10.3.5.20');

--serv_servicios
INSERT INTO `SERV_SERVICIOS` (id,serv_nombre,serv_descripcion,serv_letra,serv_contador) VALUES (1,'Servicio Primera Acogida','SEPRACT',' ',67),(2,'Empleo','EMP',' ',24),(3,'Alimentos','ALM',' ',41);