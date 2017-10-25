import java.math.BigInteger;
import java.util.Scanner;

public class Task9a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj N: ");

        int n = scanner.nextInt();
        BigInteger sum = new BigInteger("1");

        for(int i = 2; i <= n; i++){
            sum = sum.multiply(new BigInteger(i+""));
        }

        System.out.println(sum.toString().length());
    }
}
