package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	Date manufatureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufatureDate) {
		super(name, price);
		this.manufatureDate = manufatureDate;
	}

	public Date getManufatureDate() {
		return manufatureDate;
	}

	public void setManufatureDate(Date manufatureDate) {
		this.manufatureDate = manufatureDate;
	}

	@Override
	public String priceTag() {
		return super.getName() 
				+ " (used) $ " + String.format("%.2f",super.getPrice())
				+ " (Manufacture date : " + sdf.format(manufatureDate) + ")";
	}

}
