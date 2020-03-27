public class TestDemo2 {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        //mySingleList.addLast(3);
        mySingleList.addLast(2);
        mySingleList.addLast(1);
        //mySingleList.display();
//        ListNode newHead =mySingleList.reverseList();
//        mySingleList.display2 (newHead);
//        System.out.println(mySingleList.middleList().data);
        //System.out.println(mySingleList.findK(3).data);
        //ListNode head = mySingleList.partition(9);
        //ListNode newHead = mySingleList.deleteDuplication();
        //mySingleList.display2(head);
        System.out.println(mySingleList.chkPalindrome());
    }
}
