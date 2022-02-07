package task2;
/*Создайте программу, которая будет вычислять и выводить на
экран простые множители, из которых состоит целое число,
введенное пользователем. Если введенное число не целое, то нужно
сообщать пользователю об ошибке.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        if (scanner.hasNextInt()) {
            Integer enterNumber = scanner.nextInt();
            MyInteger.getPrimeFactors(Math.abs(enterNumber));
        }
        else {
            System.out.println("Invalid input");
        }
    }

}
