package Aru;

import java.io.*;
import java.util.*;

public class Absolute {

    public static void main(String[] args) throws Exception {

        String path="target/classes/filename.txt";
      //  File file = new File(path).getAbsoluteFile();

        // Reading data from absolute or relative path of file
        //BufferedReader br = new BufferedReader(new FileReader(file));


        try(BufferedReader br = new BufferedReader(
                new FileReader(new File(path).getAbsoluteFile()))){
            String line =br.readLine();

            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }


        }catch (Exception e){
            e.printStackTrace();
        }



      //  System.out.println(file.toString());

    }
}

