public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check the current character and add its value to the result
            if (currentChar == 'I') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    result -= 1;
                } else {
                    result += 1;
                }
            } else if (currentChar == 'V') {
                result += 5;
            } else if (currentChar == 'X') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    result -= 10;
                } else {
                    result += 10;
                }
            } else if (currentChar == 'L') {
                result += 50;
            } else if (currentChar == 'C') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    result -= 100;
                } else {
                    result += 100;
                }
            } else if (currentChar == 'D') {
                result += 500;
            } else if (currentChar == 'M') {
                result += 1000;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace with the Roman numeral you want to convert
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + integerEquivalent);
    }
}
