class student{
    String name;
    int age;

    public void write(){
        System.out.println("I am writing");
    }

    student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("Name: " + name + " Age: " + age);
    }

}

public class first1 {
    public static void main(String[] args) {
        student s1 = new student("shivam",20);
        // s1.name = "Rahul";
        // s1.age = 20;
        // s1.write();
        s1.print();
    }
}

