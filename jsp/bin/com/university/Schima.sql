
CREATE DATABASE IF NOT EXISTS university_db;
USE university_db;


CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100)
);


CREATE TABLE courses (
    course_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    instructor VARCHAR(100),
    credits INT
);

CREATE TABLE registrations (
    reg_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    course_id INT,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);


INSERT INTO students (name, email, password) VALUES
('Alice', 'alice@example.com', 'Asv55#%5'),
('Bob', 'bob@example.com', 'pW@&54U%');


INSERT INTO courses (name, instructor, credits) VALUES
('Java Programming', 'Dr. Smith', 4),
('Database Systems', 'Dr. Clark', 3),
('Web Development', 'Prof. Jones', 3);
