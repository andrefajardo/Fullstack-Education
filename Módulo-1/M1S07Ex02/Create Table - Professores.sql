-- Database: education

-- DROP DATABASE IF EXISTS education;

CREATE DATABASE education
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

COMMENT ON DATABASE education
    IS 'Base de dados para os exercícios do M1S07.';
	
CREATE TABLE teachers (
	id_teacher bigserial PRIMARY KEY,
	teacher_name varchar(150) NOT NULL,
	teacher_specialty  char(20) NOT NULL
);	

