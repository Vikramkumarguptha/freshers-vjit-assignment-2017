import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Restaurant {
	
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException,NoSuchElementException{
		String c;
		DoorBoy doorBoy = new DoorBoy();
		Host host = new Host();
		BusBoy busboy = new BusBoy();
		Manager manager = new Manager();
		Server server = new Server();
		ExecutiveChef chef = new ExecutiveChef();
		MenuCard menu = new MenuCard();
		Feedback feedback = new Feedback();
		Customer customer = new Customer();
		
		System.out.println("Customer enters\n");
		doorBoy.firstGreeting();
		Thread.sleep(1500);
		host.receivesCustomer();
		Thread.sleep(1500);
		host.allocatesTable();
		Thread.sleep(1500);
		busboy.servesWater();
		Thread.sleep(1500);
		manager.providesMenu();
		Thread.sleep(1500);
		chef.cooksFood();
		Thread.sleep(5000);
		server.serveFood();
		Thread.sleep(1500);
		customer.eat();
		Thread.sleep(1500);
		customer.requestsBill();
		Thread.sleep(1500);
		manager.providesBill();
		Thread.sleep(1500);
		customer.payBill();
		Thread.sleep(1500);
		customer.giveFeedback();
		feedback.add();
		Thread.sleep(1500);
		busboy.cleansTable();
		Thread.sleep(1500);
		doorBoy.lastGreeting();
		Thread.sleep(1500);
		System.out.println("\nDo you want to view the customer feedbacks y/n");
		Scanner sc = new Scanner(System.in);
		c=sc.next();
		if(c.equals("Y")||c.equals("y"))
		   {
			   feedback.getFeedbacks();
		   } else
			   System.exit(0);
		
		}
	}
