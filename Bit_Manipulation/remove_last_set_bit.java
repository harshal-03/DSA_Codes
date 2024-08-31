package Bit_Manipulation;

public class remove_last_set_bit {
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
    //removing the rightost set bit
    public static void main(String[] args) {
        int n = 12;
        System.out.println("Decimal number is: " + n);
        System.out.println("Binary is: " + convert_to_Binary(n));
        System.out.println("removing the last set bit of hte given number");
        n =( n & n-1 );
        System.out.println("The updated binary is: " + convert_to_Binary(n));
        System.out.println("The decimal becomes: " + n);
    }
}
