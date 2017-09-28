import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число A:");
        System.out.println("Число A = ");

        int chislo_A = scanner.nextInt();

        System.out.println("Введите число B:");
        System.out.println("Число B = ");

        int chislo_B = scanner.nextInt();

        System.out.println("Какую операцию провести?");
        System.out.println("1. Сумма");
        System.out.println("2. Разность");
        System.out.println("3. Умножение");
        System.out.println("4. Частное");
        System.out.println("5. Выйти");

        while (true) {
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("A + B = " + (chislo_A + chislo_B));
                    break;
                case 2:
                    System.out.println("A - B = " + (chislo_A - chislo_B));
                    break;
                case 3:
                    System.out.println("A * B = " + (chislo_A * chislo_B));
                    break;
                case 4:
                    System.out.println("A / B = " + (double) (chislo_A / chislo_B));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Команда не верна!!!");
            }
        }
    }
}

