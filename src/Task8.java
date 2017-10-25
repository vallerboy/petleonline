import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String password = "Polska";

        String passwordTyped;
        do{
            System.out.print("Podaj hasło: ");
            passwordTyped = scanner.nextLine();

        }while (!passwordTyped.equals(password));
        System.out.println("Zalogowano poprawnie");

        /////////////////////////////////////////
//        passwordTyped = "";
//        while (!passwordTyped.equals(password)){
//            System.out.print("Podaj hasło: ");
//            passwordTyped = scanner.nextLine();
//        }
    }
}
