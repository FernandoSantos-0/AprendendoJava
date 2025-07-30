package aulasecao15.filewriterandbufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path = "D:\\Documentos\\Progamação\\Java\\in.txt";

        String[] lines = new String[] {"Hello world", "java", "Css","HTML"};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path,true))) {

            for (String line: lines){
                writer.write(line);
                writer.newLine();

            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
