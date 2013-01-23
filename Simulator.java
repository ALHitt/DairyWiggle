import java.util.Random;

public class Simulator {
	private Employee[] employees= new Employee[6];  
	private int week;
	Random numGen2=new Random();
	
	public Simulator() {
		
		for (int i=0; i<6; i++)
		{
			if (i<2)
			{
				employees[i]=new TastebudStylist(500);
			} 
			else if (i<4)
			{
				employees[i]=new Moover(200);
			} 
			else if (i<6)
			{
				employees[i]=new Shaker(100);
			} 	
		}
		week=0;
	}
	
	public void earnBonus() {
		int luckyEmployee=numGen2.nextInt(6); 
		System.out.println("Employee "+luckyEmployee+" won the bonus!"); 
		employees[luckyEmployee].earnBonus();
	}
		
		
	public void passWeekAll() {
		System.out.println("WEEK "+week+"!");
		this.earnBonus();
		for (int i=0; i<6; i++)
		{
			employees[i].workWeek();
			System.out.println(employees[i]);
		}
		week+=1;
		
	}


	public static void main(String[] args) {
		Simulator s= new Simulator();
		for (int i=0; i<240; i++)
		{
			System.out.println("");
			s.passWeekAll();
		}
	}
	
}