package td00;
import java.util.*;
import java.util.Random;
public class PrimeCollection {
	 
	private ArrayList<Integer> numbers;
	
	
	private PrimeCollection() {
		
		this.numbers = new ArrayList<Integer>();
	}
	
	private ArrayList<Integer>  getNumbers() {
		return this.numbers;
	}
	/**
	 * 
	 * @param n : Nombre d'entiers à générer
	 * @param m : Borne Max de la generation d'alétatoire
	 */
	private void InitRandom(int n,int m) {
		Random rand = new Random();
		int i = 0;
		while (i <= n) {
			this.numbers.add(rand.nextInt(m+1));
			i++;
		}
		
		
	}
	
	static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		PrimeCollection collection = new PrimeCollection();
		collection.InitRandom(100, 2000);
		int i = 0;
		while (i < collection.getNumbers().size() ) {
			if (isPrime(collection.getNumbers().get(i))) {
				System.out.println(collection.getNumbers().get(i));
			}

			i++;
		}
		// TODO Auto-generated method stub
		

	}

}
