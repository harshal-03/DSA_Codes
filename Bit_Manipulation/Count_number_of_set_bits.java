package Bit_Manipulation;

public class Count_number_of_set_bits {
    public static void main(String[] args) {
        int x = 12;
        int n = x;
        int cnt = 0;
        while(n != 0){
            // the below operation removes the set bits and cnt increments for every removal of set bit
            // the number of cnt is incremented that is the number of times the set bits are removed
            // basically giving the total number of set bits removed which the number of set bits in a
            n = n&(n-1);
            cnt++;
        }
        System.out.println("The number of set bit in " + x + " are: " + cnt);
    }
}
