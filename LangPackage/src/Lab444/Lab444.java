package Lab444;

public class Lab444 {

	public static void main(String[] args) {
		System.out.println("\n***With Student***");
		Student st1 = new Student(99,9031781734l);
		Student st2 = new Student(99,9031781734l);
		Student st3 = new Student(88,7050366209l);
		Student st4 = st1;
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st3 == st4);
	}

}
