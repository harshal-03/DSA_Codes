package Bit_Manipulation;

public class convert_Binary_to_Decimal {
    public static int convert_to_Decimal(String s){
        int n = 0;
        int len = s.length() - 1;
        int p2 = 1;

        for(int i = len; i>=0; i--){
            if(s.charAt(i) == '1'){
                n += p2; //as we don't have to worry about 0 becuase anything multiplied with 0 is 0
            }
            //incrementing the power of 2 for next iteration
            p2 *= 2;
        }
        return n;
    }

    public static void main(String[] args) {
        String s = "111";
        System.out.println("Binary number is: " + s);
        System.out.println("Decimal number is: " + convert_to_Decimal(s));
    }
}
