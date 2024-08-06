//nested try

public class excp4 {
    public static void main(String[] args) {
        try {
            
            try{
                int arr[] = {1,2,3};
                int b = arr[4];
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound exception");
            }
            int a = 10/0;
            System.out.println("Hello world");
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        System.out.println("executed");
    }
}
