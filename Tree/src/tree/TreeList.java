/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */
//Done by following the content of week 3 https://moodle2025.ncirl.ie/course/section.php?id=40624 and the SLLExample app
public class TreeList implements TreeListInterface{//implements the interface that we did so now we just need to implement the methods.
    private TreeNode head;//Pointer, its pointing at the first node of the list
    private int iSize;//to keep the numbers of nodes in the list
    private TreeNode currentNode; //the reference to the current node that we are on the list
    private TreeNode previousNode; //the reference of the previous node from the position we are on.
    
    public TreeList(){
        head = null; //No nodes for now.
        iSize = 0; //the list starts empty
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
        if(iPosition == 1){ //If the positon is 1 we add at the hed new nodes, and that node points to the head we are on.
            TreeNode newNode = new TreeNode (tree, head);
            head = newNode;
        }else{ //If we are not on the position 1 we travel to the node we want with setcurrent node.
            setCurrentNode(iPosition);
            TreeNode newNode = new TreeNode(tree, currentNode);
            previousNode.setNext(newNode);
        }
        iSize++; //we make the list bigger.
    }
    
    @Override //We add a tree at the end of the list, and if the list is empty the head points to a new node. if not we go to the last node and we link the node at the end.
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
    
    @Override //returns the current position to TreeApp
    public TreeApp get(int iPosition){
        setCurrentNode(iPosition);
        return currentNode.getTree();
    }
    
    @Override //Removes the node of the positon we are marking. If its on the positon 1 removes the head and makes the new head the next node.
    public void remove(int iPosition){
        if(iPosition == 1){
            head = head.getNext();
        }else{
            setCurrentNode(iPosition);
            previousNode.setNext(currentNode.getNext());
        } 
        iSize--; //Makes de list smaller after removing a node.
    }
    
    private void setCurrentNode(int iPosition){
        int i;
        previousNode = null;
        currentNode = head;
        
        for (i = 1; i < iPosition; i++){ //This updates the current and previous node to point the corresponding node.
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }
    
    @Override
    public String display(){ //we go through the list and print all of them as seperate lines.
        TreeNode tempNode = head;
        String output = "";
        
        while (tempNode != null){
            output += tempNode.toString() + "\n";
            tempNode = tempNode.getNext();
        }
        return output;
    }
    
    public TreeNode getHead(){ //Returns the head.
        return head;
    }
}
