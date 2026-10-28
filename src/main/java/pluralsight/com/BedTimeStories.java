package pluralsight.com;


import java.util.Scanner;

public class BedTimeStories {
    public static void main(String[] args) {
        try {
            String filePath = "src/main/resources/";
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter the name of a story: ");
            String story = filePath + myScanner.nextLine();


        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
