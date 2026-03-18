/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tree;

/**
 *17/03/2026
 * @author Lestat Alvarez Quintana Ordiz
 */
public class TreeApp {
    
    private int treeNumber;
    private String treeSpecie;
    private String treeLocation;
    
    //This is my constructor it initializes my objects.
    public TreeApp(int treeNumber, String treeSpecie, String treeLocation){
        this.treeNumber = treeNumber;
        this.treeSpecie = treeSpecie;
        this.treeLocation = treeLocation;
    }
    
    //My getters to get the values that where inputted and share it with the other clases.
    public int getTreeNumber(){
        return treeNumber;
    }
    public String getTreeSpecie(){
        return treeSpecie;
    }
    public String getTreeLocation(){
        return treeLocation;
    }
    
    public String showData(){ //This method unifies the data that was inputted together as one sentence.
        return treeNumber + " - " + treeSpecie + " - " + treeLocation;
    }
    
}
