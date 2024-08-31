package Bit_Manipulation;
/*
* Swapping two number using XOR operator, as it save the space of temporary variable
*/
public class Swap_to_numbers {
    public static void main(String[] args){
        int a = 5;
        System.out.println("a is: " + a);
        int b = 4;
        System.out.println("b is: " + b);

        System.out.println("swapped number are: ");
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Swapped a: " + a);
        System.out.println("Swapped b: " + b);
    }
}
