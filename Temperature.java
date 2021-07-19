
public class Temperature extends Category {
	
	private static String units[] = {"°C","°F","K"};
	
	
	public Temperature() {
	}
	
	
	public Temperature(double aFromValue, int aFromUnit, int aToUnit ) {
		super(aFromValue, units[aFromUnit - 1], units[aToUnit - 1]);
		this.setToValue();
	}
	
	
	protected void setToValue() {
		switch(this.fromUnit) {
			case "°C" :
				switch(this.toUnit) {
					case "°C" :
						this.toValue = this.fromValue;
						break;
					case "°F" :
						this.toValue = (this.fromValue * (9.0/5.0)) + 32.0;
						break;
					case "K" :
						this.toValue = this.fromValue + 273.15;
						break;
				}
				break;
				
			case "°F" :
				switch(this.toUnit) {
					case "°C" :
						this.toValue = (this.fromValue - 32.0) * 5.0/9.0;
						break;
					case "°F" :
						this.toValue = this.fromValue;
						break;
					case "K" :
						this.toValue = ((this.fromValue - 32.0) * 5.0/9.0) + 273.15;
						break;
				}
				break;
				
			case "K" :
				switch(this.toUnit) {
					case "°C" :
						this.toValue = this.fromValue - 273.15;
						break;
					case "°F" :
						this.toValue = ((this.fromValue - 273.15) * 9.0/5.0) + 32.0;
						break;
					case "K" :
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
