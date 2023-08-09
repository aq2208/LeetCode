package Valid_Palindrome;

public class ValidPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));

    }

    public static boolean isPalindrome(String s) {
        char[] characters = s.toCharArray();
        int start = 0;
        int end = characters.length -1;

        while(start < end) {
            if(!Character.isLetterOrDigit(characters[start])) {
                start++;
            } else if(!Character.isLetterOrDigit(characters[end])) {
                end--;
            } else {
                if(Character.toString(characters[start]).equalsIgnoreCase(Character.toString(characters[end]))) {
                    start++;
                    end--;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
