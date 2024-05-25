public class Enum {
    enum Week{
        Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;


        
    Week(){
        System.out.println("Constructore created for"+" "+ this);
        //theis constructor is not public nor protected, instead private or default
        //why ? because we don't want to create new objects
    }
    }


    public static void main(String[] args) {

       Week day;
       day=Week.Sunday;
        
        // for(Week day:Week.values()){
        //     System.out.println(day);

        // }
    }
}
