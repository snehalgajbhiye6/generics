package mapExample;

public class Emplyoee {

	private int id;
	private String name;
	
	public Emplyoee(int id,String name)
	{
	    this.id=id;
	    this.name=name;
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
	
	public int hashCode()
	{
		return 1;
	}
	
	public boolean equals(Object obj)
	{
		if(this ==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		
		Emplyoee emp=(Emplyoee)obj;
		if(id!=emp.id)
			return false;
		return true;
			
			
	}
}
