package Bit_Manipulation;
/*
* the left shift operator background formula is :- num << k = num * 2(pow)k
* here we are shifting 1 on left side till given index and thus in this case 1 becomes 2 where
* binary of 2 = 10, and then we perform AND operation between given N and 10 if the AND operation
* return 1 then bit is set else not
*/
public class check_if_ith_bit_is_set {
    public static boolean bit_set_or_not(int n, int index){
        // always keep the if-condition as it is
        if((n & (1<<index)) != 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 13; // decimal value
        int i = 2; // index where we want to check whether the bit is set or not
        System.out.println("Decimal value is: " + n);
        System.out.println("The idx where we want to check the bit is set or not is: " + i);
        System.out.println("The i'th bit is set: " + bit_set_or_not(n,i));
    }
}
