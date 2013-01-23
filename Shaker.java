public class Shaker extends Employee {
	
	public Shaker(int b) {
		super(b);
	}
	
	public void workWeek() {
		for (int i=0; i<5; i++)
		{
			this.shake();
		}
		this.earnPaycheck();
		this.setEffMult(1);
	} 
	
	public void shake() {
		this.addEffMult(0.02);
	} 
	
}