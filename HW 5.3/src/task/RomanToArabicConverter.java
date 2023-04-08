package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToArabicConverter {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число в римском формате: ");
        String romanNumeral = scanner.nextLine();

        int arabicNumeral = romanToArabic(romanNumeral);

        System.out.println("Число в арабском формате: " + arabicNumeral);
    }

    public static int romanToArabic(String romanNumeral) {
        Map<Character, Integer> romanToArabic = new HashMap<>();
        romanToArabic.put('I', 1);
        romanToArabic.put('V', 5);
        romanToArabic.put('X', 10);
        romanToArabic.put('L', 50);
        romanToArabic.put('C', 100);
        romanToArabic.put('D', 500);
        romanToArabic.put('M', 1000);

        int result = 0;
        int prev = 0;
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int curr = romanToArabic.get(romanNumeral.charAt(i));
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }
}
