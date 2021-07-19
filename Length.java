
public class Length extends Category {

	private static String units[] = {"cm","m","km","in","ft","yd","mi"};
	
	
	public Length() {
	}
	
	
	public Length(double aFromValue, int aFromUnit, int aToUnit) {
		super(aFromValue, units[aFromUnit - 1], units[aToUnit - 1]);
		this.setToValue();
	}
	
	
	protected void setToValue() {
		switch(this.fromUnit) {
        	case "cm" :
	            switch(this.toUnit) {
	                case "cm" :
	                    this.toValue = this.fromValue;
	                    break;
	                case "m" :
	                	this.toValue = this.fromValue / 100.0;
	                    break;
	                case "km" :
	                	this.toValue = this.fromValue / 100000.0;
	                    break;
	                case "in" :
	                	this.toValue = this.fromValue / 2.54;
	                    break;
	                case "ft" :
	                	this.toValue = this.fromValue / 30.48;
	                    break;
	                case "yd" :
	                	this.toValue = this.fromValue / 91.44;
	                    break;
	                case "mi" :
	                	this.toValue = this.fromValue / 160934.4;
	                    break;
	            }
	            break;
        
        	case "m" :
        		switch(this.toUnit) {
	                case "cm" :
	                	this.toValue = this.fromValue * 100.0;
	                    break;
	                case "m" :
	                	this.toValue = this.fromValue;
	                    break;
	                case "km" :
	                	this.toValue = this.fromValue / 1000.0;
	                    break;
	                case "in" :
	                	this.toValue = this.fromValue / 0.0254;
	                    break;
	                case "ft" :
	                	this.toValue = this.fromValue / 0.3048;
	                    break;
	                case "yd" :
	                	this.toValue = this.fromValue / 0.9144;
	                    break;
	                case "mi" :
	                	this.toValue = this.fromValue / 1609.344;
	                    break;
                }
	            break;
       
        	case "km" :
	            switch(this.toUnit) {
	                case "cm" :
	                	this.toValue = this.fromValue * 100000.0;
	                    break;
	                case "m" :
	                	this.toValue = this.fromValue * 1000.0;
	                    break;
	                case "km" :
	                	this.toValue = this.fromValue;
	                    break;
	                case "in" :
	                	this.toValue = this.fromValue / 0.0000254;
	                    break;
	                case "ft" :
	                	this.toValue = this.fromValue / 0.0003048;
	                    break;
	                case "yd" :
	                	this.toValue = this.fromValue / 0.0009144;
	                    break;
	                case "mi" :
	                	this.toValue = this.fromValue / 1.609344;
	                    break;
	            }
	            break;
        
        	case "in" :
	            switch(this.toUnit) {
	                case "cm" :
	                	this.toValue = this.fromValue * 2.54;
	                    break;
	                case "m" :
	                	this.toValue = this.fromValue * 0.0254;
	                    break;
	                case "km" :
	                	this.toValue = this.fromValue * 0.0000254;
	                    break;
	                case "in" :
	                	this.toValue = this.fromValue;
	                    break;
	                case "ft" :
	                	this.toValue = this.fromValue / 12.0;
	                    break;
	                case "yd" :
	                	this.toValue = this.fromValue / 36.0;
	                    break;
	                case "mi" :
	                	this.toValue = this.fromValue / 63360.0;
	                    break;
	            }
	            break;
       
        	case "ft" :
	            switch(this.toUnit) {
	                case "cm" :
	                	this.toValue = this.fromValue * 30.48;
	                    break;
	                case "m" :
	                	this.toValue = this.fromValue * 0.3048;
	                    break;
	                case "km" :
	                	this.toValue = this.fromValue * 0.0003048;
	                    break;
	                case "in" :
	                	this.toValue = this.fromValue * 12.0;
	                    break;
	                case "ft" :
	                	this.toValue = this.fromValue;
	                    break;
	                case "yd" :
	                	this.toValue = this.fromValue / 3.0;
	                    break;
	                case "mi" :
	                	this.toValue = this.fromValue / 5280.0;
	                    break;
	            }
	            break;
        
        	case "yd" :
	            switch(this.toUnit) {
	                case "cm" :
	                	this.toValue = this.fromValue * 91.44;
	                    break;
	                case "m" :
	                	this.toValue = this.fromValue * 0.9144;
	                    break;
	                case "km" :
	                	this.toValue = this.fromValue * 0.0009144;
	                    break;
	                case "in" :
	                	this.toValue = this.fromValue * 36.0;
	                    break;
	                case "ft" :
	                	this.toValue = this.fromValue * 3.0;
	                    break;
	                case "yd" :
	                	this.toValue = this.fromValue;
	                    break;
	                case "mi" :
	                	this.toValue = this.fromValue / 1760.0;
	                    break;
	            }
	            break;
        
        	case "mi" :
	            switch(this.toUnit) {
	                case "cm" :
	                	this.toValue = this.fromValue * 160934.4;
	                    break;
	                case "m" :
	                	this.toValue = this.fromValue * 1609.344;
	                    break;
	                case "km" :
	                	this.toValue = this.fromValue * 1.609344;
	                    break;
	                case "in" :
	                	this.toValue = this.fromValue * 63360.0;
	                    break;
	                case "ft" :
	                	this.toValue = this.fromValue * 5280.0;
	                    break;
	                case "yd" :
	                	this.toValue = this.fromValue * 1760.0;
	                    break;
	                case "mi" :
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
