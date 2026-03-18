/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author Lestat Azariel Alvrez Quintana Ordiz
 */
public class Tree {
    private TreeList trees;
    private TreeMaintenance maintenance;
    private TreeRecent recent;
    
    public Tree(){
        trees = new TreeList();
        maintenance = new TreeMaintenance();
        recent = new TreeRecent();
    }
    
    public void addTree(TreeApp tree){
        trees.add(tree);
        recent.push(tree);
    }
    
    public String showTrees(){
        return trees.display();
    }
    public String removeTree(int position){
        if(trees.isEmpty()){
            return "There are no trees to remove";
        }
        TreeApp removed = trees.get(position);
        trees.remove(position);
        
        return "The Information removed was: " + removed.showData();
    }
    
    public String removeTree(){
        TreeApp removed = recent.remove();
        
        if(removed == null){
            return "There is nothing to undo";
        }
        return "The changes that have been undone are: " + removed.showData();
    }
    
    public void orderMaintanace(int priority, String task){
        maintenance.newTask(priority, task);
    }
    
    public String completeTask(){
        return maintenance.taskDone();
    }
    
    public String showTasks(){
        return maintenance.displayTasks();
    }
    
}
