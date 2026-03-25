USE company1;
CREATE TABLE jobs (
	job_id INT PRIMARY KEY NOT NULL,
    job_title VARCHAR(45) NOT NULL,
    min_salary DECIMAL,
    max_salary DECIMAL
);



USE company1;
CREATE TABLE departments (
	department_id INT PRIMARY KEY,
    department_name VARCHAR(45) NOT NULL,
    location_id INT
);



use company1;
create table dependents (
	dependent_id INT PRIMARY KEY,
    first_name VARCHAR(45),
    last_name VARCHAR(45),
    relationship VARCHAR(45),
    employee_id INT 
);



use company1;
create table regions (
	region_id INT PRIMARY KEY,
    region_name VARCHAR(45)
);



use company1;
create table countires (
	country_iD int primary key,
    country_name varchar(45),
    region_id int
);



use company1;
create table locations (
	location_id int primary key,
    street_address varchar(200),
    postal_code int(10),
    city varchar(100),
    state_province varchar(200),
    country_id INT
);



alter table employees
add constraint fk_job
foreign key (job_id)
references jobs (job_id);



describe countries;



alter table dependents
add constraint fk_employee_id
foreign key (employee_id)
references employees (employee_id);



alter table departments
add constraint fk_location_id
foreign key (location_id)
references locations (location_id);



alter table employees
add constraint fk_department_id
foreign key (department_id)
references departments (department_id);



alter table employees
add constraint fk_department_id
foreign key (department_id)
references departments (department_id);



alter table countires
add constraint fk_region_id
foreign key (region_id)
references regions (region_id);



alter table locations
add constraint fk_country_id
foreign key (country_id)
references countries (country_id);


show tables;



alter table employees
add constraint fk_manager
foreign key (manager_id)
references employees (employee_id);



rename table departments to dept;

ALTER TABLE employees
MODIFY salary smallint;

ALTER TABLE employees
ADD commission int;


ALTER TABLE countries
CHANGE country_iD country_id char(2);

ALTER TABLE locations
MODIFY country_id char(2);


ALTER TABLE locations
drop foreign key fk_country_id;

ALTER TABLE employees
drop foreign key fk_manager;

-- Disable safe update mode for this session
SET SQL_SAFE_UPDATES = 0;

-- Delete all rows
DELETE FROM dependents;

-- Re-enable safe updates if you want
SET SQL_SAFE_UPDATES = 1;

ALTER TABLE employees
MODIFY phone_no VARCHAR(20) UNIQUE;


select * from regions;
describe employees;
