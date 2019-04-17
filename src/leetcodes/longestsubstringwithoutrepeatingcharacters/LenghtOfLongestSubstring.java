package leetcodes.longestsubstringwithoutrepeatingcharacters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static java.util.Collections.*;

public class LenghtOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 0)
            return 0;

        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String subString = s.substring(i);
            if (subString.length() == 1) {
                scores.add(1);
                continue;
            }
            List<Character> charsInSubstring = new ArrayList<>();

            for (int j = 0; j < subString.length(); j++) {
                Character character = new Character(subString.charAt(j));

                if (charsInSubstring.contains(character) || j == subString.length() - 1) {
                    if(charsInSubstring.contains(character)){
                    scores.add(j);

                    }else
                    scores.add(j+1);

                    break;
                } else {
                    charsInSubstring.add(character);
                }

            }
        }
        sort(scores);
        return scores.get(scores.size() - 1);

    }

    public static void main(String[] args) {
        assert (lengthOfLongestSubstring("au") == 2) : "au is not 2-" + String.valueOf(lengthOfLongestSubstring("au"));
        assert (lengthOfLongestSubstring("abcdea") == 5) : "abcdea is not 5-" + String.valueOf(lengthOfLongestSubstring("abcdea"));
        assert (lengthOfLongestSubstring("") == 0) : "null is not 0-";
        assert (lengthOfLongestSubstring("a") == 1) : "a is not 1-";


    }

}
