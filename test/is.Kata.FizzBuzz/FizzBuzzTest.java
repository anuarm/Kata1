package is.Kata.FizzBuzz;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void fizzbuzz_of_0_is_0() throws Exception {
        assertThat(FizzBuzz.of(0), is("0"));
    }

    @Test
    public void fizzbuzz_of_1_is_1() throws Exception {
        assertThat(FizzBuzz.of(1), is("1"));
    }
    @Test
    public void fizzbuzz_of_2_is_2() throws Exception {
        assertThat(FizzBuzz.of(2), is("2"));
    }

    @Test
    public void fizzbuzz_of_3_is_Fizz() throws Exception {
        assertThat(FizzBuzz.of(3), is("Fizz"));
    }

    @Test
    public void fizzbuzz_of_5_is_Buzz() throws Exception {
        assertThat(FizzBuzz.of(5), is("Buzz"));
    }

    @Test
    public void fizzbuzz_of_6_is_Fizz() throws Exception {
        assertThat(FizzBuzz.of(6), is("Fizz"));
    }

    @Test
    public void fizzbuzz_of_10_is_Buzz() throws Exception {
        assertThat(FizzBuzz.of(10), is("Buzz"));
    }

    @Test
    public void fizzbuzz_of_15_is_FizzBuzz() throws Exception {
        assertThat(FizzBuzz.of(15), is("FizzBuzz"));
    }

    @Test
    public void acceptance() throws Exception {
        assertThat(FizzBuzz.of(15), is("FizzBuzz"));
        assertThat(FizzBuzz.of(2), is("2"));
        assertThat(FizzBuzz.of(3), is("Fizz"));
        assertThat(FizzBuzz.of(30), is("FizzBuzz"));
        assertThat(FizzBuzz.of(50), is("Buzz"));
        assertThat(FizzBuzz.of(102), is("Fizz"));
        assertThat(FizzBuzz.of(35), is("Buzz"));

    }

}
