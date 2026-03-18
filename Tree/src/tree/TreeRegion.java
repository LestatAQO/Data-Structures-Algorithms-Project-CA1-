/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree; //For some reason didnt create the file in the same package.

/**
 *
 * @author Lestat Alvarez Quintana Ordiz
 */
//We learned about inheritance on last semester on OPP https://moodle2025.ncirl.ie/course/section.php?id=10342 I used that with some help of W3Schools for some extra help for things that wasnt very clear in the lecturers explenation.
public class TreeRegion extends TreeApp{ //The extends is because im declaring this as a subclass of TreeApp (Inheritance) Because i wanted to keep it simple i just made it one of the other fields. Region, with this i mean whats the natural region fo the tree, that way you can find easily what it tends to be the conditions that the tree usually lives in. It could be a country or a region like "south region" etc.
    private String region;
    
    //My constructor. The supper is calling the constructure of TreeApp to initialize the objects that are from the other class. (the ones it inherited)
    public TreeRegion(int treeNumber, String treeSpecie, String treeLocation, String region){
        super(treeNumber, treeSpecie, treeLocation);
        this.region = region;
    }
    public String getRegion(){
        return region;
    }
    
    //Tells java that we are modifying a behavior of  a method. In this case is modifying showData to add this extra information to the output.
    @Override
    public String showData(){
        return super.showData() + " - " + region;
    }
}
