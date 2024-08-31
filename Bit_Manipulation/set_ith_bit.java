package Bit_Manipulation;

public class set_ith_bit {
    //converting decimal to binary
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
        int n = 13;
        int i = 1;
        System.out.println("Original Decimal value is: " + n);
        System.out.println("Index to set the bit is: " + i);
        System.out.println("Binary of the " + convert_to_Binary(n));
        //setting the ith bit
        n = (n|(1<<i));
        System.out.println("Binary after the bit is set: " + convert_to_Binary(n));
        System.out.println("Updated decimal value is: " + n);
    }
}
