package tree;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Lestat Azariel Alvarez Quintana Ordiz
 */
public interface TreeMaintenanceInterface {
    public void newTask(int priority, String task);
    public int size();
    public boolean isEmpty();
    public String taskDone(); //changed the name from doingTask because is more clear what it does, it removes a task that has been done, not showing tasks in process. So even if its different than what it says on the diagram, i preffer better names for fuctions and variables that help understanding what its doing. 
    public String displayTasks();
}
