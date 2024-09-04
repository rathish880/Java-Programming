package File_Handling;

// import java.io.InputStreamReader;
import java.io.IOException;
//import java.io.InputStreamReader;


import java.io.FileReader;

public class file1 {
    public static void main(String[] args) {
        // InputStreamReader isr=new InputStreamReader(System.in);
        // System.out.println("Enter a word :");
        // try{
        //     int letters=isr.read();
        //     while(isr.ready()){
        //         System.out.println((char)letters);
        //         letters=isr.read();
        //     }
        //     System.out.println();

        // }
        // catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        // File reader
        try(FileReader fr=new  FileReader("File_Handling/intro.txt")){
            //System.out.println("Enter a word :");
        
            int letters=fr.read();
            while(fr.ready()){
                System.out.println((char)letters);
                letters=fr.read();
            }
            System.out.println();

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    
    }

    
    
}
