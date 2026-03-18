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
    
    private ArrayList <TreeMaintenanceTasks> treeQ;
    public TreeMaintenance(){
        treeQ = new ArrayList<>();
    }
    
    @Override
    public int size(){
        return treeQ.size();
    }
    @Override
    public boolean isEmpty(){
        return treeQ.isEmpty();
    }
    @Override
    public void newTask(int priority, String task){
        TreeMaintenanceTasks newTask = new TreeMaintenanceTasks(priority,task);
        
        int index = insertingPosition(priority);
        
        if(index >= size()){
            treeQ.add(newTask);
        }else{
            treeQ.add(index, newTask);
        }
    }
    
    private int insertingPosition(int newPriority){
        int i;
        for (i = 0; i < treeQ.size(); i++){
            if(treeQ.get(i).getPriority() < newPriority){
                break;
            }
        }
        return i;
    }
    
    @Override
    public String taskDone(){
        if(isEmpty()){
            return "There is no tasks pending";
        }
        return treeQ.remove(0).getTask();
    }
    
    @Override
    public String displayTasks(){
        String output = "";
        for(int i = 0; i < treeQ.size(); i++){
            output += treeQ.get(i).toString()+"\n";
        }
        return output;
    }
}
