public class MyListQueue {
    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public Node front;
    public Node rear;
    public int usedSize;

    //入队
    public void offer(int data) {
        Node node = new Node(data);
        if (usedSize == 0 ){
            this.front = node;
            this.rear = node;
        }else{
            this.front.next = node;
            this.rear = this.rear.next;
            this.usedSize++;
        }
    }
}