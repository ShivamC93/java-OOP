public class Abstract1 {
    public static void main(String[] args) {
        horse h = new horse();
        h.eat();
        h.walks();

        chicken c = new chicken();
        c.eat();
        c.walks();

        mustang m = new mustang(); //shows constructor hierarchy from parent to child
    }
}

abstract class Animal{

    Animal(){
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walks(); //implementation details depend on each calling class
}

class horse extends Animal{
    horse(){
        System.out.println("horse constructor called");
    }
    void walks(){
        System.out.println("Horse walks on four legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("Mustang constructor called");
    }
}

class chicken extends Animal{

    void walks(){
        System.out.println("Walks on 2 legs");
    }
}