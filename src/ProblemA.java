import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        for(int i = 0; i< 3 ; i++){
            System.out.print(input[0]+" ");
        }
    }
}
