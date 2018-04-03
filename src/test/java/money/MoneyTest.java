package money;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MoneyTest {
  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    assertThat(product.amount, is(10));
    product = five.times(3);
    assertThat(product.amount, is(15));
  }
}
