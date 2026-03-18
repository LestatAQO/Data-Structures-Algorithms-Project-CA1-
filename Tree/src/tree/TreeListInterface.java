package tree;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */

//Today when I started checking the code done by hamilton in the examples of SLL I notice that on the diagram I didnt do the Interface neither the node, I forgot we had to do them in seperate files (Or at least thats how whe where being taught)
public interface TreeListInterface {
    public void add(int iPosition, Tree tree);
    public void add(Tree tree);
    public Tree get(int iPosition);
    public boolean isEmpty();
    public int size();
    public String printList();
}
