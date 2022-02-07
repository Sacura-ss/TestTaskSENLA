package task1;
/*Напишите программу, которая возвращает сумму цифр,
присутствующих в данной строке. Если цифр нет, то возвращаемая
сумма должна быть равна 0*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.next();
        int numberSum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                numberSum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("Sum of digits in a string: " + numberSum);
    }
}
