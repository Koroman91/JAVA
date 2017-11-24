
public class RyanAndMonicaJob implements Runnable {
	private BankAccount  account = new BankAccount(); // jedna istanca RyanAndMonicaJob. To znaci jedna istanca bankovnog racuna. Obe niti koriste ovo da mogu da pristupe racunu
	
	public static void main(String[] args){
		RyanAndMonicaJob theJob = new RyanAndMonicaJob(); // inicijalizacija job-a
		Thread one = new Thread(theJob); // inicijalizacija dve niti sa istim runnable job-om
		Thread two = new Thread(theJob); // to znaci da ce obe niti pristupiti racunu
		one.setName("Ryan");
		two.setName("Monica");
		one.start();
		two.start();
	}
	public void run(){  // u run metodi pravi se petlja koja ce svakom iteracijom uzimati novac
		for (int x = 0; x <10; x++){ // nakon sto uzme novac proverava balans jos jednom da bi videli da li je racun prazan
			makeWithdraw1(10);
			if (account.getBalance() < 0 ){
				System.out.println("Overdrawn!");
			}
				
		}
	}
	private void makeWithdraw1(int amount){
		if (account.getBalance() >= amount){
			System.out.println(Thread.currentThread().getName() + " is about to withdraw!");
			try{
				System.out.println(Thread.currentThread().getName() + " is going to sleep!");
				Thread.sleep(500);
			} catch (InterruptedException ex) {ex.printStackTrace(); }
			System.out.println(Thread.currentThread().getName() + " woke up!");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " completes the withdraw1!");
		}
		else {
			System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
		}
	}

}
