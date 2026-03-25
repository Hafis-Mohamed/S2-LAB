class Person {
    String name;
    String gender;
    String address;
    Integer age;

    Person(String name,String gender,String address,Integer age){
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
}

class Employee extends Person{
    Integer empid;
    String company_name;
    String qualification;
    Integer salary;

    Employee(String name,String gender,String address,Integer age,Integer empid,String company_name,String qualification,Integer salary){
        super(name,gender,address,age);
        this.empid=empid;
        this.company_name=company_name;
        this.qualification=qualification;
        this.salary=salary;
    }
}

class Teacher1 extends Employee{
    Integer teacherid;
    String subject;
    String department;

    Teacher1(String name,String gender,String address,Integer age,Integer empid,String company_name,String qualification,Integer salary,Integer teacherid,String department,String subject){
        super(name,gender,address,age,empid,company_name,qualification,salary);
        this.teacherid=teacherid;
        this.subject=subject;
        this.department=department;
    }

    void display(){
        System.out.println("\nName :"+name+" Gender :"+gender+" Address :"+address+" Age :"+age);
        System.out.println("EmpID :"+empid+" Company Name :"+company_name+" Qualification :"+qualification+" Salary :"+salary);
        System.out.println("TeacherID :"+teacherid+" Department :"+department+" Subject :"+subject+"\n");
    }

    public static void main(String[] args){
        Teacher1[] teachers=new Teacher1[3];
        teachers[0]=new Teacher1("Anita Sharma","Female","Delhi",35,1001,"ABC School","M.Ed",50000,201,"Science","Physics");
        teachers[1]=new Teacher1("Rahul Verma","Male","Mumbai",40,1002,"XYZ Academy","M.Sc",55000,202,"Mathematics","Algebra");
        teachers[2]=new Teacher1("Sneha Iyer","Female","Chennai",30,1003,"Global School","B.Ed",48000,203,"English","Literature");

        for(Integer i=0;i<3;i++){
            teachers[i].display();
        }
    }
}