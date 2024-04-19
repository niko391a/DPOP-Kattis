import java.util.Scanner;

public class ProblemD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("-");
        int aScore = Integer.parseInt(input[0]);
        int bScore = Integer.parseInt(input[1]);
        if(aScore < 21 && bScore < 21){
            System.out.println("?");
        } else if(aScore > 21 || bScore > 21 && aScore < bScore-2|| bScore < aScore-2){
            System.out.println("!");
        } else if(aScore > bScore){
            System.out.println("A");
        } else if(bScore > aScore){
            System.out.println("B");
        }
    }
}
