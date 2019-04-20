package leetcodes.HammingDistance;


public class Solution {

    public static int hammingDistance(int x, int y) {

        String xAsBinary = Integer.toBinaryString(x);
        String yAsBinary = Integer.toBinaryString(y);

        xAsBinary = new StringBuilder(xAsBinary).reverse().toString();
        yAsBinary = new StringBuilder(yAsBinary).reverse().toString();

        if(xAsBinary.length() < yAsBinary.length()){
            String aux = xAsBinary;
            xAsBinary = yAsBinary;
            yAsBinary = aux;
        }//Now xAsBinary is always bigger or equals y as binary


        //The distance is the number of differences between the two strings, plus the number of ones in the bigger-smaller
        //set subtraction
        int sum = 0;
        for(int i =0; i < yAsBinary.length(); i++){
            if(yAsBinary.charAt(i) != xAsBinary.charAt(i)){
                sum++;
            }
        }
        if(xAsBinary.length() != yAsBinary.length()){
            for(int i = yAsBinary.length(); i <xAsBinary.length(); i++){
                if(xAsBinary.charAt(i) == '1'){
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
    hammingDistance(1,4 );

    }

}
