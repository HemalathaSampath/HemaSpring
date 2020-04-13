package net.hema.spring.model;

public class Product {
		
	private int product_id;
	private String product_name; 
	private String product_description;
	private String product_agreement; 
	private String product_organization; 
	private int product_prices;
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getProduct_agreement() {
		return product_agreement;
	}
	public void setProduct_agreement(String product_agreement) {
		this.product_agreement = product_agreement;
	}
	public String getProduct_organization() {
		return product_organization;
	}
	public void setProduct_organization(String product_organization) {
		this.product_organization = product_organization;
	}
	public int getProduct_prices() {
		return product_prices;
	}
	public void setProduct_prices(int product_prices) {
		this.product_prices = product_prices;
	}
	public Product(int product_id, String product_name, String product_description, String product_agreement,
			String product_organization, int product_prices) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_agreement = product_agreement;
		this.product_organization = product_organization;
		this.product_prices = product_prices;
	} 

}
