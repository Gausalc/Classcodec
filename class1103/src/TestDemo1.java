public class TestDemo1 {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addFirst(2);
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(4);
        mySingleList.addLast(2);
        mySingleList.remove2(2);
        //mySingleList.remove(2);mySingleList.remove(2);
        mySingleList.display( );
    }
}
