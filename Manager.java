import java.io.FileNotFoundException;
import java.util.Scanner;

public class Manager {

	public void providesMenu() throws FileNotFoundException
	{
		System.out.println("Manager Provides Menu\n");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1.starters \n2.main course \n3.dessert\n");
		System.out.println("Select the type of food");
		int c = sc1.nextInt();
		MenuCard menu = new MenuCard();
		Customer customer = new Customer();
		switch(c)
		{
		case 1:menu.getStarters();
			   customer.orderStarters();
			   	break;
		case 2:menu.getmainCourse();
			   customer.orderMainCourse();
				break;
		case 3:menu.getDesserts();
			   customer.orderDesserts();
				break;
		}
		System.out.println("do you want to order more y/n");
		Scanner sc2 = new Scanner(System.in);
		String c1 = sc2.next();
		   if(c1.equals("Y")||c1.equals("y"))
		   {
			   providesMenu();
		   } else
			   return;   
	}
	
	public void providesBill()
	{
		System.out.println("Manager Provides bill\n");
		
	}
}
