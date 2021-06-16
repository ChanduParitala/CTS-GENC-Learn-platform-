import org.junit.Assert;
import org.junit.Test;

public class EMICalculatorTest {
    private final EMICalculator emiCalculator = new EMICalculator();

    @Test
    public void everything_wrong_fail_test() {
        double expectedEmi = 0;
        double actualEmi = emiCalculator.calculateEMI(0, "error", 0);
        Assert.assertEquals(expectedEmi, actualEmi, 0.001);
    }

    @Test
    public void principle_and_duration_in_years_wrong_fail_test() {
        double expectedEmi = 0;
        double actualEmi = emiCalculator.calculateEMI(0, "Vehicle Loan", 0);
        Assert.assertEquals(expectedEmi, actualEmi, 0.001);
    }

    @Test
    public void duration_in_years_wrong_fail_test_1() {
        double expectedEmi = 0;
        double actualEmi = emiCalculator.calculateEMI(10000, "Housing Loan", 0);
        Assert.assertEquals(expectedEmi, actualEmi, 0.001);
    }

    @Test
    public void duration_in_years_wrong_fail_test_2() {
        double expectedEmi = 0;
        double actualEmi = emiCalculator.calculateEMI(10000, "Personal Loan", 21);
        Assert.assertEquals(expectedEmi, actualEmi, 0.001);
    }

    @Test
    public void principle_wrong_fail_test() {
        double expectedEmi = 0.0;
        double actualEmi = emiCalculator.calculateEMI(9999, "Housing Loan", 12);
        Assert.assertEquals(expectedEmi, actualEmi, 0.001);
    }

    @Test
    public void correct_input_test_1() {
        double expectedEmi = 167.17549983583908;
        double actualEmi = emiCalculator.calculateEMI(10000, "Housing Loan", 5);
        Assert.assertEquals(expectedEmi, actualEmi, 0.001);
    }

    @Test
    public void correct_input_test_2() {
        double expectedEmi = 349.534844418832;
        double actualEmi = emiCalculator.calculateEMI(50000, "Vehicle Loan", 12);
        Assert.assertEquals(expectedEmi, actualEmi, 0.001);
    }

    @Test
    public void correct_input_test_3() {
        double expectedEmi = 837.5416658825129;
        double actualEmi = emiCalculator.calculateEMI(100000, "Personal Loan", 10);
        Assert.assertEquals(expectedEmi, actualEmi, 0.001);
    }

    @Test
    public void correct_input_test_4() {
        double expectedEmi = 632.5612476914074;
        double actualEmi = emiCalculator.calculateEMI(150000, "Housing Loan", 20);
        Assert.assertEquals(expectedEmi, actualEmi, 0.001);
    }
}
