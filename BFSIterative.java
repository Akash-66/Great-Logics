// Method to traverse the elements of a tree using BFS (level-order traversal) in iterative way using queue
void levelOrderOrBFS() {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);

    while (!queue.isEmpty()) {
        Node temp = queue.peek();
        queue.remove();
        System.out.print(temp.data + " ");

        // enqueue left child into queue
        if (temp.left != null)
            queue.add(temp.left);

        // enqueue right child into queue
        if (temp.right != null)
        queue.add(temp.right);
    }
}