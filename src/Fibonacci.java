import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел Фибоначчи для вывода: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Пожалуйста, введите положительное число.");
            return;
        }

        System.out.println("Первые " + n + " чисел Фибоначчи:");

        long first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}