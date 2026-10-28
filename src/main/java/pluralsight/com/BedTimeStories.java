package pluralsight.com;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// import java.util.Scanner;

public class BedTimeStories {
    public static void main(String[] args) {
        String userInput = "goldilocks.txt";
        String fileName = "src/main/resources/" + userInput;

        //System.out.println("Enter the name of a story: ");

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader buffReader = new BufferedReader(fileReader);

            String line = buffReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("No file name: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem trying to read a line: ");
        }

    }
}
