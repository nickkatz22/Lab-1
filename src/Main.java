import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Grand Circus Room Detail Generator!");

        String loopMe;
        double length, width, area, perimeter;

        do {

        System.out.println("Please enter the length of the classroom: ");
        length = scan.nextDouble();

        System.out.println("Please enter the width of the classroom: ");
        width = scan.nextDouble();

        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("The area of the classroom is: " + area);
        System.out.println("The perimeter of the classroom is: " + perimeter);

        System.out.println();

        System.out.print("Continue? (y,n): ");

        loopMe = scan.next();
    }
    while(loopMe.equalsIgnoreCase("Y"));
//Implementing a method that ingnores upper or lower case

    }
}
