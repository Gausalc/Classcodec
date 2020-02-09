import java.util.List;

class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingleList {
    public ListNode head;
    public MySingleList() {
        this.head = null;
    }
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    public ListNode reverseList(){
        ListNode prev = null;
        ListNode cur = this.head;
        ListNode newHead = null;
        while(cur != null) {
                ListNode curNext = cur.next;
                if (curNext==null){
                    newHead = cur;
                }
                cur.next = prev;
                prev = cur;
                cur = curNext;
        }
        return newHead;
    }
    public void display(){
        if(this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void display2(ListNode newHead){
        if(newHead == null) {
            return;
        }
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public int getLength() {
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public ListNode middleNode(){
        int len = getLength()/2;
        ListNode cur = this.head;
        for (int i = 0; i <len ; i++) {
            cur =cur.next;
        }
        return cur;
    }
    public ListNode middleNode2(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode findKthTail(int k){
        ListNode fast = this.head;
        ListNode slow = this.head;
        if (k<= 0 || head == null){
            return null;
        }
        while(k-1 >0){
            if(fast.next != null){
                fast = fast.next;
                k--;
            }
        }
        while(fast.next == null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}