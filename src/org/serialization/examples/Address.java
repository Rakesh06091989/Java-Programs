package org.serialization.examples;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Address implements Serializable/*Externalizable*/{
	
	String city;
	int appno;
	int pincode;
	
	Address(String city,int appno,int pincode)
	{
		this.city=city;
		this.appno=appno;
		this.pincode = pincode;
	}

	/*@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(city);
		out.writeInt(appno);
		out.writeInt(pincode);	
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		city = in.readUTF();
		appno = in.readInt();
		pincode = in.readInt();
	}
*/
}
