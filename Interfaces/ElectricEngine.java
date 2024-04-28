package Interfaces;

public class ElectricEngine implements engine{

    @Override
    public void start() {
       System.out.println("Elecric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engie stop");
    }

    
}
