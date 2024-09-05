package File_Handling;

// import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.OutputStreamWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;

import java.io.File;


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
        // try(FileReader fr=new  FileReader("File_Handling/intro.txt")){
        //     //System.out.println("Enter a word :");
        
        //     int letters=fr.read();
        //     while(fr.ready()){
        //         System.out.println((char)letters);
        //         letters=fr.read();
        //     }
        //     System.out.println();

        // }
        // catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        
        //BufferedReader using InputStreamReader
        // try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
        //     // here System.in gives byte data,so InputStreamReader converts byte
        //     // stream into character stream and BufferedReader reads the character Stream.
        //     System.out.println("Entwwr a Sentence:"+br.readLine());
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        //BufferedReader using FileReader
        // try(BufferedReader br=new BufferedReader(new FileReader("File_Handling/intro.txt")))
        // {
        //     while(br.ready()){
        //         System.out.println(br.readLine());
        //     }
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }


        // Writer
        // try(OutputStreamWriter osw=new OutputStreamWriter(System.out))
        // {
        //     char[] arr="CREATED".toCharArray();
        //     osw.write('A');
        //     osw.write(10);
        //     osw.write(97);
        //     osw.write('\n');
        //     osw.write(arr,2,3);
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        //filewriter
        // try(FileWriter fr=new FileWriter("File_Handling/intro.txt",true))
        // {
        //     fr.write("Append this message");
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
      
        //BufferedWriter
        // try(BufferedWriter bw=new BufferedWriter(new FileWriter("File_Handling/intro.txt")))
        // {
        //     bw.write("Contents ahs been changed!!!");
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }



        //File

        //create
        // try{
        //     File fo=new File("File_Handling/new-file2.txt");
        //     fo.createNewFile();
        // }
        // catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        //write 
        // try(FileWriter fw=new FileWriter("File_Handling/new-file.txt")){
        //     fw.write("Bhagavat Geeta");
        //     fw.close();
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        //Read
        try(BufferedReader fw=new BufferedReader(new FileReader("File_Handling/new-file.txt"))){
            System.out.println(fw.readLine());
            fw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //delete
        try{
            File fo=new File("File_Handling/new-file2.txt");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println(fo.getName());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        


                                                                               
    
    }

    
    
}
