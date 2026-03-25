import java.util.Scanner;

class Employee {
    Integer empid;
    String name;
    Integer salary;
    String address;

    Employee(Integer empid,String name,Integer salary,String address){
        this.empid=empid;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
}

public class Teacher extends Employee{
    String dept;
    String subject;

    Teacher(Integer empid,String name,Integer salary,String address,String dept,String subject){
        super(empid,name,salary,address);
        this.dept=dept;
        this.subject=subject;
    }

    void display(){
        System.out.print("EmpID :"+empid+"\tName :"+name+"\tSalary :"+salary+"\nAddress :"+address+"\tDepartment :"+dept+"\tSubject :"+subject);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of teachers:");
        Integer n=sc.nextInt();
        Teacher[] teachers=new Teacher[n];
        for(Integer i=0;i<n;i++){
            System.out.print("\nTeacher "+(i+1));
            System.out.print("\nEmpid :");
            Integer em=sc.nextInt();
            sc.nextLine();
            System.out.print("Name :");
            String nm=sc.nextLine();
            System.out.print("Salary :");
            Integer s=sc.nextInt();
            sc.nextLine();
            System.out.print("Address :");
            String add=sc.nextLine();
            System.out.print("Department :");
            String d=sc.nextLine();
            System.out.print("Subject :");
            String sub=sc.nextLine();

            teachers[i]=new Teacher(em,nm,s,add,d,sub);
        }
        System.out.println(".......TEACHERS......");
        for(int i=0;i<n;i++){
            System.out.println("\n\tTeacher\t"+(i+1));
            teachers[i].display();
        }
        sc.close();
    }
}