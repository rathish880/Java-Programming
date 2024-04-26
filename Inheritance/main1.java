package Inheritance;

public class main1 {
    public static void main(String[] args) {
        boxPrice bw=new boxPrice(100,100,100);
        System.out.println(bw);// in this case the output will be  " package.classname@hashvalue "
        System.out.println(bw.getClass().getPackageName());  //  " getClass() " is a method of Object Class
    }
    
}
