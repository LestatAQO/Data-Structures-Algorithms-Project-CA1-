/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */
public class TreeNode {
    private Tree tree;
    private TreeNode next;
    
    public TreeNode(Tree inTree, TreeNode inNode){
        tree = inTree;
        next = inNode;
    }
    
    public TreeNode getNext(){
        return next;
    }
    public void setNext(TreeNode inNode){
        next = inNode;
    }
    public Tree getTree(){
        return tree;
    }
    public void setTree(Tree inTree){
        tree = inTree;
    }
    public String toString(){
        return tree.showData();
    }
}
