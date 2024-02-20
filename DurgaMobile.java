package basicPrograms;

public class DurgaMobile {
	String brandName;
	
	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	DurgaMobile(String localBrandName){
		brandName = localBrandName;
	}
	
	
	void displayFeaturesOfDurgaMobile() {
		System.out.println("This phone brand is " + brandName);
	}
}
