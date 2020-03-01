package org.externalization.examples;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Address implements Serializable /*Externalizable*/{
	
	int appno;
	String city;
	int pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	Address(String city,int appno,int pincode)
	{
		this.city=city;
		this.appno=appno;
		this.pincode=pincode;
	}

	
	@Override
	public String toString() {
		return "Address [appno=" + appno + ", city=" + city + ", pincode=" + pincode + "]";
	}
/*	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}*/

}
