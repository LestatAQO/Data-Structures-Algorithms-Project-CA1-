package tree;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */

public interface TreeListInterface {
    public void add(int iPosition, Tree tree);
    public void add(Tree tree);
    public Tree get(int iPosition);
    public boolean isEmpty();
    public int size();
    public String printList();
}
