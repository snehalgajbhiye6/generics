package mapExample;

public class HcAndEquals {

	public static void main(String[] args) {
		
	Emplyoee e1=new Emplyoee(1,"Abc");
	Emplyoee e2=new Emplyoee(1,"Abc");
	
	System.out.println(e1.equals(e2));
	
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
}

}
