
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GrayScaleConverter GrayObj = new GrayScaleConverter();
        BatchInversions InversionObj = new BatchInversions() ;
        String input = "none" ;
        while (input != "3") {
            System.out.println("This Program can perform 2 functions on images, converting them to grayscale or invert colors, also saves copies of new converted images in the program directory. \nchoose what function you want to use: ");
            System.out.println("press 1 + Enter then select an image file : To convert image to grayscale");
            System.out.println("press 2 + Enter then select an image file : To invert image colors");
            System.out.println("press 3 + Enter : To terminate the program") ;
            Scanner scan = new Scanner(System.in);  // Create a Scanner object
            input = scan.nextLine();
            switch(input) {
              case "1":
              GrayObj.selectAndConvert ();
              break;
              case "2":
                InversionObj.selectAndConvert() ;
                break;
              case "3":
                System.out.println("The program is terminated") ;
                return;
              default:
                System.out.println("Input " + input + " is not valid please choose a valid input \n");
            }
            System.out.println("\n") ;
        }
    }
}
