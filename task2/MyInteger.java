package task2;

public class MyInteger {
    public static void getPrimeFactors(Integer n) {
        int a = 2;
        while (a <= n) {
            if((n % a) == 0) {
                if (a != n) {
                    System.out.println(a + " ");
                    getPrimeFactors(n /a);
                } else {
                    System.out.println(a);
                }
                return;
            }
            a++;
        }
    }
}
