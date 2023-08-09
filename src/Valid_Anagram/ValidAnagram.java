package Valid_Anagram;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        } else {
            char[] sCharArray = s.toCharArray();
            //Map<character, number of appearance>
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < sCharArray.length; i++) {
                if(map.containsKey(sCharArray[i])) {
                    int appearance = map.get(sCharArray[i]);
                    map.replace(sCharArray[i], ++appearance);
                } else {
                    map.put(sCharArray[i], 1);
                }

            }

            char[] tCharArray = t.toCharArray();

            for(int i = 0; i < tCharArray.length; i++) {
                if(map.containsKey(tCharArray[i])) {
                    int appearance = map.get(tCharArray[i]);
                    map.replace(tCharArray[i], --appearance);
                    if(map.get(tCharArray[i]) == 0) {
                        map.remove(tCharArray[i]);
                    }
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
