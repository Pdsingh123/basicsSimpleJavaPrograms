package variables;

public class StaticVariables {

	int id;
	String name;
	static String company="tcs";
	public StaticVariables(int i,String n) {
		
		id=i;
		name =n;
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+company);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariables sv = new StaticVariables(101, "pdsingh");
		sv.display();
		
		StaticVariables sv1 = new StaticVariables(102, "dalveer");
		sv1.display();
	}

}
