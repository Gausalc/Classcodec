class ListNode{//定义节点
    public int data;
    public ListNode next;
    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
}
class MySingleList{
    public ListNode head;
    public MySingleList(){
        this.head = null;
    }
    //头插法
    public void addFirst(int data){//因为传值是数据
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head == null){
            this.head = node;
        }else{
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    //打印单链表
    public void display(){
        ListNode cur = this.head;
        if(this.head == null){
            return;
        }else{
            while(cur != null){
                System.out.println(cur.data+" ");
                cur = cur.next;
            }
        }
        System.out.println();
    }
    //插入到index位置
    public void addIndex(int index,int data){
        //tips:可以考虑一下输入不合法的问题
        if(index < 0 || index > getLength()) {
            System.out.println("输入不合法！");
        }
        ListNode node = new ListNode(data);
        if(index == 0){
            addFirst(data);
        }else{
            ListNode prev =searchIndex(index);
            node.next = prev.next;
            prev.next = node;
        }
    }
    //找到Index位置
    public ListNode searchIndex(int index){
        //tips:主要是要想到index的前驱问题
        ListNode prev = this.head;
        int count = 0;
        while(count< index-1){
            prev = prev.next;
            count++;
        }
        return prev;
    }
    //获取链表长度
    public int getLength(){
        int count = 0;
        ListNode cur = this.head;
        while(this.head != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    //查找是否包含关键字key是否在单链表中
    public boolean contain(int key){
        ListNode cur = this.head;
        while (this.head != null){
            if (cur.data == key){
                return true;
            }
            cur =cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    //找到前驱
    public ListNode searchPrev(int key){
        ListNode prev = this.head;
        while(this.head != null){
            if(prev.next.data == key){
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    public void remove(int key){
        //tips：需要考虑到  如果删除的节点是头节点的情况
        if (this.head.data == key){
            this.head =this.head.next;//直接让头节点变成第二个
            return;
        }
        //可以对寻找中返回为空值打印内容
        ListNode prev =searchIndex(key);
        if (prev == null){
            System.out.println("没有你要删除的节点");
        }
        prev.next = prev.next.next;
    }
    //删除关键字为key的节点
    public void removeAll(int key){
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while (this.head != null){
            if (cur.data == key){
                prev.next = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        //tips:如果删除的是头节点  情况不一样
        if (this.head.data == key){
            this.head = this.head.next;
        }
    }
    //反转一个单链表
    public ListNode reverseList(){
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = this.head;
        while (cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
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
    //返回链表的中间结点
    public ListNode middleList(){
        ListNode fast = this.head;
        ListNode slow =this.head;
        if(this.head != null){
            while(fast != null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
        return null;
    }
    //输出该链表中倒数第k个结点
    public ListNode findK(int k){
        if(k<=0){
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(k-1 >0){
            if(fast.next != null){
                fast = fast.next;
                k--;
            }else{
                System.out.println("没有你想要的节点");
                return null;
            }
        }
        while(fast.next!= null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    //以x为基准分割链表
    public ListNode partition(int x ){
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur =this.head;
        while (cur != null){
            if (cur.data < x){
                //是不是第一次插入
                if (bs ==null){
                    bs = cur;
                    be = cur;
                }else{
                    be.next = cur;
                    be = be.next;
                }
            }else{
                //是不是第一次插入
                if (as ==null){
                    as = cur;
                    ae = cur;
                }else{
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if (bs ==null){
            return as;
        }
        if (as != null){
            ae.next = null;
        }
        be.next = as;
        return bs;
    }
    //删除重复节点
    public ListNode deleteDuplication(){
        if (this.head == null){
            return null;
        }
        ListNode cur =this.head;
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (cur != null){
            //重复的节点
            if (cur.next != null && cur.data ==cur.next.data){
                //每一次都需要判断cur.next  会有王炸行为
                while (cur.next != null && cur.data ==cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;
                tmp.next = cur;
            }else{
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;//最后一个节点如果也是重复的
        return newHead.next;//返回虚拟节点的NEXT
    }
    //链表的回文结构
    public boolean chkPalindrome() {
        if (this.head == null){
            return false;
        }
        if (this.head.next == null){
            return true;
        }
        //1.找到单链表的中间节点
        ListNode fast = this.head;
        ListNode slow =this.head;
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //2.反转单链表
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3.fast/slow往前 head往后走
        while(slow != this.head){
            if(slow.data != head.data){
                return false;
            }
            if (this.head.next ==slow){
                return true;//特殊处理偶数
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return  true;
    }
    //判断是否有环
    public void createLoop(){
        ListNode cur = this.head;
        while(cur.next !=null ){
            cur = cur.next;
        }
        cur = this.head.next;
    }
    public boolean hasCycle(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next!= null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return false;
        }
        return true;
    }
    //找到环的进入点
    public ListNode detectCycle() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next!= null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
        slow = this.head;//  slow从头开始
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    //likou 138  复制带随机指针的链表
}