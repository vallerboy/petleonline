import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj N: ");

        int n = scanner.nextInt();
        if(n == 0){
            System.out.println("(Specyficzny przypadek): 1");
            return;
        }

        int sum = 1;
        for(int i = 2; i <= n; i++){
            sum *= i;
        }

        System.out.println(sum);
    }
}
