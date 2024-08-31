package Bit_Manipulation;

public class To_check_no_is_odd_or_even {
    public static String odd_or_even(int n){
        String ans = " ";
        /*
        * the LSB of the even number is always 0 and performing AND (&) operation with the
        * 0 gives 0 as answer
        * the LSB of odd number is always 1 and performing AND operation on 1 with 1 returns
        * 1 as answer
        */
        if((n & 1) == 0) ans = "even";
        else ans = "odd";
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Number is: " + n + " and it is -> " + odd_or_even(n));

    }
}
