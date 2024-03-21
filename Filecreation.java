import java.io.File;
import java.io.IOException;

class FileCreation{
    public static void main(String[] args){
        

        File textFile = new File("main.txt");

        try{

           if(textFile.createNewFile()){
            System.out.println("File Created");
           }else {
            System.out.println("File already exists");
           }
     
        }catch(IOException e) {
            System.out.println("Error");
        }


    }
}

