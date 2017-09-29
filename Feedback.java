import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Feedback extends Customer {

		
	public void add()
	{
		Scanner sc2 = new Scanner(System.in);
		String feedback =sc2.nextLine();
		File f = new File("feedback.txt");
		try{
			FileWriter fw = new FileWriter(f,true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(feedback);
			pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void getFeedbacks()
	{
		try{
		Scanner sc = new Scanner(new File("feedback.txt"));
		while(sc.hasNext())
			{
			String feedback = sc.nextLine();
			System.out.println(feedback);
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
