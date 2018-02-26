package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		if (!this.calledFirstValue){
			throw new IllegalStateException();
		}
		current = current * commonFactor; 
		return current;
	}

	public String toString(){
		return "Geom("+this.firstValue()+","+this.commonFactor+")";
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException {
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		
	return this.firstValue() + Math.pow(this.commonFactor,n-1);
	
		
	}
}
