package org.collection.example;

public class Employee implements Comparable{
	
	private int id;
	private String name;
	private String addr;
	private int age;
	
	public Employee(){
		
	}
	public Employee(int id, String name, String addr, int age) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
		//return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/*public boolean equals(Object obj){
	
		if (obj instanceof Employee) {
          Employee pp = (Employee) obj;
            return (pp.name == this.name);
        } 
		else {
            return true;
       }
	}*/
	/*public int hashCode(){
	
		return name.hashCode();
	}*/
	public int compareTo(Object obj) {
		Employee em = (Employee) obj;
/*		if(id==em.id)
		{
			return 0;
		}
		else if(id>em.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}*/
		return name.compareTo(em.name);
		
	}
	
}
