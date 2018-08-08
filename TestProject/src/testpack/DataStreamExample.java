package testpack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class DataStreamExample {  
    public static void main(String args[]){    
         try{    
           FileInputStream fin1=new FileInputStream("D:\\testin1.txt");
           FileInputStream fin2=new FileInputStream("D:\\testin2.txt");
           FileOutputStream fos = new FileOutputStream("D:\\testout.txt");
           SequenceInputStream  sis = new SequenceInputStream(fin1,fin2);
           int i; 
           while((i=sis.read())!=-1) {
           System.out.print((char)i); 
           fos.write(i);
           }
           sis.close();
           fos.close();
           fin1.close();
           fin2.close();
           System.out.println("\nSuccess.."); 
         }catch(Exception e){System.out.println(e);}    
        }    
       } 
