package leetcodes.validnumber;

public class validNumber {
    public boolean isNumber(String s) {
        s = s.trim();
        if(!s.matches(".*([0-9]|(\\.))") && s.length() > 1)
            return false;
        try{
            Float.parseFloat(s);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
