package fighter;

public class Fight{
  private static int Player1Attack;
  private static int Player2Attack;
  private static int Player1Defense;
  private static int Player2Defense;
  private static Fighter Player1 = new Fighter("Barbosa", 6);
  private static Hero Player2 = new Hero("Jack Sparrow");
  
  public static void main(String[] args){
    System.out.println(Player1.getName() + " suddenly appears!\n" + Player2.getName() + " is very startled.\nBoth pirates draw their swords.\nThey begin to fight!");
    for(int index = 0; Player2.HP > 0 && Player1.HP > 0; index++){
      if(index == 0 || index %2 == 0){
        Fight.Player1Attack();
      } else  if(index %2 == 1){
        Fight.Player2Attack();
      }
    }
    Fight.declareWinner();
  }
  
  
  private static void Player1Attack(){
    int randomness = ((int)(Math.random() * 11));
    Player1Attack = Player1.attack();
    Player2Defense = Player2.defend();
    if(randomness%2 == 1){
      if(Player1Attack > Player2Defense){
        Player2.HP = Player1Attack - Player2Defense;
      } else {
        Player2.HP = Player2.HP - 1;
      }
      System.out.println(Player2.getName() + " defends himself, but still recieves a minor wound.\nHis HP is now " + Player2.getHP()+ ".");
    } else {
      Player2.HP = Player2.HP - Player1Attack;
      System.out.println(Player2.getName() + " was hit!\nHis HP is now " + Player2.getHP()+ ".");
    }
  }
  
  private static void Player2Attack(){
    int randomness = ((int)(Math.random() * 11));
    Player2Attack = Player2.attack();
    Player1Defense = Player1.defend();
    if(randomness%2 == 2){
      if(Player2Attack > Player1Defense){
        Player1.HP = Player2Attack - Player1Defense;
      } else {
        Player1.HP = Player1.HP - 1;
      }
      System.out.println(Player1.getName() + " defends himself, but still recieves a minor wound.\nHis HP is now " + Player2.getHP() + ".");
    } else {
      Player1.HP = Player1.HP - Player2Attack;
      System.out.println(Player1.getName() + " was hit!\nHis HP is now " + Player2.getHP()+ ".");
    }
  }
  
  private static void declareWinner(){
    if(Player1.HP > 0){
      System.out.println(Player1.getName() + " won the battle!\nNext time, " + Player2.getName() + "!");
    } else if(Player2.HP > 0){
      System.out.println(Player2.getName() + " won the battle!\nNext time, " + Player1.getName() + "!");
    }
  }
}

