USE amarstudio;

/*-----Procedimiento para agregar un Alumno------------------*/
DROP PROCEDURE InsertarAlumno;
DELIMITER //
CREATE PROCEDURE InsertarAlumno(
    IN nombre_alumno VARCHAR(50), -- 1
    IN apellido_paterno VARCHAR(50), -- 2
    IN apellido_materno VARCHAR(50),-- 3
    IN fecha_nacimiento DATE,-- 4
    IN fecha_registro DATE,-- 5
    IN correo VARCHAR(50), -- 6
    IN telefono VARCHAR(50),-- 7
    IN id_clase INT, -- 8
	OUT id_alumno INT -- 9 OUT
)
BEGIN
    DECLARE monto_pago DECIMAL(10, 2);

    -- Obtener el monto del plan asociado a la clase
    SELECT precio INTO monto_pago
    FROM plan
    WHERE idPlan = (SELECT idPlan FROM clase WHERE idClase = id_clase);

    -- Insertar el nuevo alumno
    INSERT INTO alumno (nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, fechaRegistro, correo, telefono, idClase)
    VALUES (nombre_alumno, apellido_paterno, apellido_materno, fecha_nacimiento, fecha_registro, correo, telefono, id_clase);

    -- Obtener el ID del último alumno insertado
    SET id_alumno = LAST_INSERT_ID();

    -- Insertar el registro de pago para el nuevo alumno
    INSERT INTO pago (fechaPago, monto, estatus, idAlumno)
    VALUES (CURDATE(), monto_pago, 1, id_alumno);

END //
DELIMITER ;
CALL InsertarAlumno('Eber', 'Olivares', 'Gutierrez', '2000-01-01','2024-01-01', 'correo@example.com', '123456789', 1,@idAlumno);
/*Revisar que se haya hecho lo esperado*/
SELECT * FROM alumno;
SELECT * FROM pago;

/*------Insertar una nueva clase-------------*/
DELIMITER //
CREATE PROCEDURE InsertarClase(
    IN nombre_clase VARCHAR(50),
    IN dia VARCHAR(8),
    IN hora_inicio TIME,
    IN hora_fin TIME,
    IN id_plan INT
)
BEGIN
    DECLARE clase_existente INT;

    -- Verificar si ya existe una clase con las mismas condiciones
    SELECT COUNT(*)
    INTO clase_existente
    FROM clase
    WHERE dia = dia
    AND ((hora_inicio >= horaInicio AND hora_inicio < horaFin)
    OR (hora_fin > horaInicio AND hora_fin <= horaFin)
    OR (hora_inicio <= horaInicio AND hora_fin >= horaFin));

    -- Si no hay una clase existente con las mismas condiciones, insertar la nueva clase
    IF clase_existente = 0 THEN
        INSERT INTO clase (nombreClase, dia, horaInicio, horaFin, idPlan, estatus)
        VALUES (nombre_clase, dia, hora_inicio, hora_fin, id_plan, 1); -- 1 para activo
        SELECT 'La clase ha sido insertada exitosamente.' AS Mensaje;
    ELSE
        SELECT 'Ya existe una clase con las mismas condiciones de día y horario.' AS Mensaje;
    END IF;
END //
DELIMITER ;
CALL InsertarClase('Clase individual1', 'Lunes', '18:30:00', '17:55:00', 1);


/*----Insertar un nuevo plan-----------------------------------*/
DROP PROCEDURE insertarPlan;
DELIMITER //
CREATE PROCEDURE insertarPlan(
    IN nombre_plan VARCHAR(50),
    IN precio DECIMAL(10, 2),
    IN capacidad INT,
    IN descripcion VARCHAR(255)
)
BEGIN
    -- Insertar el nuevo plan
    INSERT INTO plan (nombrePlan, precio, capacidad, descripcion)
    VALUES (nombre_plan, precio, capacidad, descripcion);

END //
DELIMITER ;
CALL insertarPlan("Individual",900.00,1,"Clase de Canto individual, atencion personalizada");
CALL insertarPlan("Parejas",800.00,2,"Clase de Canto en parejas");
CALL insertarPlan("Grupal",700.00,8,"Clase de Canto grupal");

/*---Modificar Usuario-------------------------------*/
DROP PROCEDURE modificarUsuario;
DELIMITER //
CREATE PROCEDURE modificarUsuario(
    IN id_usuario INT,
    IN nuevo_nombre_usuario VARCHAR(25),
    IN nueva_contrasenia VARCHAR(255)
)
BEGIN
    -- Actualizar los datos del usuario
    UPDATE usuario
    SET nombreUsuario = nuevo_nombre_usuario,
        contrasenia = nueva_contrasenia,
        token = nuevo_token
    WHERE idUsuario = id_usuario;

END //

DELIMITER ;






