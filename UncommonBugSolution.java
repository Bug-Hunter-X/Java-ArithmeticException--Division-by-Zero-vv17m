import java.util.InputMismatchException;
public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 0;
        int y = 5;
        try {
            int z = y / x; 
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero detected. "+ e.getMessage());
        }
    }
}