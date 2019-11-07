public class TestDemo2 {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(4);
        //mySingleList.display();
        mySingleList.reverseList();
        ListNode newHead =mySingleList.reverseList();
        mySingleList.display2 (newHead);
    }
}
