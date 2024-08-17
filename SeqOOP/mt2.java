//implementing runable interface

public class mt2 implements Runnable{
    public void run() {
        for(int i=1;i<5;i++){
            System.out.println("Child");
        }
    }

        public static void main(String[] args) {
            mt2 m=new mt2();
            Thread t=new Thread(m);
            t.start();

            for(int i=1;i<5;i++){
                System.out.println("MAin");
            }
        }
}

