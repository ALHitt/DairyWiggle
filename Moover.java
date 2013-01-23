public class Moover extends Employee {
	
	public Moover(int b) {
		super(b);
	}
	
	public void workWeek() {
		for (int i=0; i<5; i++)
		{
			this.takeOrder();
			this.deliverShake();
		}
		this.earnPaycheck();
		this.setEffMult(1);
	} 
	
	public void takeOrder() {
		if (this.calculateChances(20))
		{
			this.addEffMult(-0.1);
		} 
		else 
		{
			this.addEffMult(0.05);
		}
	} 
	
	public void deliverShake() {
		if (this.calculateChances(5))
		{
			this.addEffMult(-0.1);
		} 
		else 
		{
			this.addEffMult(0.03);
		}
	}
}