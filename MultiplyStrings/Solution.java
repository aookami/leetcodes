class Solution {
    public String multiply(String num1, String num2) {
     java.math.BigInteger num1b = new java.math.BigInteger(num1);
     java.math.BigInteger num2b = new java.math.BigInteger(num2);
        

        return String.valueOf(num1b.multiply(num2b));
        
    }
}
