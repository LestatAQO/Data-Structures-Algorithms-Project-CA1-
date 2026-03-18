package tree;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */

//Today when I started checking the code done by hamilton in the examples of SLL https://moodle2025.ncirl.ie/course/section.php?id=40624I notice that on the diagram I didnt do the Interface neither the node, I forgot we had to do them in seperate files (Or at least thats how we did it when being taught)
public interface TreeListInterface { //This is the interface for the list, once i make that class this are the methods that it must implement
    public void add(int iPosition, TreeApp tree); //Add an object from TreeApp to a specific positon. Which is good if we want to do something in a different positon of the list.
    public void add(TreeApp tree); //we add trees to the end of the list
    public void remove(int iPosition); //removes the tree from an specific position
    public TreeApp get(int iPosition); //Gets the position of a specific tree, this way we can access to them by indexes.
    public boolean isEmpty(); // returns true if the list is empty, if not returns true.
    public int size(); //Returns total size of the list.
    public String display(); //With this we can display the whole list so we can see everything that has been saved.
}
