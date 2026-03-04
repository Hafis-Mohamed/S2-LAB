-- creating table STUDENT
create table student(
	name varchar(50),
    student_id int primary key,
    class int,
    major varchar(6)
);

-- creating table COURSE
create table course(
	course_name varchar(100),
    course_number varchar(10) primary key,
    credit_hours int,
    department varchar(6)
);

-- creating table SECTION
create table section(
	section_identifier int primary key,
    course_number varchar(10) ,
    semester varchar(10),
    year int,
    instructor varchar(50),
    foreign key (course_number) references course (course_number)
);

-- creating table GRADE_REPORT
	create table grade_report(
		student_number int,
        section_identifier int,
        grade varchar(5),
        foreign key (student_number) references student (student_id),
        foreign key (section_identifier) references section (section_identifier)
    );
    
    
-- creating table PREREQUISITE
create table prerequisite(
	course_number int,
    prerequisite_number varchar(10),
    foreign key (course_number) references course (course_number)
);