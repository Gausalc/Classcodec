class ListNode{
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
    public void addFirst(int data){
        ListNode node = new ListNode(data);//新建插入项
        if (head == null){//判断是否是第一次插入
            this.head = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur = this.head;//cur从头开始进行
        if(head == null){
            this.head = node;
        }else{
            while(cur.next != null){
                cur = cur.next;//没找到尾巴前  cur一直往下一位移动
            }
            //开始插入
            cur.next = node;
        }
    }
    //打印单链表数据
    public void display(){
        ListNode cur = this.head;
        if(head ==null){
            return;//如果为空没有打印必要
        }else{
            while(cur.next != null){
                System.out.println(cur.data+' ');
                cur = cur.next;
            }
        }
        System.out.println( );
    }
    //插入到index位置
    //找到前驱
    public ListNode searchIndex(int index){
        ListNode prev = this.head;
        int count = 0;
        while (count<index-1){
            prev=prev.next;
            count++;
        }
        return prev;
    }
    public boolean addIndex(int index,int data){
        //判断下标是否合法
        if(index < 0 || index > getLength()) {
            return false;
        }
        if (index == 0){
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next = node;
        return false;
    }
    //链表长度
    public int getLength(){
        int count = 0;
        ListNode cur = this.head;
        while(cur != null){
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
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    private ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while (prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    public void remove(int key){
        //1、删除的节点如果是头结点
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //找到前驱
        //如果返回值为空
        ListNode prev = searchPrev(key);
        if(prev == null) {
            System.out.println("没有你要删除的节点");
            return;
        }
        ListNode del = prev.next;
        //3、进行删除
        prev.next = del.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
       ListNode prev = this.head;
       ListNode cur = this.head.next;
       while(cur != null){
           if(cur.data == key){
               prev.next = cur.next;
               cur = cur.next;
           }else{
               prev = cur;
               cur = cur.next;
           }
       }
       if(this.head.data == key){
           this.head = this.head.next;
       }
    }
    public void clear(){
        //this.head = null;
        while (this.head.next != null) {
            ListNode cur = this.head.next;
            this.head.next = cur.next;
        }
        this.head = null;
    }
}