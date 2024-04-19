import java.util.Scanner;

public class ProblemD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("-");
        int aScore = Integer.parseInt(input[0]);
        int bScore = Integer.parseInt(input[1]);
        // Hvis en af spillerne er over 21 point
        if (aScore > 21 || bScore > 21){
            // Begge er over 21
            if (aScore > 21 && bScore > 21){
                // Hvis a har 2 point mere end b
                if (aScore-bScore == 2) System.out.println("A");
                // Hvis b har 2 point mere end A
                else if (bScore-aScore == 2) System.out.println("B");
            }
            else if (aScore > 21 && bScore < 21){

                System.out.println("!");
            }
            else if (bScore > 21 && aScore < 21){
                System.out.println("!");
            }


            // hvis modstander fører med mere end to point over 30
            if(aScore < bScore-2 || bScore < aScore-2){
                if(aScore < bScore) System.out.println("B");
                else System.out.println("A");
            }
        }
        // Spillerne er stadig under eller lig 21
        else {
            // Hvis spillet ikke er afgjort
            if(aScore < 21 && bScore < 21){
                System.out.println("?");
            }
            // Hvis det står 21-21
            else if(aScore == 21 && bScore == 21){
                System.out.println("!");
            }
            // hvis spillet er afgjort
            else {
                if (aScore < bScore) System.out.println("B");
                else System.out.println("A");
            }
        }
    }
}
