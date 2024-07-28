package basicsOop;

class student{
    String name;
    int age;

    public void write(){
        System.out.println("I am writing");
    }

}


public class first {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Rahul";
        s1.age = 20;

        s1.write();

    }
}
