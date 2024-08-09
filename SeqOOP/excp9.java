//trycatch,throw,throws



class InvalidAgeException extends Exception{
    InvalidAgeException(String msg) {
        System.out.println(msg);
    }
}

public class excp9 {
    public static void main(String[] args) {
        try{
            vote(15);
        } catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void vote(int age) throws InvalidAgeException 
    {
        if(age<18){
            throw new InvalidAgeException("Not eligile for voting");
        } else{
            System.out.println("eligible");
        }
    }

}
