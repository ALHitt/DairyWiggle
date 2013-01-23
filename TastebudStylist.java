public class TastebudStylist extends Employee {
	
	public TastebudStylist(int b) {
		super(b);
	}
	
	public void workWeek() {
		for (int i=0; i<5; i++)
		{
			this.makeShake();
		}
		this.earnPaycheck();
		this.setEffMult(1);
	} 
	
	public void makeShake() {
		if (this.calculateChances(10))
		{
			this.setEffMult(1);
		} 
		else 
		{
			this.addEffMult(0.1);
		}
	} 
}