package fighter;

public abstract class Human{
  public int HP;
  public String name;
  
  public abstract int getHP();
  
  public abstract String getName();
  
  public abstract int attack();
  
  public abstract int defend();
  
 // public abstract int hit();
  //public abstract looseHP();
}
