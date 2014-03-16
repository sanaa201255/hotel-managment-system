package Model;

public class Invoice {

	private int invoiceId;
	private Reservation reservation;
	private double totalPrice;
	private String invoiceDate;
	
	
	
	public Invoice(int invoiceId, Reservation reservation, double totalPrice,
			String invoiceDate) {
		this.invoiceId = invoiceId;
		this.reservation = reservation;
		this.totalPrice = totalPrice;
		this.invoiceDate = invoiceDate;
	}
	
	public Invoice() {
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	
}
