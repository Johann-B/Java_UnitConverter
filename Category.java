
abstract class Category {
	
	protected String fromUnit;
	protected String toUnit;
	protected double fromValue;
	protected double toValue;

	
	protected Category() {
	}
	
	
	protected Category(double aFromValue, String aFromUnit, String aToUnit) {
		this.fromValue = aFromValue;
		this.fromUnit = aFromUnit;
		this.toUnit = aToUnit;
	}
	
	
	protected abstract void setToValue();
	
	
	public String toResult() {
		String output = this.fromValue + this.fromUnit + " = " + this.toValue + this.toUnit;
		return output;
	}

}
