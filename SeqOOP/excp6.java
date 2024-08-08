public class excp6 {
    public static void main(String[] args) {
        try{
            String a = "shiva";
            System.out.println(a.toUpperCase());
        } catch(Exception e){
            System.out.println("Exception caught");
        }
        finally{
            try{
                System.out.println(10/0);
            }catch(ArithmeticException e){
                System.out.println("Arithmetic Exception caught");
            }
            finally{
                System.out.println("finally block is always executed");
            }
        }
        System.out.println("done");
    }
}
