/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tree;

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */
// I used the contents of week 2 to do this https://moodle2025.ncirl.ie/course/section.php?id=40623 with some help of W3Schools and Geeks for Geeks for syntax or for a different explenation in case something wasnt clear.
public interface TreeRecentInterface { //This interface is so I define the methods that the TreeRecent class HAS to use and will be implemented there.. 
    public int size(); //number of trees stored.
    public boolean isFull(); //is the stack full?
    public boolean isEmpty();//Is the stack empty?
    public void push(TreeApp tree);//Adds a tree to the stack, LIFO. Last in frist out. SO when we do UNDO is only the last input.
    public TreeApp undo(); //removes and returns the last tree that we added.
    
}
