package entities;

import java.time.LocalDate;
import java.util.Date;

public class Invoice {
	private String invoiceCode;
	private LocalDate dateTime;
	private Customer customer;
	private Person realtor;
	
	
	public Invoice(String invoiceCode, LocalDate dateTime, Customer customer, Person realtor) {
		super();
		this.invoiceCode = invoiceCode;
		this.dateTime = dateTime;
		this.customer = customer;
		this.realtor = realtor;
	}
	public String getInvoiceCode() {
		return invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public LocalDate getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDate dateTime) {
		this.dateTime = dateTime;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Person getRealtor() {
		return realtor;
	}
	public void setRealtor(Person realtor) {
		this.realtor = realtor;
	}
	
	
	
	
}
