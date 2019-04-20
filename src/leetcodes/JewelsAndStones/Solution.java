package leetcodes.JewelsAndStones;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.List;

public class Solution {



    public int numJewelsInStones(String J, String S) {
        List<Character> JList = new ArrayList<>();
        for(int i = 0; i < J.length(); i++){
            JList.add(J.charAt(i));
        }
        int sum = 0;
        for(int i = 0; i < S.length(); i++){
            if(JList.contains(S.charAt(i))) {
                sum++;

            }
        }

        return sum;
    }

    public static void main(String[] args) {

    }
}
