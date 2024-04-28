package Interfaces;

public class CDplayer implements media {
    
    @Override
    public void start(){
        System.out.println("I start the media player of the car");
    }

    @Override
    public void stop(){
        System.out.println("I stop media player of the car");
    }
    
}
