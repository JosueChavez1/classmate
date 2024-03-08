USE amarstudio;

/*Insert Usuario*/
INSERT INTO usuario(nombreUsuario, contrasenia)
			VALUES ("admin", "admin");

/*Insert planes*/
INSERT INTO plan(nombrePlan,precio,capacidad,descripcion,estatus)
			VALUES("individual",1200.00,1,"Clase de canto individual",1);

/*Insert Clases*/
INSERT INTO clase(nombreClase,dia,horaInicio,horaFin,estatus,idPlan)
		VALUES("Clase Individual","Lunes",'17:00:00','17:50:00',1,1);

/*Insert Alumnos*/
INSERT INTO alumno(nombre,apellidoPaterno,apellidoMaterno,fechaNacimiento,fechaRegistro,correo,telefono,estatus,idClase)
			VALUES("Cristian","Rizo","Gomez","2003-02-13","2024-02-29","rizo@gmail.com","4771237896",1,1);

/*Insert pagos*/


/*Procedimientos almacenados*/