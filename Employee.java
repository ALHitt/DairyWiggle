import java.util.Random;
// @BC: Superclass and subclasses come through beautifully! Nicely done
public abstract class Employee {
	private double effectivenessMultiplier;
	private int baseWeeklySalary;
	private int totalPaymentToDate;
	// @BC: As a Java convention -- save initialization of fields to the methods (or to the constructor)
	//		(So that you know -- we will break this "rule" when it comes to FINAL fields... although that's actually convention, too!)
	Random numGen=new Random();
	
	public Employee(int b) {
		
		effectivenessMultiplier = 1;
		baseWeeklySalary = b;
		totalPaymentToDate=0; 
	}
	
	public abstract void workWeek();
	// @BC: A design question -- why have these two methods separately? Could earnPaycheck implement the setTotal() you call in the other method?
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
	// @BC: Good thought to carry this over from the last project
	public boolean calculateChances(int p) {
		int percent=p; 
		int r = numGen.nextInt(100); 
		return r<=p;
	}
	// @BC: Nice method here to keep weekly paychecks simple
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