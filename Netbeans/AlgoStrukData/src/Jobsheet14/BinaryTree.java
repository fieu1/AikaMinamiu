/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet14;

/**
 *
 * @author Aikacchii
 */
public class BinaryTree {
      Node root;
      int amount = 0;
    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) { //check are tree is empty
            root = new Node(data); //if empty, first node is root
        } else { //if not empty
            insertNode(root, new Node(data)); //call method insert
        }
    }

    void insertNode(Node current, Node newNode) {
        if (newNode.data < current.data) { //if data is smaller
            if (current.left == null) { // and the left is null
                current.left = newNode; //insert in left
            } else { //if not null
                insertNode(current.left, newNode); //recursive
            }
        } else if (newNode.data > current.data) { //if data is bigger
            if (current.right == null) { //and the right is null
                current.right = newNode; //insert in right
            } else { //if not null
                insertNode(current.right, newNode); //recursive
            }
        }
    }
    
     void printLeaf(Node node) {
      
        if (node == null) { //if node is null
            return; //return
        }

        if (node.left == null && node.right == null) {
            //if no child
            System.out.print(node.data + " "); //print data
            amount++;
            return; //return
        }
        if (node.left != null) { //if node left not null
            printLeaf(node.left); //traverse
        }
        if (node.right != null) { //if node right not null
            printLeaf(node.right); //traverse
        }
    }
    
    int Leaf(Node node) {
        
        if (node == null) { //if node is null
            return amount; //return amount
        }
        if (node.left == null && node.right == null) {
            //if no child
            amount++; 
            //increase amount that have been declared outside function
            return amount; //return amount
        }

        if (node.left != null) { //if node left not null
           Leaf(node.left); //recursive
        }
        if (node.right != null) { //if node right not null
            Leaf(node.right); //recursive
        }
        return amount;
    }


    boolean find(int data) {
        boolean result = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void minMax(Node node) {
        int min, max;
        min = Min(node);
        max = Max(node);
        System.out.println("Minimum value : " + min);
        System.out.println("Maximum value : " + max);
    }

    int Min(Node node) {
        int min;
        if (node.left == null) {
            return node.data;
        } else {
            return Min(node.left);
        }
    }

    int Max(Node node) {
        int max;
        if (node.right == null) {
            return node.data;
        } else {
            return Max(node.right);
        }
    }
    
    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traversePreOrder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if(isLeftChild){
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}
