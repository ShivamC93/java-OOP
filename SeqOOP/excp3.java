public class excp3 {
    public static void main(String[] args) {
        try{
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);

            int arr[] ={1,2,3};
            System.out.println(arr[1]);

            String str = "shiva";
            System.out.println(str.toUpperCase());
        } catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array index out of bound exception");
        } catch(ArithmeticException a){
            System.out.println("Arithmetic exception");
        } catch(NumberFormatException n){
            System.out.println("Number format exception");
        } catch(Exception e){
            System.out.println("Exception");
        }
    }
}
