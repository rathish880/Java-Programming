public class staticBlock {
    static int a=3;
    static int b;
    static {

        System.out.println("we are inside static block");
        b=a*5;
       
    }
    public static void main(String[] args) {
        staticBlock obj1=new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);

        staticBlock obj2=new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);
    }
    
}
