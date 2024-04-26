package variables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList();
		al.add(1);
		//al.add("pdsingh");
		al.add(101);
		//al.add(null);
		al.add(25);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
