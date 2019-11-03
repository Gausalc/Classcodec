//单链表
//节点类
class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingleList {

    public ListNode head;//标志头


    public MySingleList() {
        this.head = null;//空
    }

    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head =node;//第一次插入
        }else{
            node.next = this.head;
            this.head = node;//第二次插入
        }
    }
    //尾插法
    //1.判断是否为第一次插入
    //2.找尾巴
    //3.进行插入
    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        //1.判断是否为第一次插入
        if(this.head == null){
            this.head =node;
        }else{
            //2.找尾巴
            while(cur.next != null){
                cur = cur.next;//一直往后找下一个地址直到结束
            }
            //3.进行插入
            cur.next = node;

        }
    }
    //打印单链表数据
    public void  display(){
        if(this.head==null){
            return;
        }
        ListNode cur = this.head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println( );
    }
    //插入到index位置
    //index位置插入 需要找到index-1位置的节点的引用prev
    private ListNode searchIndex(int index) {
        ListNode prev = this.head;
        for (int i = 0; i <index -1 ; i++) {
            prev = prev.next;
        }
        return prev;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {
        //下标不合格
        if (index<0 || index> getLength()){
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next = node;
        return false;
    }
    //知道链表长度
    public int getLength(){
        int count = 0;
        ListNode cur = this.head;
        while(cur!= null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    //查找是否包含关键字key是否在单链表中
    public boolean contains(int key){
        //也可以选用不同的返回类型
        ListNode cur = this.head;
        while (cur == null){
            if (cur.data == key){
                return true;
            }
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    //1.找到前驱
    private ListNode searchPrev(int key){
        ListNode prev = this.head;
        while (prev.next !=null ){
            if (prev.next.data == key) {
                return prev;
            }

        }
        return null;
    }
       //1.判断删除的节点如果不是头节点  //--》1.找到前驱  找不到返回null 2.prev.next = del.next 进行删除
    public void remove(int key){
        if (this.head.data == key){
            this.head = this.head.next;
            return;
        }
        ListNode prev =searchPrev(key);
        if (prev == null){
            System.out.println("没有你想要的节点");
            return;
        }

        ListNode del = prev.next;
        //3.进行删除
        prev.next = del.next;

    }
    //删除关键字为key的节点
    public void remove2(int key){
        if(head == null){
            System.out.println( "错误！");
        }
        ListNode cur = this.head.next;
        ListNode prev = this.head;
        while(cur != null){
            if(prev.next.data == key){
                prev.next = cur.next;
                cur = cur.next;
            }
            else{
                prev = cur;
                cur = cur.next;
            }
        }
        //放最后删掉头节点
        if (this.head.data == key){
            this.head= this.head.next;
        }
    }
    //leetcode
}