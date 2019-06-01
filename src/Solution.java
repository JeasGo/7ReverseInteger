import java.util.Arrays;

class Solution {
    public static int reverse(int x) {
        Double max = Double.valueOf(1L<<32-1);
        Double min = Double.valueOf(-1L<<32);
        String s = String.valueOf(x);
        String[] split = s.split("");
        Boolean isPositive = false;
        String tmp=null;
        if (split[0].equals("-")){
            isPositive = true;
            split = Arrays.copyOfRange(split,1,split.length);
        }else {
            split = Arrays.copyOfRange(split,0,split.length);

        }
        for (int i = 0 ; i< split.length/2 ;i++){
            tmp = split[i];
            split[i] = split[split.length-1-i];
            split[split.length-1-i] =tmp;
        }
        if (split[0].equals('0')){
            split = Arrays.copyOfRange(split,1,split.length);
        }


        StringBuffer str5 = new StringBuffer();
        for (String s1 : split) {
            str5.append(s1);
        }
        double s1 = Double.parseDouble(str5.toString());
        if (s1 >max || s1< min){
            s1 =0D;
        }
        if (isPositive){
            return (int)-s1;
        }
        return (int)s1;
    }
}