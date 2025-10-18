package entities;

public class ImportedProduct extends Product{
	
	Double customeFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customeFee) {
		super(name, price);
		this.customeFee = customeFee;
	}

	public Double getCustomeFee() {
		return customeFee;
	}

	public void setCustomeFee(Double customeFee) {
		this.customeFee = customeFee;
	}
	
	public Double totalPrice() {
		return super.getPrice() + customeFee;
	}
	
	@Override
	public String priceTag() {
		return super.getName() 
				+ " $ " + String.format("%.2f", totalPrice()) 
				+ " (Custom fee: $ " + String.format("%.2f", customeFee) + ")";
	}

}
