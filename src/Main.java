import java.util.Scanner;

public class Main {
    private static void ClassRoom () {
        int x,y;
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter the number of people in total:");
        x = scan.nextInt();
        System.out.println("Enter the number of people who leave the room:");
        y = scan.nextInt();
        System.out.println("There are " + Calculator(x,y)+ " people left");
    }

    private static int Calculator (int x, int y){
        return x - y;
    }

    public static void main (String[] args) {
        ClassRoom();
    }
}