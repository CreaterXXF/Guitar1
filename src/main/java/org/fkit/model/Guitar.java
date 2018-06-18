package org.fkit.model;
public class Guitar {

  String serialNumber;
  double price;
  GuitarSpec spec;

 

  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String newSerialNumber){
	  this.serialNumber=newSerialNumber;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(float newPrice) {
    this.price = newPrice;
  }

  public GuitarSpec getSpec() {
    return spec;
  }
  public void setGuitarSpec(GuitarSpec guitarSpec) {
      this.spec = guitarSpec;
  }
}
