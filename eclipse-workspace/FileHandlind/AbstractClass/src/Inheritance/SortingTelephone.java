package Inheritance;

	import java.util.Arrays;

	abstract class MobileTelephone implements Comparable<MobileTelephone> {
	    private double price;
	    
	    public MobileTelephone(double price) {
	        this.price = price;
	    }
	    
	    public double getPrice() {
	        return price;
	    }
	    
	    public int compareTo(MobileTelephone other) {
	        // Compare based on price
	        return Double.compare(this.price, other.price);
	    }
	    
	    public abstract String toString();
	}

	class MotorolaMobileTelephone extends MobileTelephone {
	    public MotorolaMobileTelephone(double price) {
	        super(price);
	    }
	    
	    public String toString() {
	        return super.toString() + " MotorolaMobileTelephone";
	    }
	}

	class NokiaMobileTelephone extends MobileTelephone {
	    public NokiaMobileTelephone(double price) {
	        super(price);
	    }
	    
	    public String toString() {
	        return super.toString() + " NokiaMobileTelephone";
	    }
	}

	class PanasonicMobileTelephone extends MobileTelephone {
	    public PanasonicMobileTelephone(double price) {
	        super(price);
	    }
	    
	    public String toString() {
	        return super.toString() + " PanasonicMobileTelephone";
	    }
	}

	public class SortingTelephone {
	    public static void main(String[] args) {
	        MobileTelephone[] telephones = {
	            new MotorolaMobileTelephone(500),
	            new NokiaMobileTelephone(800),
	            new PanasonicMobileTelephone(1000),
	            // Add more telephones here...
	        };
	        
	        Arrays.sort(telephones);
	        
	        // Print sorted telephones
	        for (MobileTelephone telephone : telephones) {
	            System.out.println(telephone.toString() + " price: " + telephone.getPrice());
	        }
	    }
	}
