package Codigo;

public class CodeLauaBlock {
	public static void main(String[] args) {
		int count = 0;
		while (true) {
			//wait a second
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// aumentar el contador 
			
			count = count + 1;
			
			// mostrar el contador
			
			System.out.println("Count: " + count);
		// if
			if (count >= 10) {
				System.out.println("Count is 10 or higher");
				break;
			}
			//ohh
			else if (count >= 5) {
				System.out.println("Count is 5 or higher");
			}
		}
	}

}
