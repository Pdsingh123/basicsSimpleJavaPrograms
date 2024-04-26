package variables;

public class AllVariables {
	
	int x=10;
	static int y=20;
	
	public static void main(String[] args) {
		
	
	
		AllVariables av = new AllVariables();
			
		av.y=55;
		av.x=44;
		AllVariables av1 = new AllVariables();
		System.out.println(av1.x+ " "+ av1.y);
	

}
}
