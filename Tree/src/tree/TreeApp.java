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
    
    public TreeApp(int treeNumber, String treeSpecie, String treeLocation){
        this.treeNumber = treeNumber;
        this.treeSpecie = treeSpecie;
        this.treeLocation = treeLocation;
    }
    
    public int getTreeNumber(){
        return treeNumber;
    }
    public String getTreeSpecie(){
        return treeSpecie;
    }
    public String getTreeLocation(){
        return treeLocation;
    }
    
    public String showData(){
        return treeNumber + " - " + treeSpecie + " - " + treeLocation;
    }
    
}
