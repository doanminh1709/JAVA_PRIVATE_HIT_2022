public class Dog extends Animal {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void eat(){
    System.out.println("Dog is eating");
  }

}
