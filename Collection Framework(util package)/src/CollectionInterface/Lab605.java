package CollectionInterface;

import java.util.*;

public class Lab605 {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("JDBC");
		col.add("JSP");
		col.add("Srinivas");
		col.add("Java");
		col.add("Dande");
		col.add("Dande");
		
		Collection col2 = new ArrayList();
		col2.add("Java");
		col2.add("JDBC");
		col2.add("JSP");
		
		System.out.println(col);					//[JDBC, JSP, Srinivas, Java, Dande, Dande]
		System.out.println(col2);					//[Java, JDBC, JSP]
		System.out.println(col.retainAll(col2));	//true
		System.out.println(col);					//[JDBC, JSP, Java]
		System.out.println(col2);					//[Java, JDBC, JSP]
	}

}
