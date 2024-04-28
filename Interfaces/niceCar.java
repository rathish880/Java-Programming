package Interfaces;

public class niceCar {
    private engine engine;
    private media media=new CDplayer();

  
    
    public niceCar(){
        engine=new PowerEngine();    
    }

    public niceCar(engine engine){
        this.engine=engine;     
    }
    public void start(){
        engine.start();
    }
    public void startMusic(){
        media.start();
    } 
    public void stopMusic(){
        media.stop();
    }
    public void upgradeEngine(){
        this.engine=new ElectricEngine();
    }
    
}
