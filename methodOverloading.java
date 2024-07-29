package basicsOop;

public class methodOverloading {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.sum(3,9));
        System.out.println(calc.sum((float)9.3,(float) 6.90));
        System.out.println(calc.sum(3,6,9));
    }
}

    class calculator{
        int sum(int a, int b){
            return a+b;
        }

        float sum(float a, float b){
            return a + b;
        }

        int sum(int a,int b, int c){
            return a+b+c;
        }
    }