import java.io.File;
import java.util.Scanner;

public class MenuCard {

	public static void getStarters()
	{
		/*System.out.println("1."
				+ "2."
				+ "3."
				+ "4."
				+ "5."
				+ "6.");*/
		try{
			Scanner sc = new Scanner(new File("starters.txt"));
			while(sc.hasNext())
				{
				String starters = sc.nextLine();
				System.out.println(starters);
				}
			sc.close();
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		
	}
	
	
	public static void getmainCourse()
	{
		/*System.out.println("1."
				+ "2."
				+ "3."
				+ "4."
				+ "5."
				+ "6.");*/
		try{
			Scanner sc = new Scanner(new File("maindish.txt"));
			while(sc.hasNext())
				{
				String mainDish = sc.nextLine();
				System.out.println(mainDish);
				}
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
	}
	
	
	public static void getDesserts()
	{
		/*System.out.println("1."
				+ "2."
				+ "3."
				+ "4."
				+ "5."
				+ "6.");*/
		try{
			Scanner sc = new Scanner(new File("desserts.txt"));
			while(sc.hasNext())
				{
				String desserts = sc.nextLine();
				System.out.println(desserts);
				}
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
	}
	
	
}
