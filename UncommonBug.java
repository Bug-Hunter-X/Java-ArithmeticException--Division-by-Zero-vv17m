public class UncommonBug {
    public static void main(String[] args) {
        int x = 0;
        int y = 5;
        int z = y / x; // This line will throw an ArithmeticException
        System.out.println(z);
    }
}