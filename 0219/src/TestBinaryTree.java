/**
 * Created with IntelliJ IDEA.
 * Description:二叉搜索树
 */

public class TestBinaryTree {

    static class Node {
        public int data;
        public Node left;
        public Node right;
        public int key;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;

    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
        } else {
            Node cur = root;
            Node parent = null;
            while (cur != null) {
                parent = cur;
                if (cur.key > key) {
                    cur = cur.left;
                } else if (cur.key < key) {
                    cur = cur.right;
                }
            }
            if (parent.key > key) {
                parent.left = new Node(key);
            } else if (parent.key < key) {
                parent.right = new Node(key);
            }
        }
    }

    //查找key
    public Node search(int key) {
        Node cur = root;
        while (cur != null) {
            if (cur.data > key) {
                cur = cur.left;
            }else if (cur.data < key) {
                cur = cur.right;
            } else {
                return cur;
            }
        }
        return null;
    }


    //删除关键字为key的节点
    public void remove(int key) {
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if(cur.data == key) {
                //找到了要删除的节点
                removeNode(parent,cur);
                return;
            }else if(cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
    }

    public void removeNode(Node parent,Node cur) {

        if (cur.left == null) {

            if (cur == root) {
                root = cur.right;
            } else if (cur == parent.left) {
                parent.left = cur.right;
            } else {
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            if (cur == root) {
                root = cur.left;
            } else if (cur == parent.left) {
                parent.left = cur.left;
            } else {
                parent.right = cur.left;
            }
        }
    }

}