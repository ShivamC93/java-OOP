//by extending thread class
class mt1 extends Thread{
        public void run() {
            for(int i=0;i<10;i++) {
                System.out.println("A");
            }
        }
        public static void main(String[] args) {
            mt1 t1=new mt1();
            t1.start();

            for(int i=0;i<10;i++) {
                System.out.println("B");
            }            
        }
    }
   

