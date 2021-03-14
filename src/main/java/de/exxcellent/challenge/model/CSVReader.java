package de.exxcellent.challenge.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {
   public List<String> readCSV (String pathToFile){
     List<String> result =new LinkedList<String>();
      File file = new File(pathToFile);
       try{
           Scanner inputStream = new Scanner(file);
           inputStream.nextLine();
           while(inputStream.hasNext() ){
               result.add(inputStream.nextLine());
           }
           inputStream.close();
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }
       return result;
   }
}
