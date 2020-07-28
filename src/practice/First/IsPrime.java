package practice.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.IntPredicate;

public class IsPrime
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        final IntPredicate isPrime = n ->
        {
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }
}






