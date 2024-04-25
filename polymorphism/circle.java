package polymorphism;

public class circle extends shapes {
    @Override
    void area(){
        System.out.println("area is pie * r * r ");
    }
    static void greeting(){
        System.out.println("I'm from circle class");
    }
}
