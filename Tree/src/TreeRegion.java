/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lestat Alvarez Quintana Ordiz
 */
public class TreeRegion extends Tree{
    private String region;
    
    public TreeRegion(int treeNumber, String treeSpecie, String treeLocation){
        super(treeNumber, treeSpecie, treeLocation);
        this.region = region;
    }
    
    public String showData(){
        return super.showData() + " - " + region;
    }
}
