import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
      public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        
        List<Integer> inputList = new ArrayList<>();
        
        while(x>0){
            
            inputList.add(x%10);
            x = x/10;
        }
        List<Integer> reverseInputList = new ArrayList<>(inputList);
        Collections.reverse(reverseInputList);
        if (reverseInputList.equals(inputList)){
            return true;
           
        }else{
         return false;
        }
    }
 
}
