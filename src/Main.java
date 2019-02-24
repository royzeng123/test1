import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int x,y;
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter the number of people in total:");
        x = scan.nextInt();
        System.out.println("Enter the number of people who leave the room:");
        y = scan.nextInt();
        System.out.println("There are " + (x-y) + " people left");
    }
}