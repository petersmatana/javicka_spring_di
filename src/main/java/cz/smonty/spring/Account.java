package cz.smonty.spring;

public class Account {

	private long id;
	private String ownerName;
	private double balance;

	public Account() {

	}

	public Account(long id, String ownerName, double balance) {
		this.id = id;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return (int) (this.id * this.ownerName.hashCode() * this.balance);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		if (this == obj) {
			return true;
		}
		
		Account tmp = (Account) obj;
		if (tmp.getId() == this.getId()) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "ID = " + this.getId() + " | owner = " + this.getOwnerName()
		+ " | balance = " + this.getBalance();
	}

}
