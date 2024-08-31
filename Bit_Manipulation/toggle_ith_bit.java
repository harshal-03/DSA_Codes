package Bit_Manipulation;

public class toggle_ith_bit {
    public static String convert_to_Binary(int n){
        StringBuilder res = new StringBuilder();

        while(n != 1){
            if(n % 2 == 1){
                res.append(1);
            }else{
                res.append(0);
            }
            n /= 2;
        }
        res.append(1);
        return res.reverse().toString();
    }
    public static void main(String[] args) {

    }
}
