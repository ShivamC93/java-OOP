public class mt3 extends Thread {
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    } 
    public static void main(String[] args) {
        mt3 t1 = new mt3();
        mt3 t2 = new mt3();
        mt3 t3 = new mt3();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        String n = Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }


    }  
}
