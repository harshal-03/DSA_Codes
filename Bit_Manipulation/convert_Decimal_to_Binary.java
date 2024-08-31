package Bit_Manipulation;

public class convert_Decimal_to_Binary {
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
        int  n= 7;
        System.out.println("Decimal number is: " + n);
        System.out.println("Binary of given decimal number is: " + convert_to_Binary(n));
    }
}
