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
    
}
