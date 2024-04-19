import java.util.Scanner;

public class ProblemD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("-");
        int aScore = Integer.parseInt(input[0]);
        int bScore = Integer.parseInt(input[1]);
//        System.out.println("Ascore " + aScore);
//        System.out.println("Bscore " + bScore);
        // If both scores are under 21 the match is still under way
        if(aScore < 21 && bScore < 21){
            System.out.println("?");
        }
        // If the scores are above the usual max 21
        // if the oponnents score is less than 2 under the score it must be impossible
        else if((aScore > 21 || bScore > 21) && (aScore < bScore-2|| bScore < aScore-2 || aScore==bScore) || (aScore > 30 || bScore > 30)){
            System.out.println("!");
        } else if (aScore == 21 && bScore == 21){
            System.out.println("!");
        } else if(aScore > bScore){
            System.out.println("A");
        } else if(bScore > aScore){
            System.out.println("B");
        }
    }
}