package td00;
import java.util.*;
import java.util.Random;
public class PrimeCollection {
	 
	private ArrayList<Integer> numbers;
	
	
	public PrimeCollection() {
		
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
	void initRandom(int n,int m) {
		Random rand = new Random();
		int i = 0;
		while (i <= n) {
			this.numbers.add(rand.nextInt(m+1));
			i++;
		}
		
		
	}
	
	static boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 
  
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
	
	private void printPrimes() {
		int i = 0;
		while (i < this.getNumbers().size() ) {
			if (isPrime(this.getNumbers().get(i))) {
				System.out.println(this.getNumbers().get(i));
			}
			i++;
	
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		PrimeCollection collection = new PrimeCollection();
		collection.initRandom(100, 2000);
		collection.printPrimes();
		// TODO Auto-generated method stub
		

	}

}
