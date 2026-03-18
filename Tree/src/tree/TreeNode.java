/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */
//the sll structure i did it by following the contents of week 3 https://moodle2025.ncirl.ie/course/section.php?id=40624 and using the "SLLExample app" to as reference.
public class TreeNode { //With this i represent a single node for the linked list. The nodes are going to store objects from TreeApp and a reference to the next node (one of each per node)
    private TreeApp tree; //has the TreeApp object
    private TreeNode next; //This is the pointer 
    
    public TreeNode(TreeApp inTree, TreeNode inNode){
        tree = inTree; //this sets the data of the tree
        next = inNode;//While this sets the reference to the next node.
    }
    
    public TreeNode getNext(){
        return next;
    }
    public void setNext(TreeNode inNode){
        next = inNode;
    }
    public TreeApp getTree(){
        return tree;
    }
    public void setTree(TreeApp inTree){
        tree = inTree;
    }
    public String toString(){ //This helps to print the node direclty, outputs a string of the tree that is on the current node and uses the method from TreeApp to display it.
        return tree.showData();
    }
}
