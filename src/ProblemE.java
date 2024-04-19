import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ProblemE  {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\carls\\Documents\\GitHub\\DPOP-Kattis\\Data\\01.in");


        Scanner scanner = new Scanner(file);
        int highestVal = 0;

        int n = scanner.nextInt();

        for (int i = 0; i<n; i++){
            int mbp = scanner.nextInt();
            String answer = scanner.next();

            if (answer.equals("nej")){
                if (mbp > highestVal){
                    highestVal = mbp;
                }
            }
        }
        System.out.println(highestVal);

    }
}
