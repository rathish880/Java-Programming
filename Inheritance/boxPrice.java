package Inheritance;

public class boxPrice extends box {
    double cost;
    
    boxPrice(){
        this.cost=0;
    }
    boxPrice(double side,double cost){
        super(side);
        this.cost=cost;
    }
    boxPrice(double width,double length,double cost){
        super(width,length);
        this.cost=cost;
        System.out.println("this is the child class");
        System.out.println(cost);

    }
}
    
