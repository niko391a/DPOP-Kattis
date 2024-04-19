import java.util.Scanner;

public class ProblemB {
    // white = 1/7 * breadth
    // quadrant = (b - white) / 2
    // rectangle = 6/4 * quadrant
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int breadth = scn.nextInt();

        int white = 1/7 * breadth;
        int quadrant = (breadth - white) / 2;
        int rectangle = 6/4 * quadrant;

        int result = (2 * (quadrant*quadrant)) + (2 * (rectangle));

        System.out.println(result);
    }
}
