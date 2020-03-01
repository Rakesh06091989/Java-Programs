package com.interview;

public class Fruits implements Comparable<Fruits>{
	
	String fruitname;
	int quantity;
	int price;
	public Fruits(String fruitname, int quantity, int price) {
		super();
		this.fruitname = fruitname;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public int compareTo(Fruits o) {

		if(quantity == o.quantity){
			return fruitname.compareTo(o.fruitname);
		}
		else if(quantity > o.quantity){
			return 1;
		}
		else{
			return -1;
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruitname == null) ? 0 : fruitname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruits other = (Fruits) obj;
		if (fruitname == null) {
			if (other.fruitname != null)
				return false;
		} else if (!fruitname.equals(other.fruitname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Fruits [fruitname=" + fruitname + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
