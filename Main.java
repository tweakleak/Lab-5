class Main {
    public static void main(String[] args) {

        // Step 1 - Create a BST tree object called lab5Tree
        BST<Integer> lab5Tree = new BST<>();

        // Step 2 - Insert the values
        int[] values = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};

        for (int value : values) {
            lab5Tree.insert(value);
        }

        // Step 3 - Delete the value 17
        lab5Tree.delete(17);

        // Step 4 - Inorder traversal
        System.out.print("Inorder: ");
        lab5Tree.inorder();
        System.out.println();

        // Step 5 - Postorder traversal
        System.out.print("Postorder: ");
        lab5Tree.postorder();
        System.out.println();

        // Step 6 - Preorder traversal
        System.out.print("Preorder: ");
        lab5Tree.preorder();
        System.out.println();

        // Step 7 - Search for 36
        System.out.println("Search for 36: " + lab5Tree.search(36));

        // Step 8 - Search for 37
        System.out.println("Search for 37: " + lab5Tree.search(37));

        // Step 9 - Display path from root to 2
        System.out.print("Path to 2: ");
        for (BST.TreeNode<Integer> node : lab5Tree.path(2)) {
            System.out.print(node.element + " ");
        }
        System.out.println();

        // Step 10 - Display path from root to 34
        System.out.print("Path to 34: ");
        for (BST.TreeNode<Integer> node : lab5Tree.path(34)) {
            System.out.print(node.element + " ");
        }
        System.out.println();
    }
}
