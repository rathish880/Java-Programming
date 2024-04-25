package Inheritance;

public class box {
    double side;
    double width;
    double length;
    
    box(){
        this.side=-1;
        this.width=-1;
        this.length=-1;
        
    }
    box(double side){
        this.side=side;
    }
    box(double width,double length){
        this.width=width;
        this.length=length;
        System.out.println("this the  parent classs");
        System.out.println(width +" "+ length);
    }
    
}
