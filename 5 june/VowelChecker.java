public class VowelChecker {

    public static boolean isVowelPresent(String str) {
        str = str.toLowerCase();
          for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true; 
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String input = "Hello World"; 
        if (isVowelPresent(input)) {
            System.out.println("A vowel is present in the string.");
        } else {
            System.out.println("No vowel is present in the string.");
        }
    }
}

