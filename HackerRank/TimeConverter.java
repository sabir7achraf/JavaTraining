package ma.ecole.HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class TimeConverter {

    public static String timeConversion(String s) {
        // Write your code here
        String ourTime = "";
        if (s.contains("PM")) {
            String hour = s.substring(0, 2);
            String rest = s.substring(2, 8);
            int hourInt = Integer.parseInt(hour);
            hourInt = hourInt + 12;
            if (hourInt == 24) {
                hourInt = 12;
            }
            ourTime = String.valueOf(hourInt);
            ourTime = ourTime + rest;
        }

        if (s.contains("AM")) {
            String hour = s.substring(0, 1);
            int hourInt = Integer.parseInt(hour);
            if (hourInt == 12) {
                String hourString = "00";
                ourTime = s.replace(hour, hourString);
            }
        }

        return ourTime;


    }


    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String result = TimeConverter.timeConversion(s);
        System.out.println(result);



    }
}



