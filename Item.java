public class Item{
  //The name of the item
  private String itemName;
  //The weight of the item
  private double itemWeight;
  //The description of the item
  private String itemDescription;
////////////////////////////////////////////////////////////////////////
  /*Accessor method to get name
  *@return the name of item
  */
  public String getName(){
    return itemName;
  }
  //Mutator for the name
  private void setName(String name){
    itemName = name;
  }
  /* Constructor to initialize itemName
   * @param none
   */
  public Item(String name){
    itemName = name;
  }
//////////////////////////////////////////////////////////////////////////
  //for itemWeight
  public double getWeight(){
    return itemWeight;
  }
  private void setWeight(double weight){
    itemWeight = weight;
    }
  public Item(double weight){
    itemWeight = weight;
  }
//////////////////////////////////////////////////////////////////////////
  //for examine
  public String examine(){
    return itemDescription;
  }
  private void setDescription(String description){
    itemDescription = description;
  }
  public Item(String description){
    itemDescription = description;
  }
/////////////////////////////////////////////////////////////////////////
  public Item(){
  }
  
  
  "This is a " + name + " and it weighs " + getWeight();
}