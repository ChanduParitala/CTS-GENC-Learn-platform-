public class Test {
    public static void main(String[] args) {
        EMICalculator emiCalculator = new EMICalculator();
        System.out.println(emiCalculator.calculateEMI(150000, "Housing Loan", 20));
    }
}
