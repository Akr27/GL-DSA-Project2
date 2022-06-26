package com.gl.javafsd.dsa.transactionscalculator.driver;

class NodeGen {
    int value;
    NodeGen left;
    NodeGen right;

    NodeGen(int item) {
        value = item;
        left = right = null;
    }
}

class Main {
    public static NodeGen node;
    static NodeGen prevNode = null;
    static NodeGen headNode = null;

    static void convertBSTtoSkewed(NodeGen root) {

        if (root == null) {
            return;
        }

        convertBSTtoSkewed(root.left);
        NodeGen rightNode = root.right;
        NodeGen leftNode = root.left;

        if (headNode == null) {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }

        convertBSTtoSkewed(rightNode);
    }

    static void traverseRightSkewedTree(NodeGen root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        traverseRightSkewedTree(root.right);
    }

    public static void main(String[] args) {

        Main tree = new Main();
        tree.node = new NodeGen(50);
        tree.node.left = new NodeGen(30);
        tree.node.right = new NodeGen(60);
        tree.node.left.left = new NodeGen(10);
        tree.node.right.left = new NodeGen(55);

        convertBSTtoSkewed(node);
        System.out.println("The resultant  output is :");
        traverseRightSkewedTree(headNode);
    }
}
