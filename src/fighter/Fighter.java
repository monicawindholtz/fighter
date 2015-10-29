package fighter;

public class Fighter extends Human{
  public int attackValue;//how to handle instances when both should have the same value but don't? i.e. public or private? redeclare? isthat a thing?
  public int defenseValue;
  
  public Fighter(String name){
    this.name = name;
    this.HP = 5;
    attackValue = 3;
    defenseValue = 1;
  }
  
  public Fighter(String name, int HP){
    this.name = name;
    this.HP = HP;
    attackValue = 3;
    defenseValue = 1;
  }
  
  @Override
  public String getName(){
    return name;
  } 
  
  @Override
  public int getHP(){
    return HP;
  }
  
  @Override
  public int attack(){
    return attackValue;
  }
  
  @Override
  public int defend(){
    return defenseValue;
  }
}
