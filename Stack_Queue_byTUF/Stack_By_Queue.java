package Stack_Queue_byTUF;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_By_Queue {
    Queue<Integer> q1,q2;

    // push function
    public Stack_By_Queue(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }

    // pop function
    public int pop(){
        return q1.poll();
    }

    // top function
    public int top(){
        return q1.peek();
    }

    public int size(){
        return q1.size();
    }

    // empty function
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    public static void main(String[] args) {
        Stack_By_Queue s = new Stack_By_Queue();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println("Top of the stack: " + s.top());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.top());
        System.out.println("Size of the stack after removing element: " + s.size());
    }
}
