import java.util.Scanner;

public class ProblemB {
    // white = 1/7 * breadth
    // quadrant = (b - white) / 2
    // rectangle = 6/4 * quadrant
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int breadth = scn.nextInt();

        double white = breadth / 7.0 ;
        double quadrantL = (breadth - white) / 2;
        double rectangleL = (6.0/4.0 * quadrantL);

        double result = 2.0*(quadrantL*quadrantL) + 2.0 * (6.0/4.0 * (quadrantL*quadrantL));

        System.out.println((int) result);
    }
}
