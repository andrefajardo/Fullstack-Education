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

INSERT INTO courses (course_name, course_description, course_workload)
VALUES ('Front-End', 'Especialização em desenvolvimento Front-End', 400.00);

INSERT INTO courses (course_name, course_description, course_workload)
VALUES ('Back-End', 'Especialização em desenvolvimento Back-End', 400.00);

INSERT INTO courses (course_name, course_description, course_workload)
VALUES ('Fullstack', 'Especialização em desenvolvimento Fullstack', 1000.00);

ALTER TABLE teachers
ADD id_course bigint;

ALTER TABLE teachers
ADD CONSTRAINT teachers_id_course_fkey
FOREIGN KEY (id_course) REFERENCES courses(id_course);

select * from courses;
select * from teachers;

UPDATE teachers 
SET id_course = 1
WHERE teacher_name LIKE 'Rayane';

UPDATE teachers 
SET id_course = 2
WHERE teacher_name LIKE 'Gabriel';

UPDATE teachers 
SET id_course = 2
WHERE teacher_name LIKE 'André';

UPDATE teachers 
SET id_course = 3
WHERE teacher_name LIKE 'Eduardo';

UPDATE teachers 
SET id_course = 3
WHERE teacher_name LIKE 'Ícaro';
