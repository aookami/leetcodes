package leetcodes.findAndReplacePatters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {


    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        //abstract the pattern from the word, going from words to numbers

        //aaaabbbccdc = 11112223343
        //letters will be assigned numbers as they appear
        List<String> answer = new ArrayList<>();
        HashMap<Character, Integer> patternHashMap = new HashMap<>();
        List<Integer> patternAsInteger = new ArrayList<>();

        for (int i = 0; i < pattern.length(); i++) {
            Character x = pattern.charAt(i);
            if(!patternHashMap.containsKey(x)) {
                patternHashMap.put(x, patternHashMap.size()+1);
            }
            patternAsInteger.add(patternHashMap.get(x));
        }



        for(String word : words){
            HashMap<Character, Integer> wordHashMap = new HashMap<>();
            List<Integer> wordAsInteger = new ArrayList<>();
            for(int i = 0; i < word.length(); i++){
                Character x = word.charAt(i);
                if(!wordHashMap.containsKey(x)) {
                    wordHashMap.put(x, wordHashMap.size()+1);
                }
                wordAsInteger.add(wordHashMap.get(x));
            }
            if(wordAsInteger.equals(patternAsInteger))
                answer.add(word);
        }


        return answer;
    }



    public static void main(String[] args) {
        String[] aa = new String[6];
        aa[0] = "abc";
        aa[1] = "deq";
        aa[2] = "mee";
        aa[3] = "aqq";
        aa[4] = "dkd";
        aa[5] = "ccc";

        findAndReplacePattern( aa ,"aaa");
        findAndReplacePattern( aa ,"abb");
        findAndReplacePattern( aa ,"aba");


    }
}
