class excp1 {
    public static void main(String[] args) {
    int a =10,b=0,c;
    try{
        c=a/b;
        System.out.println(c);
        System.out.println("Here is the answer");
    } catch(Exception e){
        System.out.println("Exception Occured");
    }
    finally{
        System.out.println("Finally Block");
    }
    System.out.println("Rest of the code");
    }
}

