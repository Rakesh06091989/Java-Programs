package org.externalization.examples;

import java.io.Externalizable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Employee implements Externalizable {
        transient String name;
       double salary;
       int age;
       long cardNo;
       Address addr;

       public void writeExternal(ObjectOutput out) throws IOException {
              out.writeUTF(name);
              out.writeInt(age);
              out.writeDouble(salary);
              out.writeUTF(addr.city);
              out.writeInt(addr.pincode);
             

       }

       public void readExternal(ObjectInput in) throws IOException,
                     ClassNotFoundException {
              name = in.readUTF();
              age = in.readInt();
              salary = in.readDouble();
              addr = new Address();
              addr.city = in.readUTF();
              addr.pincode = in.readInt();

       }
}