package leetcodes.MaximumWidthRamp;

public class Solution {

    public static int maxWidthRamp(int[] A) {

        int x = 0;
        int y = A.length-1;


        while(x!=y){
            if(A[x] <= A[y]){
                return y-x;
            }
            if(xDistanteToGoal(A, x, A[y])  < yDistanteToGoal(A, y, A[x]) ){
                x++;
            }else
                y--;



        }


        return y-x;
    }


    public static int xDistanteToGoal(int[] A, int xpos, int y){
        int distance = 0 ;
        int xNewPos = xpos;

        while(A[xNewPos] > y){
            if(xNewPos == A.length)
                return Integer.MAX_VALUE;
            xNewPos++;
        }
        return xNewPos - xpos;
    }
    public static int yDistanteToGoal(int[] A, int ypos, int x){
        int distance = 0 ;
        int xNewPos = ypos;

        while(A[xNewPos] < x){
            if(xNewPos == A.length)
                return Integer.MAX_VALUE;
            xNewPos--;
        }
        return ypos - xNewPos;
    }


    public static void main(String[] args) {
        int[] A  = {9,8,1,0,1,9,4,0,4,1};
        int[] b  = {6,0,8,2,1,5};
        int[] c  = {2,2,1};

        maxWidthRamp(A);
        maxWidthRamp(b);
        maxWidthRamp(c);

        assert(maxWidthRamp(A)==7);
        assert(maxWidthRamp(b)==4);

    }
}
