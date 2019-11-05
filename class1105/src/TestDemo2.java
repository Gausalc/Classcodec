public class TestDemo2 {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addFirst(5);
        mySingleList.addFirst(4);
        mySingleList.addFirst(3);
        mySingleList.addFirst(2);
        mySingleList.addFirst(1);
        mySingleList.display();
        System.out.println(mySingleList.findKthTail(3).data);
//        ListNode newHead =mySingleList.reverseList();
//        mySingleList.display2 (newHead);
//        System.out.println(mySingleList.middleNode().data);
//        System.out.println(mySingleList.middleNode2().data);
    }
}