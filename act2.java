import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.println("Arithmetic Exception");
            System.out.print("Enter a number: ");
            int input = scan.nextInt();
            scan.nextLine();
            System.out.println(input/0);
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("\nInput Mismatch Exception");
            System.out.print("Enter a integer: ");
            int input = scan.nextInt();
            scan.nextLine();
        } catch(InputMismatchException e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("\nArray Index Out of Bounds Exception");
            System.out.print("Enter a integer: ");
            int input = scan.nextInt();
            scan.nextLine();
            String[] array = {"","",""};
            System.out.println(array[input + 99]);
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("\nIndex Out of Bounds Exception");
            System.out.print("Enter a integer: ");
            int input = scan.nextInt();
            scan.nextLine();
            String text = "test";
            System.out.println(text.charAt(input + 99));
        } catch(IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        
        scan.close();
    }
}
