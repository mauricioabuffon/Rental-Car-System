package model.entities;

public class Invoice {

	private Double basicPayment;
	private Double tax;

	public Invoice() {
	}

	public Invoice(double basicPayment, double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public double getbasicPayment() {
		return basicPayment;
	}

	public void setInvoicePayment(double invoicePayment) {
		this.basicPayment = basicPayment;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotalPayment() {
		return getbasicPayment() + getTax();
	}

}
