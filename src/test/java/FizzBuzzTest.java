import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void shouldReturn1For1() throws Exception {
        assertThat(fizzBuzz.value(1), equalTo("1"));
    }

}
