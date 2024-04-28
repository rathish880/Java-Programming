package Interfaces;

public class car implements engine,brake,media{

    @Override
    public void brake() {
       
        System.out.println("I brake engine like normal car");
    }

    @Override
    public void start() {
        
        System.out.println("I start engine like normal car");
    }

    @Override
    public void stop() {
       
        System.out.println("I stop engine like normal car");
    }
    
}
