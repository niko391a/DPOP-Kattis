import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class ProblemC {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String date = s.next();

        String[] splittedDate = date.split("/");

        Map<String, String> monthMap = new HashMap<>();

        monthMap.put("01", "januar");
        monthMap.put("02", "februar");
        monthMap.put("03", "marts");
        monthMap.put("04", "april");
        monthMap.put("05", "maj");
        monthMap.put("06", "juni");
        monthMap.put("07", "juli");
        monthMap.put("08", "august");
        monthMap.put("09", "september");
        monthMap.put("10", "oktober");
        monthMap.put("11", "november");
        monthMap.put("12", "december");

        String day = splittedDate[1].startsWith("0") ? splittedDate[1].substring(1) : splittedDate[1];


        System.out.print(day + ". " + monthMap.get(splittedDate[0]) + " " + splittedDate[2]);



    }

}
