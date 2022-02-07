package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        if (scanner.hasNextInt()) {
            Integer enterNumber = scanner.nextInt();
            StringBuilder s = new StringBuilder();
            for(int a=enterNumber; a>0; a/=10) {
                s.insert(0, a%10);
            }
            for(int i =0; i < s.length(); i++) {
                char a = s.charAt(i);
                switch (a) {
                    case ('0'):
                        System.out.println("000");
                        System.out.println("0 0");
                        System.out.println("0 0");
                        System.out.println("0 0");
                        System.out.println("000");
                        System.out.println("");
                        break;
                    case ('1'):
                        System.out.println("  1");
                        System.out.println("  1");
                        System.out.println("  1");
                        System.out.println("  1");
                        System.out.println("  1");
                        System.out.println("");
                        break;
                    case ('2'):
                        System.out.println("222");
                        System.out.println("  2");
                        System.out.println("222");
                        System.out.println("2  ");
                        System.out.println("222");
                        System.out.println("");
                        break;
                    case ('3'):
                        System.out.println("333");
                        System.out.println("  3");
                        System.out.println("333");
                        System.out.println("  3");
                        System.out.println("333");
                        System.out.println("");
                        break;
                    case ('4'):
                        System.out.println("  4");
                        System.out.println("4 4");
                        System.out.println("444");
                        System.out.println("  4");
                        System.out.println("  4");
                        System.out.println("");
                        break;
                    case ('5'):
                        System.out.println("555");
                        System.out.println("5  ");
                        System.out.println("555");
                        System.out.println("  5");
                        System.out.println("555");
                        System.out.println("");
                        break;
                    case ('6'):
                        System.out.println("666");
                        System.out.println("6  ");
                        System.out.println("666");
                        System.out.println("6 6");
                        System.out.println("666");
                        System.out.println("");
                        break;
                    case ('7'):
                        System.out.println("777");
                        System.out.println("  7");
                        System.out.println("  7");
                        System.out.println("  7");
                        System.out.println("  7");
                        System.out.println("");
                        break;
                    case ('8'):
                        System.out.println("888");
                        System.out.println("8 8");
                        System.out.println("888");
                        System.out.println("8 8");
                        System.out.println("888");
                        System.out.println("");
                        break;
                    case ('9'):
                        System.out.println("999");
                        System.out.println("9 9");
                        System.out.println("999");
                        System.out.println("  9");
                        System.out.println("999");
                        System.out.println("");
                        break;
                }
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }

}
