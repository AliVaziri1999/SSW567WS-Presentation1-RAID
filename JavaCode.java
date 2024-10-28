public class JavaCode {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        JavaCode calculator = new JavaCode();
        SubtractCode subtractor = new SubtractCode();

        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + subtractor.subtract(5, 3));
    }
}
