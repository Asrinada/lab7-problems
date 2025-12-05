public class Student {
    int age;
    String name;

    // Default constructor (manually)
    public Student(){
        this.age = 22;
        this.name = "Std name";
    }

    /* Parameterized constructor
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    */

    public void printYourName(){
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
    }
}