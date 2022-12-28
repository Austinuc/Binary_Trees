package org.example.binary_tree_node;

/**
 * @Author: Austin Igboke
 * @Date: 28-12-2022
 * @email: augustineigboke@gmail.com
 *
 * @Description: A custom node for binary trees
 **/
public class B_Node {
    private String val;
    private B_Node leftChild;
    private B_Node rightChild;

    public B_Node() {
        val = null;
        leftChild = null;
        rightChild = null;
    }

    public B_Node(String val) {
        this.val = val;
        leftChild = null;
        rightChild = null;
    }

    public B_Node(String val, B_Node leftChild, B_Node rightChild) {
        this.val = val;
        this.leftChild = leftChild;
        this.rightChild = rightChild;

    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }


    public B_Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(B_Node leftChild) {
        this.leftChild = leftChild;
    }

    public B_Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(B_Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "{" +
                "val='" + val +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                "}";
    }
}
