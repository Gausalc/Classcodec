public class TestDemo2 {
    //合并两个单链表
    //静态才能打印 下面DIPLAY执行在静态方法里
    public static ListNode mergeTwoLists(ListNode headA, ListNode headB){//静态才能打印
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (headA != null && headB != null){
            if (headA.data < headB.data){
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else{
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if (headA == null){
            tmp.next = headB;
        }
        if (headB == null){
            tmp.next = headA;
        }
        return newHead.next;
    }
    ////判断两个单链表是否相交
    //tips：一个节点只有一个next  所以是Y类型的相交  相交是地址的相交
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode pL = headA;//永远指向长的单链表
        ListNode pS = headB;//永远指向短的单链表
        int lenA = 0;
        int lenB = 0;
        //求的lenA  lenB
        while (pL != null) {
            lenA++;
            pL = pL.next;
        }
        while (pS != null) {
            lenB++;
            pS = pS.next;
        }
        pL = headA;
        pS = headB;
        //差值-》最长的单链表先走len步
        int len = lenA-lenB;
        if(len < 0) {
            pL = headB;
            pS = headA;
            len = lenB-lenA;
        }
        //让pL先走len步
        for (int i = 0; i <len ; i++) {
            pL = pL.next;
        }
        //开始一起走  (pL  != pS ) {一人一步走}
        while(pL != pS){
            pL = pL.next;
            pS = pS.next;
        }
        if (pL == null){
            return null;
        }
        return pL;
    }

    public static void CreateCut(ListNode headA, ListNode headB){
        headA.next =headB.next.next;
    }

    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        MySingleList mySingleList2 = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(3);
        mySingleList.addLast(5);
        mySingleList.addLast(7);
        mySingleList.display();
        //mySingleList.addLast(9);
        mySingleList2.addLast(2);
        mySingleList2.addLast(2);
        mySingleList2.addLast(3);
        mySingleList2.addLast(5);
        mySingleList2.addLast(7);
        mySingleList.display();
        CreateCut(mySingleList.head,mySingleList2.head);
        ListNode B = getIntersectionNode(mySingleList.head,mySingleList2.head);
        mySingleList.display2(B);
        //ListNode A = mergeTwoLists(mySingleList.head,mySingleList2.head);
        //mySingleList.display();
//        ListNode newHead =mySingleList.reverseList();
        //mySingleList.display2 (newHead);
//        System.out.println(mySingleList.middleList().data);
        //System.out.println(mySingleList.findK(3).data);
        //ListNode head = mySingleList.partition(9);
        //ListNode newHead = mySingleList.deleteDuplication();
        //mySingleList.display2(A);
        //System.out.println(mySingleList.chkPalindrome());
    }
}

