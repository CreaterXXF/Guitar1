package org.fkit.model;
public class GuitarSpec {
 
  private String builder; 
  private String model;
  private String type;
  private String numStrings;
  private String backWood;
  private String topWood;



  public String getBuilder() {
    return builder;
  }
  public void setBuilder(String builder){
	  this.builder=builder;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model){
	  this.model=model;
  }
  public String getType() {
    return type;
  }
  public void setType(String type){
	  this.type=type;
  }
  public String getNumStrings() {
    return numStrings;
  }
  public void setNumStrings(String numStrings){
	  this.numStrings=numStrings;
  }
  public String getBackWood() {
    return backWood;
  }
  public void setBackWood(String backWood){
	  this.backWood=backWood;
  }
  public String getTopWood() {
    return topWood;
  }
  public void setTopWood(String topWood){
	  this.topWood=topWood;
  }
  public boolean matches(GuitarSpec guitarSpec,Guitar guitar){
      if(guitarSpec.getBuilder()!=null && !guitarSpec.getBuilder().equals("")
              && !guitar.getSpec().getBuilder().equals(guitarSpec.getBuilder())){
          return false;
      }
      if(guitarSpec.getModel()!=null && !guitarSpec.getModel().equals("")
              && !guitar.getSpec().getModel().equals(guitarSpec.getModel())){
          return false;
      }
      if(guitarSpec.getType()!=null && !guitarSpec.getType().equals("")
              && !guitar.getSpec().getType().equals(guitarSpec.getType())){
          return false;
      }
      if(guitarSpec.getBackWood()!=null && !guitarSpec.getBackWood().equals("")
              && !guitar.getSpec().getBackWood().equals(guitarSpec.getBackWood())){
          return false;
      }
      if(guitarSpec.getTopWood()!=null && !guitarSpec.getTopWood().equals("")
              && !guitar.getSpec().getTopWood().equals(guitarSpec.getTopWood())){
          return false;
      }
      return true;
  }
}
