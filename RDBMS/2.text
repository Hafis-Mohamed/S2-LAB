-- 1. display all countries
select country_name from countries;

-- 2. display email and phone no of employees
select email,phone_no from employees;

-- 3. display employee whose last_name is "Fay"
select * from employees where last_name="Fay"; 

-- 4. find hire date of employee whose last_name is "Grant" or "Whalen"
select last_name,hire_date from employees where last_name="Grant" or last_name="Whalen";

-- 5. display name of employee who is shipping clerk
SELECT e.first_name, e.last_name, j.job_title
FROM employees e
JOIN jobs j
  ON e.job_id = j.job_id
WHERE j.job_title = 'shipping clerk';

-- 6. display employees work for dept 8
select * from employees where department_id=8;

-- 7. display departments in descending order
select * from dept order by department_id ASC;

-- 8. display employees whose last_name starts wuith "K"
select * from employees where last_name like "K%";

-- 9. display name of employees where their hide_date are between 1995 and 1997
select first_name,last_name,hire_date from employees where hire_date between '1995-01-01' and '1997-12-31';

-- 10. display jobs where maximum salary is less than 5000
select job_title,max_salary from jobs where max_salary < 5000;

-- 11. display email addresses in lowercase
select lower(email) from employees;

-- 12. display name of employees hired in 1995
select first_name,last_name,hire_date from employees where hire_date like "1995%";

-- 13. insert employee 'paul newton' in department 11
insert into employees(employee_id,email,first_name,last_name,department_id,job_id) values(250,'paulnewton@gmail.com','Paul','Newton',11,1);
select * from dept;
-- 14. delete shipping department
UPDATE employees
SET department_id = 2   -- existing department
WHERE department_id = 5;

SET SQL_SAFE_UPDATES = 0;
delete from dept where department_name="shipping";
SET SQL_SAFE_UPDATES = 1;

select* from dept;