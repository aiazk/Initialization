
public class Eager
{
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
        object.addCoins(3);
        object.decrease(2);
	}
}


class SingleObject {
   private int coins;
   private static SingleObject instance = new SingleObject(3);
   private SingleObject(int c){
       coins=c;
   }
   public static SingleObject getInstance(){
      return instance;
   }
   public void addCoins(int c){
       coins=coins+c;
       System.out.println("The number of coins is "+coins);
   }
   public void decrease(int c){
       coins=coins-c;
       System.out.println("The number of coins is "+coins);
   }
}