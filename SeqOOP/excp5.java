public class excp5 {
    public static void main(String[] args) {
         try{
            System.out.println(10/0);
         }catch(Exception e){
            System.out.println(e);
            try{
                String a =null;
                System.out.println(a.toLowerCase());
            } catch(NullPointerException n){
                System.out.println("Null pointer exception");
            }
         }
         System.out.println("done");
    }
}
