class Person {
    protected String name;

    void showInfo() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    Student(String name) {
        this.name = name;
    }

    @Override
    void showInfo() {
        System.out.println("I am " + name + ", a student.");
    }

    void sendMessage() {
        System.out.println("Message sent to teacher.");
    }

    void sendMessage(String msg) {
        System.out.println("Message sent to teacher: " + msg);
    }
}

class Teacher extends Person {
    Teacher(String name) {
        this.name = name;
    }

    @Override
    void showInfo() {
        System.out.println("I am " + name + ", sa teacher.");
    }

    void sendMessage() {
        System.out.println("Message sent to student.");
    }

    void sendMessage(String msg) {
        System.out.println("Message sent to student: " + msg);
    }
}

public class SmartSchoolSystem {
    public static void main(String[] args) {
        Person p1 = new Student("Lester");
        Person p2 = new Teacher("Mr. Cruz");

        p1.showInfo();
        p2.showInfo();

        Student s1 = new Student("Lester");
        s1.sendMessage();
        s1.sendMessage("Can I submit my project tomorrow?");
    }
}
