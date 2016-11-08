package is.Kata.FizzBuzz;

import com.sun.corba.se.spi.orb.StringPair;

/**
 * Created by Anuar on 07/11/2016.
 */
public class FizzBuzz {
    public static String of(int i) {

        if (is(i).divisibleBy(0)){
            return "0";
        }

        if(is(i).divisibleBy(3) && is(i).divisibleBy(5)) {
            return  "FizzBuzz";
        }

        if (is(i).divisibleBy(3)){
            return  "Fizz";
        }

        if (is(i).divisibleBy(5)){
            return  "Buzz";
        }

        return Integer.toString(i);
    }

    private static FizzBuzz.Checker is (int number){
        return divisor -> number != 0 && number % divisor == 0;
    }


    private static interface Checker {

        boolean divisibleBy(int divisor);
    }

}
