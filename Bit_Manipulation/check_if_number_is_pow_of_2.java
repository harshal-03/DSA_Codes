package Bit_Manipulation;
/*
* Every number that is the power of two has only one set bit in its binary representation
* so if we do AND operation of that number with the one number less than it
* and if AND operation returns 0 as result then the given number is power of 2
*/
public class check_if_number_is_pow_of_2 {
    public static void main(String[] args) {
        int n = 13;
        System.out.println("Number is: "+ n);
        if((n&n-1) == 0){
            System.out.println("Power of 2");
        } else{
            System.out.println("Not a power of 2");
        }
    }
}
