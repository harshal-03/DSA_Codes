package Stack_Queue_byTUF;

public class Stack_By_LL {
    // private inner class that holds the LL implementation
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    // top pointer node
    // Instance variable declaration of the top node pointer and the size variable
    Node top;
    int size;

    // default constructor
    public Stack_By_LL(){
        this.top = null;
        this.size = 0;
    }

    // push function
    public void push(int x){
        Node el = new Node(x);
        el.next = top;
        top = el;
        size++;
    }

    // pop function
    public int pop(){
        if(top==null) return -1;
        int x = top.data;
        Node temp = top;
        top = top.next;
        return x;
    }

    // size function
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printSt(){
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Stack_By_LL s = new Stack_By_LL();

        s.push(10);
        s.push(20);
        s.printSt();
        System.out.println("Element popped " + s.pop());
        System.out.println("Stack size: " + s.size());
        System.out.println("Stack is empty or not: " + s.isEmpty());
    }
}
