package task3;
/*Создайте программу, которая будет:
-подсчитывать количество гласных в словах
-выводить слова отсортированным списком по количеству
гласных (сначала те, у которых больше гласных)
-делать первую гласную букву в слове заглавной
Предложение вводится пользователем вручную русскими
буквами. Разделитель пробел (“ ”).*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String str = scanner.nextLine();
        MyString myStr = new MyString(str);
        myStr.printSortedByNumberOfVowels();
    }
}
