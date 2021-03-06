import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Customer extends Restaurant{
	
	public int order,qty,b;
	public int bill;
	public static String item,items;
	public static float total_bill =0f;
	
	public  void orderStarters() throws FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item number :");
		order=sc.nextInt();
		System.out.println("enter item quantity :");
		qty=sc.nextInt();
		String order1 = Integer.toString(order)+".";
				Scanner sc1 = new Scanner(new File("starters.txt"));
				 while(sc1.hasNext())
				 {
					if(sc1.next().equals(order1))
					{
						item=sc1.next();
						b=sc1.nextInt();
						bill=b*qty;
					}
				 }
				total_bill = total_bill + bill;
				if(items!=null)
				{
					items=items.concat(item).concat("\t\tprice : ").concat(Integer.toString(b)).concat("\t\tQuantity : ").concat(Integer.toString(qty)).concat("\n");
				}
				else{	
				items=item.concat("\t\tprice : ").concat(Integer.toString(b)).concat("\t\tQuantity : ").concat(Integer.toString(qty)).concat("\n");
				}
			
	}
			
	public void orderMainCourse() throws FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item number :");
		order=sc.nextInt();
		System.out.println("enter item quantity :");
		qty=sc.nextInt();
		String order1 = Integer.toString(order)+".";
				Scanner sc1 = new Scanner(new File("maindish.txt"));
				 while(sc1.hasNext())
				 {
					if(sc1.next().equals(order1))
					{
						item=sc1.next();
						b=sc1.nextInt();
						bill=b*qty;
					}
				 }
				total_bill = total_bill + bill;
				if(items!=null)
				{
					items=items.concat(item).concat("\t\tprice : ").concat(Integer.toString(b)).concat("\t\tQuantity : ").concat(Integer.toString(qty)).concat("\n");
				}
				else{	
				items=item.concat("\t\tprice : ").concat(Integer.toString(b)).concat("\t\tQuantity : ").concat(Integer.toString(qty)).concat("\n");
				}
			
	}
	
	public void orderDesserts() throws FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item number :");
		order=sc.nextInt();
		System.out.println("enter item quantity :");
		qty=sc.nextInt();
		String order1 = Integer.toString(order)+".";
				Scanner sc1 = new Scanner(new File("desserts.txt"));
				 while(sc1.hasNext())
				 {
					if(sc1.next().equals(order1))
					{
						item=sc1.next();
						b=sc1.nextInt();
						bill=b*qty;
					}
				 }
				total_bill = total_bill + bill;
				if(items!=null)
				{
					items=items.concat(item).concat("\t\tprice : ").concat(Integer.toString(b)).concat("\t\tQuantity : ").concat(Integer.toString(qty)).concat("\n");
				}
				else{	
				items=item.concat("\t\t").concat(Integer.toString(b)).concat("\t\tQuantity : ").concat(Integer.toString(qty)).concat("\n");
				}
			
	}
	
	public void eat()
	{
		System.out.println("Customer eats Food\n");
	}
	
	public void requestsBill()
	{
		System.out.println("Customer requests bill\n");
	}
	
	public void payBill() throws InterruptedException
	{
		System.out.println("Ordered Items:");
		System.out.println(items);
		System.out.println("bill amount:"+total_bill+"\n");
		Thread.sleep(1500);
		System.out.println("Customer pays bill\n");
		
	}
	
	public void giveFeedback()
	{
		System.out.println("Customer gives Feedback\n");
	}
}
