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
public class TreeMaintenance implements TreeMaintenanceInterface{
    
    private ArrayList <TreeMaintenanceTasks> treeQ; //Array for the Queue, to save up the tasks.
    public TreeMaintenance(){
        treeQ = new ArrayList<>();
    }
    
    
    public int size(){
        return treeQ.size();
    }
    @Override
    public boolean isEmpty(){
        return treeQ.isEmpty();
    }
    @Override
    public void newTask(int priority, String task){ //Creates a new task, finds the correct index and keeps them sorted on priority. If the index is the last one it appends it.
        TreeMaintenanceTasks newTask = new TreeMaintenanceTasks(priority,task);
        
        int index = insertingPosition(priority);
        
        if(index >= size()){
            treeQ.add(newTask);
        }else{
            treeQ.add(index, newTask);
        }
    }
    
    private int insertingPosition(int newPriority){ //Goes through the queue to find the position that the new taks will be inserted. organizes it from higher to lowe priority.
        int i;
        for (i = 0; i < treeQ.size(); i++){
            if(treeQ.get(i).getPriority() < newPriority){
                break;
            }
        }
        return i;
    }
    
    @Override
    public String taskDone(){ //removes the highest priority taks FIFO and tells you what was removed.
        if(isEmpty()){
            return "There is no tasks pending";
        }
        return treeQ.remove(0).getTask();
    }
    
    @Override
    public String displayTasks(){ //Shows all the taks as a string.
        String output = "";
        for(int i = 0; i < treeQ.size(); i++){
            output += treeQ.get(i).toString()+"\n";
        }
        return output;
    }
    public ArrayList<TreeMaintenanceTasks> getTasks(){ //I use this to access it on other file to save on a txt file
        return treeQ;
    }
}
