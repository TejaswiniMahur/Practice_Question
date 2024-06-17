
public class longestsubstring {
    public static void main(String[] args) {

        String str= "abcabba";
        int maxLength = 0;
        int currentLength = 1;
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
            } else {
                
                maxLength = Math.max(maxLength, currentLength);
                
                currentLength = 1;

    
            }
        }
        
        maxLength = Math.max(maxLength, currentLength);

        System.out.println(" longest substring  is: " + maxLength);
    }   
   
}


public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcabba";
        int maxLength = 1; 
        int currentLength = 1; 

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char prevChar = str.charAt(i - 1);

            if (currentChar == prevChar) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1; 
        }

        
        maxLength = Math.max(maxLength, currentLength);

        System.out.println("Longest substring is: " + maxLength);
    }
}
