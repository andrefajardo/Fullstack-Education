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

INSERT INTO teachers (teacher_name, teacher_specialty)
VALUES ('Gabriel', 'Java Developer');

INSERT INTO teachers (teacher_name, teacher_specialty)
VALUES ('André', 'Java Developer');

INSERT INTO teachers (teacher_name, teacher_specialty)
VALUES ('Rayane', 'Angular Developer');

INSERT INTO teachers (teacher_name, teacher_specialty)
VALUES ('Eduardo', 'JavaScript Developer');

INSERT INTO teachers (teacher_name, teacher_specialty)
VALUES ('Icaro', 'Front-end Developer');

-- SELECT * from teachers;

CREATE TABLE courses (
	id_course bigserial PRIMARY KEY,
	course_name char(50) NOT NULL,
	course_description varchar(500) NOT NULL,
	course_workload int NOT NULL
);