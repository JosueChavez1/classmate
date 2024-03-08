USE amarstudio;

DROP VIEW view_alumnos;
CREATE VIEW view_alumnos AS 
SELECT  idAlumno, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, fechaRegistro, correo, telefono, a.estatus,
		c.idClase, nombreClase, dia, horaInicio, horaFin,
        p.idPlan, precio, capacidad, descripcion
FROM alumno a JOIN clase c ON  a.idClase=c.idClase JOIN plan p ON c.idPlan = p.idPlan;

SELECT * FROM view_alumnos;


/*
20:27:58	CREATE VIEW view_alumnos AS  
SELECT nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, fechaRegistro, 
correo, telefono,a.estatus,   c.idClase, nombreClase, dia, horaInicio, horaFin, c.estatus,         
p.idPlan, precio, capacidad, descripcion, p.estatus FROM alumno a JOIN clase c ON  a.idClase=c.idClase JOIN plan p ON c.idPlan = p.idPlan	E
rror Code: 1060. Duplicate column name 'estatus'	0.000 sec

*/