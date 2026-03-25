public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name :" + name + " Age :" + age);
    }

    public static void main(String args[]) {
        Student[] students;
        students = new Student[3];
        students[0] = new Student("alice", 20);
        students[1] = new Student("roy", 21);
        students[2] = new Student("raj", 31);

        for (int i = 0; i < 3; i++) {
            students[i].display();
        }
    }
}
