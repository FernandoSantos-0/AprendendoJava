package aulasecao15.filereaderanbufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Program {
    public static void main(String[] args) {

        String path = "D:\\Documentos\\Progamação\\Java\\in.txt";

        FileReader reader = null;
        BufferedReader buffer = null;

        try{
            reader = new FileReader(path);
            buffer = new BufferedReader(reader);

            String line = buffer.readLine();

            while (line != null){
                System.out.println(line);
                line = buffer.readLine();
            }

        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{

            try{

                if (reader != null){
                    reader.close();
                }

                if (buffer != null){
                    buffer.close();
                }

            }
            catch(IOException e){
                e.printStackTrace();
            }
        }

    }

}
