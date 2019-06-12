package domain;

import java.io.Serializable;

public class Sequence implements Serializable {

  private static final long serialVersionUID = 8278780133180137281L;

  private String name;
  private int nextID;

  public Sequence() {
  }

  public Sequence(String name, int nextID) {
    this.name = name;
    this.nextID = nextID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getnextID() {
    return nextID;
  }

  public void setnextID(int nextID) {
    this.nextID = nextID;
  }

}
