import java.util.ArrayList;

public interface SearchStudent {

  //Khai bao ra nhung method ma no dung de tim kiem
  public abstract void findByUserName(ArrayList<Student> students);
  public abstract void findByMsv(ArrayList<Student> students);
}
