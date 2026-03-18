/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */
//this is the data container, used as reference the week 3  https://moodle2025.ncirl.ie/course/section.php?id=40624 
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

    public String toString(){ //same as with TreeAPP translates it to a string so its formated and readeable when asking for the output.
        return "Priority level = "+ priority + "\n Task = " + task;
    }
    
}
