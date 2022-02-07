package task3;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyString {
    private String[] words;

    public MyString(String str) {
        str = str.toLowerCase(); // в нижний регистр
        words = str.split(" ");
    }

    public static int getNumberOfVowels(String str) {
        Pattern vowel = Pattern.compile("(?iu)[аеёиоуыэюя]");
        str = str.toLowerCase(); // в нижний регистр
        //i - независимость регистра, u - unicode
        Matcher m = vowel.matcher(str);
        int vowelCounter = 0;
        while (m.find()) {
            vowelCounter++;
        }
        return vowelCounter;
    }
    public static String capitalizeFirstVowel(String str){
        Pattern vowel = Pattern.compile("(?iu)[аеёиоуыэюя]");
        Matcher m = vowel.matcher(str);
        if(m.find()) {
            int v = m.start();
            str = str.substring(0,v) + str.substring(v,v+1).toUpperCase() + str.substring(v+1);
        }
        return str;
    }
    public void printSortedByNumberOfVowels() {
        int[] count = new int[words.length];
        for(int i = 0; i < words.length; i++) {
            count[i] = getNumberOfVowels(words[i]);
            words[i] = capitalizeFirstVowel(words[i]);
        }
        //Сортировка выбором (Selection sort)
        for (int i = 0; i < count.length - 1; i++) {

            for (int j = i+1; j < count.length; j++) {

                if (count[i] < count[j]) {

                    int buf = count[i];
                    count[i] = count[j];
                    count[j] = buf;

                    String sbuf = words[i]; //сортируем слова по тем же критериям что и числа в массиве count
                    words[i] = words[j];
                    words[j] = sbuf;
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }

}
