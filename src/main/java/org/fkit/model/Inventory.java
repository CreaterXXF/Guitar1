package org.fkit.model;
import java.util.ArrayList;
import java.util.List;


public class Inventory {
  

  List<Guitar> guitars;

  public List<Guitar> getGuitars() {
      return guitars;
  }

  public void setGuitars(List<Guitar> guitars) {
      this.guitars = guitars;
  }

  public List<Guitar> search(GuitarSpec guitarSpec) {
      List<Guitar> guitarList = new ArrayList<>();
      for (Guitar guitar : this.guitars) {
          if (guitarSpec.matches(guitarSpec, guitar)) {
              guitarList.add(guitar);
          }
      }
      return guitarList;
  }
}
