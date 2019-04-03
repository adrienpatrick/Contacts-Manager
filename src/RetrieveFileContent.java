import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RetrieveFileContent {
    static final String DATA_DIRECTORY = "data";
    private String nameOfFile;

    List<String> listOfStrings = new ArrayList<>();
    String directory = RetrieveFileContent.DATA_DIRECTORY;



//    The method should accept a string that is the location of the file, and return a list of strings where each string is a line in the file.

        public RetrieveFileContent(String nameOfFile){

            this.nameOfFile = nameOfFile;

        }



    public List<String> viewFile(){


        String output = "Name   | Phone Number\n" +
                "---------------------\n";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, nameOfFile);



        try {

            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }


            System.out.println(output);
            List<String> lines = Files.readAllLines(dataFile);
            for(String line : lines){
                System.out.println(line);
                listOfStrings.add(line);
            }


        }catch(IOException ioe){
            System.out.println(ioe);
        }



        return listOfStrings;

    }

    //Contact Object

    public List<String> addContact(String name, String phone){


            String contact = name + " | " + phone;

        try {

            Files.write(
                    Paths.get(directory, nameOfFile),
                    Arrays.asList(contact),
                    StandardOpenOption.APPEND
            );
        }catch(IOException ioe){
            System.out.println(ioe);
        }

        return listOfStrings;

    }

    public void searchContact(String name){


        Path dataFile = Paths.get(directory, nameOfFile);


        try {

            List<String> lines = Files.readAllLines(dataFile);
            for (String line : lines) {
               if(line.contains(name)){
                   System.out.println(line);
                   break;
               }else{
                   System.out.println("No contact found");
                   break;
               }
            }

        }catch(IOException ioe){
            System.out.println(ioe);
        }



    }




}
