package Stack_Queue_byTUF;

public class Queue_By_Array {
    private static int front = -1;
    private static int rear = -1;
    private static int arr[] = new int[10];
    private static  int currSize=0;

    // push function
    public void offer(int x){
        if(currSize ==arr.length){
            System.out.println("Queue is full");
        }
        if(currSize==0){
            front = 0;
            rear=0;
        }else{
            // keeping the rear in-bound to arrays length by moving it one step ahead
            rear = (rear+1)%arr.length;
        }
        arr[rear] = x;
        currSize++;
    }
    // pop function
    public int poll(){
        if(currSize==0) {
            System.out.println("Queue is already empty");
            return -1;
        }
        int el = arr[front];
        if(currSize==1){
            front = -1;
            rear = -1;
        }
        else{
            //moving the "front" ahead to 2nd element in the queue
            front = (front+1)% arr.length;
        }
        currSize--;
        return el;
    }

    // top function
    public int peek(){
        if(currSize==0) return -1;
        return arr[front];
    }

    // size function
    public int size() {
        return currSize;
    }
    public static void main(String[] args) {
        Queue_By_Array q = new Queue_By_Array();
        q.offer(4);
        q.offer(14);
        q.offer(24);
        q.offer(34);
        System.out.println("The peek of the queue before deleting any element " + q.peek());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.poll());
        System.out.println("The peek of the queue after deleting an element " + q.peek());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}
