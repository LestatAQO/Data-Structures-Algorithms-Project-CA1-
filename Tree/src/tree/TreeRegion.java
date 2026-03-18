/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree; //For some reason didnt create the file in the same package.

/**
 *
 * @author Lestat Alvarez Quintana Ordiz
 */
public class TreeRegion extends TreeApp{
    private String region;
    
    public TreeRegion(int treeNumber, String treeSpecie, String treeLocation){
        super(treeNumber, treeSpecie, treeLocation);
        this.region = region;
    }
    
    @Override
    public String showData(){
        return super.showData() + " - " + region;
    }
}
