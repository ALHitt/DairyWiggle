import java.util.Random;

public abstract class Employee {
	private double effectivenessMultiplier;
	private int baseWeeklySalary;
	private int totalPaymentToDate;
	Random numGen=new Random();
	
	public Employee(int b) {
		
		effectivenessMultiplier = 1;
		baseWeeklySalary = b;
		totalPaymentToDate=0; 
	}
	
	public abstract void workWeek();
	
	public void earnPaycheck() { 
		this.addPayment();
	}
	
	public int calcPayment() { 
		return ((int)(this.getEffMult()*this.getBase()));
	}
	
	public void earnBonus() {
		int bonus = numGen.nextInt(100)+101;
		this.setTotal(this.getTotal()+bonus);
	}
	public boolean calculateChances(int p) {
		int percent=p; 
		int r = numGen.nextInt(100); 
		return r<=p;
	}
	
	public void addPayment() {
		this.setTotal(this.getTotal()+this.calcPayment());
	}
	
	public void addEffMult(double f) { 
		this.setEffMult(this.getEffMult()+f);
	}
	
	public int getBase() { 
		return baseWeeklySalary;
	} 
	
	public void setBase(int b) { 
		baseWeeklySalary=b;
	}
	
	public double getEffMult() { 
		return effectivenessMultiplier; 
	}
	
	public void setEffMult(double f) { 
		effectivenessMultiplier=f; 
	} 
	
	public int getTotal() {
		return totalPaymentToDate;
	}
	
	public void setTotal(int i) { 
		totalPaymentToDate=i; 
	} 
	
	
	public String toString() {
		return "Weekly Salary: "+baseWeeklySalary+"; Total Payment:" +totalPaymentToDate+";";
	}
}