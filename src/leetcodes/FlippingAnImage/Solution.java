package leetcodes.FlippingAnImage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length/2; j++){
                int aux = A[i][j];
                A[i][j] = A[i][A[i].length-1-j];
                A[i][A[i].length-1-j] = aux;


            }
            for (int j = 0; j < A[i].length; j++)
                A[i][j] = Math.abs(A[i][j]-1);

        }

        return A;
    }
}
