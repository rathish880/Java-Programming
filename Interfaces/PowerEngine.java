package Interfaces;

public class PowerEngine implements engine{

    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void stop() {
        
        System.out.println("Power engine stop");
    }
    
}
