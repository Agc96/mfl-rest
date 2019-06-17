-- TODO: Reemplazar 'hash' por las contraseñas debidamente hasheadas
-- TODO: Reemplazar 'email' por el correo electrónico del usuario

INSERT INTO MYFIRSTLOGIN.MFL_USUARIO (NOMBRE_USUARIO, HASH, NOMBRE_COMPLETO, CORREO, FECHA_CREACION, USUARIO_CREACION)
	VALUES ('agutierrez', 'hash', 'Anthony Gutierrez', 'email', NOW(), 'agutierrez');

INSERT INTO MYFIRSTLOGIN.MFL_USUARIO (NOMBRE_USUARIO, HASH, NOMBRE_COMPLETO, CORREO, FECHA_CREACION, USUARIO_CREACION)
	VALUES ('equispe', 'hash', 'Eder Quispe', 'email', NOW(), 'agutierrez');

INSERT INTO MYFIRSTLOGIN.MFL_USUARIO (NOMBRE_USUARIO, HASH, NOMBRE_COMPLETO, CORREO, FECHA_CREACION, USUARIO_CREACION)
	VALUES ('otheo', 'hash', 'Otto Theo', 'email', NOW(), 'agutierrez');

INSERT INTO MYFIRSTLOGIN.MFL_USUARIO (NOMBRE_USUARIO, HASH, NOMBRE_COMPLETO, CORREO, FECHA_CREACION, USUARIO_CREACION)
	VALUES ('dzhou', 'hash', 'David Zhou', 'email', NOW(), 'agutierrez');
