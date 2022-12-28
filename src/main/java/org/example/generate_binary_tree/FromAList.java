package org.example.generate_binary_tree;

import org.example.binary_tree_node.B_Node;

import java.util.ArrayDeque;
import java.util.List;

/**
 * @Author: Austin Igboke
 * @Date: 28-12-2022
 * @email: augustineigboke@gmail.com
 *
 * @Description: It generates a binary tree recursively from the elements of the list passed to its constructor
 **/

public class FromAList {
    int startIndex = 0;
    int listSize = 0;
    B_Node root = null;
    List<String> list = null;
    ArrayDeque<B_Node> queue = new ArrayDeque<>();

    public FromAList(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.list = list;
            listSize = list.size();
            root = new B_Node(list.get(startIndex++));
            queue.add(root);
        }
    }

    public B_Node generateBinaryTree() {

        if (startIndex >= listSize) return root;

        B_Node node = queue.pollFirst();
        if (startIndex < listSize) {

            node.setLeftChild(new B_Node(list.get(startIndex++)));
            queue.offerLast(node.getLeftChild());
        }
        if (startIndex < listSize) {

            node.setRightChild(new B_Node(list.get(startIndex++)));
            queue.offerLast(node.getRightChild());
        }

        return generateBinaryTree();
    }

    public static void main(String[] args) {
        FromAList fromAList = new FromAList(List.of("A", "B", "C", "D", "E", "F", "G", "H"));
        B_Node root = fromAList.generateBinaryTree();
        fromAList.toString(root);
    }

    public void toString(B_Node root) {

        if (root == null ) return;

        System.out.println(root.getVal());

        toString(root.getLeftChild());
        toString(root.getRightChild());
//
    }
}
