package triangle;

/*
 * Michael Swanson
 * 12/2/16
 * Desc: Not a Square, or a Circle.
 */
import java.util.Scanner;

public class Triangle {

    private int A, B, C;

    public Triangle() {                                                         // Default Constructor

    }

    public Triangle(int sideA, int sideB, int sideC) {                          // Overloaded Constructor

        this.A = sideA;
        this.B = sideB;
        this.C = sideC;
    }

    public boolean isScalene() {                                                // A scalene triangle has all unequal sides.
        return (A != B) && (A != C) && (B != C);
    }

    public boolean isRight() {                                                  // A right triangle satisfies the Pythagorean theorem.
        if ((A * A) + (B * B) == (C * C)) {
            return true;
        } else if ((A * A) + (C * C) == (B * B)) {
            return true;
        } else {
            return (B * B) + (C * C) == (A * A);
        }
    }

    public boolean isIsosceles() {                                              // An isosceles triangle has TWO equal sides.
        if (A == B && A != C && B != C) {
            return true;
        } else if (A == C && A != C && B != C) {
            return true;
        } else {
            return (A != B && A != C && B == C);
        }
    }

    public boolean isEquilateral() {                                            // An equilateral triangle has all equal sides.
        return (A == B && A == C && B == C);
    }

    public boolean isValid() {                                                  // Given a Triangle object, see if the Triangle is valid
        return ((A + B > C) && (A + C > B) && (B + C > A));
    }

    public int getSideA() {                                                     // Getters
        return A;
    }

    public int getSideB() {
        return B;
    }

    public int getSideC() {
        return C;
    }

    public void setSideA(int sideA) {                                           // Setters
        if (this.A > 0) {                                                       // Condition: You can't have a triangle with side <= 0
            this.A = sideA;
        } else {
            System.out.println("Error: Side A length is invalid.\nLength must greater than zero.");
        }
    }

    public void setSideB(int sideB) {
        if (this.B > 0) {
            this.B = sideB;
        } else {
            System.out.println("Error: Side B length is invalid.\nLength must greater than zero.");
        }
    }

    public void setSideC(int sideC) {
        if (this.C > 0) {
            this.C = sideC;
        } else {
            System.out.println("Error: Side C length is invalid.\nLength must greater than zero.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                 // Initialize Scanner
        int a, b, c;                                                            // Initialize Variables
        while (true) {                                                          // Infinite loop for creating more triangles
            a = userInputSides(input, "A");                                     // Methods that take input for 3 sides
            b = userInputSides(input, "B");
            c = userInputSides(input, "C");
            Triangle t1 = new Triangle(a, b, c);                                // Creates triangle from input
            System.out.println("Valid Triangle        : " + t1.isValid());      // Methods return boolean values directly through S.O.P.
            System.out.println("Right Triangle        : " + t1.isRight());
            System.out.println("Scalene Triangle      : " + t1.isScalene());
            System.out.println("Isosceles Triangle    : " + t1.isIsosceles());
            System.out.println("Equilateral Triangle  : " + t1.isEquilateral() + "\n");
            addAnotherTriangle(input);                                          // Asks user to create another triangle or to exit program.
        }
    }

    public static int userInputSides(Scanner input, String sideName) {
        boolean potatoUser = true;
        int side = 0;

        do {                                                                    // Scanner checks
            System.out.print("Enter length of side " + sideName + ": ");
            if (input.hasNextInt()) {
                side = input.nextInt();
                if (side <= 0) {
                    input.nextLine();
                    System.out.println("Invalid length.");
                } else {
                    potatoUser = false;
                }
            } else {
                input.nextLine();
                System.out.println("Invalid length.");
            }
        } while (potatoUser);
        return side;
    }

    public static void addAnotherTriangle(Scanner input) {                      // Asks user to create another triangle or to exit.
        do {
            System.out.print("\nRead in a new triangle?(1 for no, 2 for yes): ");
            if (input.hasNextInt()) {
                switch (input.nextInt()) {
                    case 1:
                        System.exit(0);
                    case 2:
                        return;
                    default:                                                    // If user enters anything other than 1 or 2.
                        System.out.println("Please enter 1 or 2.");
                        input.nextLine();
                        break;
                }
            } else {
                System.out.println("Please enter 1 or 2.");
                input.nextLine();
            }
        } while (true);
    }
}
