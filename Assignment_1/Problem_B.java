public class Problem_B {
    public static void main(String[] args) {
        String romanNumeral = "XI"; 
        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is " + result);
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (i < s.length() - 1) {
                char nextChar = s.charAt(i + 1);

                if (getValue(currentChar) < getValue(nextChar)) {
                    result -= getValue(currentChar);
                } else {
                    result += getValue(currentChar);
                }
            } else {
                result += getValue(currentChar);
            }
        }

        return result;
    }

    public static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
