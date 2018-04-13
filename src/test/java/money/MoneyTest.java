package money;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MoneyTest {
  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    assertThat(five.times(2), is(new Dollar(10)));
    assertThat(five.times(3), is(new Dollar(15)));
  }

  @Test
  public void testEquality() {
    assertThat(new Dollar(5).equals(new Dollar(5)), is(true));
    assertThat(new Dollar(5).equals(new Dollar(6)), is(false));
  }
}
