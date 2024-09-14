public class CircularQueue {
    static  int[] q ;
    static  int front, rear ,N;
    CircularQueue(int k)
    {
        this.front = -1;
        this.rear = -1;
        this.N = k;
        q = new int[k];
    }
    // this is test code
    public static boolean enQueue(int ele)
    {
        if(front == -1 && rear == -1 )
        {
            front++;
            rear++;
            q[rear] = ele;
            return true;
        } else if (((rear + 1)%N) == front) {
            System.out.println("Q is full");
            return false;
        }
        else {
            rear = (rear+1 )%N;
            q[rear] = ele;
            return true;
        }
    }
    public boolean deQueue()
    {
        if(rear == -1 && front == -1)
        {
            return false;

        }else if(front == rear) {
            rear = -1;
            front = -1;
            return  true;
        }else {
            front = ((front+1)%N);
            return true;
        }
    }
    public boolean isEmp()
    {
        if(rear == -1 && front ==-1 )
        {
            return true;
        }
        return false;
    }
}
