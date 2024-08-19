class msg{
    public void show(String name){
        //100 lines of code for example

        synchronized(this){
            for(int i=0;i<3;i++){
                System.out.println("How are you" + name);
            }
        }   
        //demo code
    }
}
    class OurThread extends Thread{
        msg m;
        String name;
        OurThread(msg m,String name){
            this.m=m;
            this.name=name;
        }
        public void run(){
            m.show(name);
        }
    }

    class mtSy2{
        public static void main(String[] args) {
            msg m=new msg();
            OurThread t1=new OurThread(m,"Shiva");
            OurThread t2=new OurThread(m,"Rahul");
            t1.start();
            t2.start();        
        }
    }

