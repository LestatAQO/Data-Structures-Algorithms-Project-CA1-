/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */
public class TreeMaintenanceTasks {
    private int priority;
    private String task;
    
    public TreeMaintenanceTasks (int priority, String task){
        this.priority = priority;
        this.task = task;
    }
    public int getPriority(){
        return priority;
    }
    public String getTask(){
        return task;
    }

    public String toString(){
        return "Priority level = "+ priority + "\n Task = " + task;
    }
    
}
