/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */
//I used the same content that i used for the interface to do my code. https://moodle2025.ncirl.ie/course/section.php?id=40623
import java.util.ArrayList;
public class TreeRecent implements TreeRecentInterface { //Implements is saying that we are inheriting the interface. Like i said there we know which methods MUST be implemented in here.
    private ArrayList<TreeApp> recentTree; //I create an array to save/store the objects, the array expands or reduces depending on the actions we take for the stack.
    public TreeRecent(){
        recentTree = new ArrayList<>(); //Initializes the array.
    }
    
    @Override
    public boolean isFull(){
        return false; //By returning false has no limit. If we want a size we could check the size with an if selecting a cap and comparing.
    }
    
    @Override
    public boolean isEmpty(){
        return recentTree.isEmpty(); //I mainly use the ArrayList method isempty to check if its empty, that way we can print a mesasge or do other things.
    }
    
    @Override //This way we add the objects (trees) and starts on the index 0 that would be the start of the list, so like this we have the behavior of last in first out.
    public void push(TreeApp tree){
        recentTree.add(0,tree); 
    }
    
    @Override //Removes the most recent addition, and returns what it was removed, it also returns null if the stack was empty.
    public TreeApp undo(){
        if(!isEmpty()){
            return recentTree.remove(0);
        }else{
            return null;
        }
    }
    
    @Override//total number of trees in the collection
    public int size(){
        return recentTree.size();
    }
}
