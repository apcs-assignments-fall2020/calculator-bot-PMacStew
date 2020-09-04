import java.util.Scanner;

public class MyMain {

    // Calculates edian of the three inputs
    public static int median(final int a, final int b, final int c) {
        if (Math.max(a, b) == a) {
            if (Math.max(a, c) == a)
                return Math.max(b, c);
            else
                return a;
        }
        else {
            if (Math.max(b, c) == b)
                return Math.max(c, a);
            else
                return b;
        }
    

    }

    // Returns the input with the larger absolute value
    public static int magnitude(final int a, final int b) {
        final int x = Math.abs(a);
        final int y = Math.abs(b);
        if (Math.max(x, y) == x)
            return a;
        else
            return b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(final int a, final int b) {
        return Math.sqrt((a * a) + (b * b));
    }

    public static void main(final String[] args) {
        // You may want to keep these lines of code to test that your methods work
        final Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to 1. find the median of 3 numbers 2. find the larger absolute value of two numbers or 3. find the hypotenuse of a triangle using the pythagorean theorem?");
        System.out.print("Please enter the corresponding digit: ");
        final int methodChoice = scan.nextInt();
        if (methodChoice == 1) {
            System.out.print("Input first number: ");
            final int median1 = scan.nextInt();
            System.out.print("Input second number: ");
            final int median2 = scan.nextInt();
            System.out.print("Input third number: ");
            final int median3 = scan.nextInt();
            System.out.println("The median of your numbers is " + median(median1, median2, median3));
        }
        else if (methodChoice == 2){
            System.out.print("Input first number: ");
            final int magnitude1 = scan.nextInt();
            System.out.print("Input second number ");
            final int magnitude2 = scan.nextInt();
            System.out.println("The largest absolute value of your two numbers is " + magnitude(magnitude1, magnitude2));
        }
        else {
            System.out.print("Input length of first side: ");
            final int pythagorean1 = scan.nextInt();
            System.out.print("Input length of second side: ");
            final int pythagorean2 = scan.nextInt();
            System.out.println("The length of your hypotenuse is " + pythagoras(pythagorean1, pythagorean2));
        }

        
        // YOUR CODE HERE
    }
}
