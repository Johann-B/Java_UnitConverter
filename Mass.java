
public class Mass extends Category {
	
	private static String units[] = {"g","kg","oz","lb"};
	
	
	public Mass() {
	}
	
	
	public Mass(double aFromValue, int aFromUnit, int aToUnit) {
		super(aFromValue, units[aFromUnit - 1], units[aToUnit - 1]);
		this.setToValue();
	}
	
	
	protected void setToValue() {
		switch(this.fromUnit) {
			case "g" :
				switch(this.toUnit) {
					case "g" :
						this.toValue = this.fromValue;
						break;
					case "kg" :
						this.toValue = this.fromValue / 1000.0;
						break;
					case "oz" :
						this.toValue = this.fromValue / 28.349523125;
						break;
					case "lb" :
						this.toValue = this.fromValue / 453.59237;
						break;
				}
				break;
			
			case "kg" :
				switch(this.toUnit) {
					case "g" :
						this.toValue = this.fromValue * 1000.0;
						break;
					case "kg" :
						this.toValue = this.fromValue;
						break;
					case "oz" :
						this.toValue = this.fromValue / 0.028349523125;
						break;
					case "lb" :
						this.toValue = this.fromValue / 0.45359237;
						break;
				}
				break;
			
			case "oz" :
				switch(this.toUnit) {
					case "g" :
						this.toValue = this.fromValue * 28.349523125;
						break;
					case "kg" :
						this.toValue = this.fromValue * 0.028349523125;
						break;
					case "oz" :
						this.toValue = this.fromValue;
						break;
					case "lb" :
						this.toValue = this.fromValue / 16.0;
						break;
				}
				break;
				
			case "lb" :
				switch(this.toUnit) {
					case "g" :
						this.toValue = this.fromValue * 453.59237;
						break;
					case "kg" :
						this.toValue = this.fromValue * 0.45359237;
						break;
					case "oz" :
						this.toValue = this.fromValue * 16.0;
						break;
					case "lb" :
						this.toValue = this.fromValue;
						break;
				}
				break;
		}		
	}
	
	
	public static String showUnits() {
		int i = 1;
		String show = "";
		
		for(String unit : units) {
			show += i + " - " + unit + "\n";
			i++;
		}
		
		return show;
	}

}
