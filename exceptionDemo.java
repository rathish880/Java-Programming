public class exceptionDemo{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            System.out.println(divide(a,b));
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
     
    }
    public static int divide(int a ,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please don't divide by zero");
        }
        return a/b;
    }
}
