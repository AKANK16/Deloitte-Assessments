
public class Customer implements Comparable{

	int Id;
	String Name;
	String Email;
	long MobNo;
	
	public Customer(int id, String name, String email, long mobNo) {
		super();
		this.Id = id;
		this.Name = name;
		this.Email = email;
		this.MobNo = mobNo;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		this.Id = id;
	}


	public String getName() {
		return Name;
	}



	public void setName(String name) {
		this.Name = name;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		this.Email = email;
	}



	public long getMobNo() {
		return MobNo;
	}



	public void setMobNo(long mobNo) {
		this.MobNo = mobNo;
	}


	@Override
	public int compareTo(Object o)
	{
		Customer C= (Customer) o;
		return this.getId()-C.getId();
	}
	
	@Override
	public String toString()
	{
		return "Employee [empID=" + Id + ", name=" + Name + ", designation="
				+ Email + "Mob No :" + MobNo + "]\n";
	}

	
	
}
