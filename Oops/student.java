package Oops;

public class student {
    public int id;
    public int age;
    public String name;
    public int nos;


    public static void study(){
        System.out.println("Student is studiying");
    }
    public static void sleep(){
        System.out.println("Student is sleeping");
    }

    static void main(String[] args) {
        student s1 = new student();
        s1.name="chirag";
        s1.id= 33;
        s1.age=44;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.id);

        

    }
}

