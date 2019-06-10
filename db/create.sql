-- Primero, crear el usuario webapp (ver webapp.sql)

-- Luego, crear la base de datos
CREATE DATABASE myfirstlogin;

-- Otorgar permisos al administrador de BD y a la aplicación REST
GRANT ALL ON DATABASE myfirstlogin TO postgres;
GRANT CONNECT ON DATABASE myfirstlogin TO webapp;

-- Crear tablas
CREATE TABLE mfl_user (
    user_id SERIAL NOT NULL PRIMARY KEY,
    username VARCHAR(64) NOT NULL,
    hash VARCHAR(128) NOT NULL,
    fullname VARCHAR(128) NOT NULL,
    email VARCHAR(128) NOT NULL
);

-- Otorgar permisos a la aplicación REST
GRANT USAGE ON SCHEMA public TO webapp;
GRANT SELECT ON ALL TABLES IN SCHEMA public TO webapp;
GRANT INSERT ON ALL TABLES IN SCHEMA public TO webapp;
GRANT UPDATE ON ALL TABLES IN SCHEMA public TO webapp;
GRANT DELETE ON ALL TABLES IN SCHEMA public TO webapp;

-- Por último, insertar los datos iniciales (ver el resto de archivos SQL)
