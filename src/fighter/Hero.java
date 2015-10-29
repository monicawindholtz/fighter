package fighter;

public class Hero extends Fighter{
  
  public Hero(String name){
    super(name, 12);
    this.attackValue = 2;
    this.defenseValue = 2;
  }
}