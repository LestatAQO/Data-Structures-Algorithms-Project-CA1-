/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author Lestat Azariel Alvrez Quintana Ordiz
 */
//this is the most important class, here i manage the list, queue, stack and handles the adding, removing trees and tasks, i followed multiple (2 and 3) weeks and emmers example to do this code, and some previous content from OPP for file handling and a few small things.
import java.io.*;
public class Tree {
    private TreeList trees;
    private TreeMaintenance maintenance;
    private TreeRecent recent;
    private final String treesFile = "trees.txt"; //Text file titles where data will be saved and loaded from.
    private final String tasksFile = "tasks.txt";
    
    public Tree(){
        trees = new TreeList(); //intializes the list.
        maintenance = new TreeMaintenance(); // initializes the queue
        recent = new TreeRecent(); //initializes the stack
        
        //Loading Files so we have the old data.
        loadTrees(treesFile); //Loads both files so we make sure that the old data is there.
        loadTasks(tasksFile);
    }
    
    public void addTree(TreeApp tree){ //adds new content to the corresponding place from the inputs.
        trees.add(tree);
        recent.push(tree);
        saveTrees(treesFile);
    }
    
    public String showTrees(){
        return trees.display();
    }
    public String removeTree(int position){ //Removes tree from the position we say, saves the list on the file and returns a confirmation.
        if(trees.isEmpty()){
            return "There are no trees to remove";
        }
        TreeApp removed = trees.get(position);
        trees.remove(position);
        saveTrees(treesFile);
        
        return "The Information removed was: " + removed.showData();
    }
    
    public String undoTree(){ //Reverts last tree added. Goes through the list to remove the same tree and saves it on the txt file.
        TreeApp removed = recent.undo();
        
        if(removed == null){
            return "There is nothing to undo";
        }
        TreeNode temp = trees.getHead();
        int index = 1;
        while (temp != null){
            if (temp.getTree() == removed){
                trees.remove(index);
                break;
            }
            temp = temp.getNext();
            index++;
        }
        saveTrees(treesFile);
        return "The changes that have been undone are: " + removed.showData();
    }
    
    public void orderMaintanace(int priority, String task){ //Create a new task and saves its information.
        maintenance.newTask(priority, task);
        saveTasks(tasksFile);
    }
    
    public String completeTask(){ //Removes the highets priority task, and updates the file. Returns a the data of the task we remove to the texxt area so we can see what was done.
        String done = maintenance.taskDone();
        saveTasks(tasksFile);
        return done;
        
    }
    
    public String showTasks(){ //displays all the current tasks
        return maintenance.displayTasks();
    }
    
    //This was done by following OOP content on file handling https://moodle2025.ncirl.ie/course/section.php?id=10349 and with the website Geeks for Geeks
    public void saveTrees(String file){ //with this we create a writer that saves the data on a txt file. 
        try{
            PrintWriter writer = new PrintWriter(new FileWriter(file));
            TreeNode temp = trees.getHead();
            while(temp != null){
                TreeApp tree = temp.getTree();
                writer.println(tree.getTreeNumber() + "," + tree.getTreeSpecie()+","+ tree.getTreeLocation()+ "," + (tree instanceof TreeRegion ? ((TreeRegion) tree).getRegion(): "") );
                temp = temp.getNext();
            }
            writer.close();
        }catch(IOException e){
            System.err.println("There was en error saving the trees: " + e.getMessage());
        }
    }
    //loads the data from the files and puts them back on the TreeList and TreeRecent.
    public void loadTrees(String file){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line=reader.readLine())!=null){
                String[] parts = line.split(",");
                int number = Integer.parseInt(parts[0]);
                String specie = parts[1];
                String location = parts[2];
                String region = parts.length > 3 ? parts[3]: "";
                TreeApp tree = new TreeRegion(number, specie, location, region);
                trees.add(tree);
                recent.push(tree);
            }
            reader.close();
        }catch(IOException e){
            System.err.println("There was en error loading the trees: " + e.getMessage());
        }
    }
    //Very similar as saving the trees, but it this case the tasks.
    public void saveTasks(String file){
        try{  
            PrintWriter writer = new PrintWriter(new FileWriter(file));
            for(TreeMaintenanceTasks task : maintenance.getTasks()){
                writer.println(task.getPriority()+","+task.getTask());
            }
                 writer.close();
        }catch(IOException e){
            System.err.println("There was en error saving the tasks: " + e.getMessage());
        }
    }
    //Loads the tasks and queues them.
    public void loadTasks(String file){
        try{  
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                int priority = Integer.parseInt(parts[0]);
                String task = parts [1];
                maintenance.newTask(priority, task);
            }
            reader.close();
        }catch(IOException e){
            System.err.println("There was en error loading the tasks: " + e.getMessage());
        }
    }        
}
    

