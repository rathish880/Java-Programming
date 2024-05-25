package Interfaces;

public class nestedInterface {
    
    public interface nested{
        public void greet();
    }
    
}

class A implements nestedInterface.nested{
    @Override
    public void greet(){
        System.out.println("I'm here to greet everyone");
    }
}
