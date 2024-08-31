package Stack_Queue_byTUF;

public class Stack_By_Array {
    private static int top = -1;
    public static int a[] = new int[10];
    // creating push() to insert the data into stack (array)
    public static void push(int x){
        top++;
        a[top] = x;
    }

    // pop() function to delete the element form the stack
    public static int pop(){
        int delEl = a[top];
        top--;
        return delEl;
    }

    // peek() function that returns the topmost element in the stack
    public static int peek(){
        return a[top];
    }

    //size() function to return the size of the stack
    public static int size(){
        return top+1;
    }

    // search() function
    public static int search(int x){
        for(int i=0; i<=top; i++){
            System.out.print("Element " + x + " is present at: ");
            return i;
        }
        System.out.println("element is not present so returning -1");
        return -1;
    }

    public static void main(String[] args) {
        Stack_By_Array s = new Stack_By_Array();

        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.peek());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.peek());
    }
}
