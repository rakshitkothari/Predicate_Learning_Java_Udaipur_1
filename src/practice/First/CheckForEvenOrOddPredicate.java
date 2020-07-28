package practice.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class CheckForEvenOrOddPredicate
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        Predicate<Integer> checkForEvenOrOdd = i -> (i % 2 == 0);
        int i = Integer.parseInt(reader.readLine());
        System.out.println(checkForEvenOrOdd.test(i));
    }

}