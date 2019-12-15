public class TestDemo1 {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.buildTree();
        /*binaryTree.preOrderTraversal(root);
        System.out.println(root);
        binaryTree.inOrderTraversal(root);
        System.out.println(root);
        binaryTree.postOrderTraversal(root);
        System.out.println(root);*/
        binaryTree.find(root,'h');

    }
}
