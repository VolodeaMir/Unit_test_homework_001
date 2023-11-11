import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testCalculateDiscountValidArguments() {
        Calculator calculator = new Calculator();
        double originalPrice = 100.0;
        double discountPercentage = 10.0;

        double discountedPrice = calculator.calculateDiscount(originalPrice, discountPercentage);

        assertThat(discountedPrice).isEqualTo(90.0);
    }

    @Test
    public void testCalculateDiscountInvalidArguments() {
        Calculator calculator = new Calculator();
        double originalPrice = -100.0;
        double discountPercentage = 10.0;

        assertThatThrownBy(() -> calculator.calculateDiscount(originalPrice, discountPercentage))
                .isInstanceOf(ArithmeticException.class);
    }
}
