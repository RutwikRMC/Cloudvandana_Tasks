public class Problem_C {
    public static void main(String[] args) {
        String input = "Rutwik Chougule";
        boolean isPangram = isPangram(input.toLowerCase());
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }

        for (boolean isPresent : alphabet) {
            if (!isPresent) {
                return false; 
            }
        }

        return true;
    }
}

