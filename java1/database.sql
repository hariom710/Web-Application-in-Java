-- Create the database
CREATE DATABASE IF NOT EXISTS employee_db;
USE employee_db;

-- Create employees table
CREATE TABLE IF NOT EXISTS employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insert sample employee data
INSERT INTO employees (username, password, first_name, last_name, email) VALUES
('john.doe', 'password123', 'John', 'Doe', 'john.doe@example.com'),
('jane.smith', 'password456', 'Jane', 'Smith', 'jane.smith@example.com'); 