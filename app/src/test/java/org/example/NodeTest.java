package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {

    @Test
    public void testNodeCreation() {
        Squirrel squirrel = new Squirrel("Nutty");
        Node<Squirrel> node = new Node<>(squirrel);

        assertNotNull(node);
        assertEquals("Nutty", node.getData().getName());
        assertNull(node.left());
        assertNull(node.right());
    }

    @Test
    public void testLeftAndRightChildrenAssignment() {
        Squirrel parentSquirrel = new Squirrel("Parent");
        Squirrel leftSquirrel = new Squirrel("Lefty");
        Squirrel rightSquirrel = new Squirrel("Righty");

        Node<Squirrel> parent = new Node<>(parentSquirrel);
        Node<Squirrel> leftChild = new Node<>(leftSquirrel);
        Node<Squirrel> rightChild = new Node<>(rightSquirrel);

        parent.setLeft(leftChild);
        parent.setRight(rightChild);

        assertNotNull(parent.left());
        assertNotNull(parent.right());

        assertEquals("Lefty", parent.left().getData().getName());
        assertEquals("Righty", parent.right().getData().getName());
    }

    @Test
    public void testDeepTreeStructure() {
        Node<Squirrel> root = new Node<>(new Squirrel("Root"));
        Node<Squirrel> left = new Node<>(new Squirrel("Left"));
        Node<Squirrel> right = new Node<>(new Squirrel("Right"));
        Node<Squirrel> leftLeft = new Node<>(new Squirrel("LeftLeft"));

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(leftLeft);

        assertEquals("Root", root.getData().getName());
        assertEquals("Left", root.left().getData().getName());
        assertEquals("Right", root.right().getData().getName());
        assertEquals("LeftLeft", root.left().left().getData().getName());
    }
}
