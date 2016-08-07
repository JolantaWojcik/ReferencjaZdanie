
public class Main {
	
	/* w manie stworz dwie instancje zbiornika i wykaz ze 
	 * beda to dwie rozne referencje mimo ze moga miec te same parametry
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tank tank1 = new Tank("nazwa1", 30, 34.55);
		Tank tank2 = new Tank("nazwa1", 30, 34.55);
		Tank tank3 =  new Tank("nazwa3", 33, 35.55);
		
		if(tank1==tank2){
			System.out.println("Ta sama referencja");
		}else {
			System.out.println("Rozne referencje");
			}
		
		 if(tank1.equals(tank2)){
				System.out.println("Te same parametry");
			}
		 else {
				System.out.println("Rozne pramerty");
				}
	}

}
