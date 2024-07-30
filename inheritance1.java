public class inheritance1 {
    public static void main(String[] args) {
        Tuna dobby = new  Tuna();
        dobby.eat();
        dobby.color = "Red";
        System.out.println(dobby.color);

        Peacock p1 = new Peacock();
        p1.breath();
        p1.breed = "Indian";
        p1.feather = "Morpankhi";
        System.out.println(p1.feather);
        System.out.println(p1.breed);
    }
}
    class Animal{
        String color;

        void eat(){
            System.out.println("eats");
        }

        void breath(){
            System.out.println("breaths");
        }
    }

    class Mamals extends Animal{
        int legs;

        void speed(){
            System.out.println("Fast speed");
        }
    }

    class Bird extends Animal{
        String breed;

        void wings(){
            System.out.println("Two wings");
        }
    }

    class Fish extends Animal{
        String swim;

        void Fins(){
            System.out.println("Two Fins");
        }
    }

    class Tuna extends Fish{
        String weight;
    }

    class Peacock extends Bird{
        String feather;
    }

    class dog extends Mamals{
        String bark;
    }
