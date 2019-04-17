package leetcodes.reverseinteger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.signum;
import static java.lang.Math.abs;

public class reverseInteger {


    public static int reverse(int x){
        List<Integer> integerList = new ArrayList<>();
        int signal = signum(x);


        while(Math.abs(x) >= 1){
            integerList.add(x%10);
            x = x/10;
        }
        Collections.reverse(integerList);
        int outputInteger = 0;
        for(int i = 0; i < integerList.size(); i++){
            try{
            outputInteger = Math.addExact(outputInteger,  (int) (integerList.get(i)*(Math.pow(10d, i))  ));

            }catch(Exception e){
             return 0;

            }

        }
     return (outputInteger);

    }

    public static void main(String[] args) {
        assert(reverse(321) == 123):"1";
        assert(reverse(-321) == -123):"12";
        assert(reverse(1) == 1):"13";
        assert(reverse(0) == 0):"14";
        assert(reverse(123) == 321):"15";
        assert(reverse(444) == 444):"16";
        assert(reverse(444) == 444):"17";
    }


}
