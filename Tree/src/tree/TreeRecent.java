/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */
import java.util.ArrayList;
public class TreeRecent implements TreeRecentInterface {
    private ArrayList<TreeApp> recentTree;
    public TreeRecent(){
        recentTree = new ArrayList<>();
    }
    
    @Override
    public boolean isFull(){
        return false; //By returning false has no limit.
    }
    
    @Override
    public boolean isEmpty(){
        return recentTree.isEmpty();
    }
    
    @Override
    public void push(TreeApp tree){
        recentTree.add(0,tree); 
    }
    
    @Override
    public TreeApp remove(){
        if(!isEmpty()){
            return recentTree.remove(0);
        }else{
            return null;
        }
    }
    
    @Override
    public int size(){
        return recentTree.size();
    }
}
