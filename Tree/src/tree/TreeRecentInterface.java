/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tree;

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */
public interface TreeRecentInterface {
    public int size();
    public boolean isFull();
    public boolean isEmpty();
    public void push(TreeApp tree);
    public TreeApp remove();
    
}
