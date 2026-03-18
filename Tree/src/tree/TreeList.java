/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */
public class TreeList implements TreeListInterface{
    private TreeNode head;
    private int iSize;
    private TreeNode currentNode;
    private TreeNode previousNode;
    
    public TreeList(){
        head = null;
        iSize = 0;
        currentNode = null;
        previousNode = null;
    }
    
    @Override
    public boolean isEmpty(){
        return iSize == 0;
    }
    
    @Override
    public int size(){
        return iSize;
    }
    
    @Override
    public void add(int iPosition, TreeApp tree){
        if(iPosition == 1){
            TreeNode newNode = new TreeNode (tree, head);
            head = newNode;
        }else{
            setCurrentNode(iPosition);
            TreeNode newNode = new TreeNode(tree, currentNode);
            previousNode.setNext(newNode);
        }
        iSize++;
    }
    
    @Override
    public void add(TreeApp tree){
        TreeNode newNode = new TreeNode(tree, null);
        if (head == null){
            head = newNode;
        }else{
            setCurrentNode(iSize);
            currentNode.setNext(newNode);
        }
        iSize++;
    }
    
    @Override
    public TreeApp get(int iPosition){
        setCurrentNode(iPosition);
        return currentNode.getTree();
    }
    
    @Override
    public void remove(int iPosition){
        if(iPosition == 1){
            head = head.getNext();
        }else{
            setCurrentNode(iPosition);
            previousNode.setNext(currentNode.getNext());
        }
        iSize--;
    }
    
    private void setCurrentNode(int iPosition){
        int i;
        previousNode = null;
        currentNode = head;
        
        for (i = 1; i < iPosition; i++){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }
    
    @Override
    public String display(){
        TreeNode tempNode = head;
        String output = "";
        
        while (tempNode != null){
            output += tempNode.toString() + "\n";
            tempNode = tempNode.getNext();
        }
        return output;
    }
}
