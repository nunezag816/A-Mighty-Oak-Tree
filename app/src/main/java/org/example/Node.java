package org.example;

public class Node {
    private Squirrel data;
    private Node left;
    private Node right;

    public Node(Squirrel data) {
        this.data = data;
    }

    public Squirrel getData() {
        return data;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public void setRight(Node node) {
        this.right = node;
    }

    public Node left() {
        return left;
    }

    public Node right() {
        return right;
    }
}
