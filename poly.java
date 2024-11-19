package polymorphism;


class Cal{
	
	int add(int a , int b) {
		return a*a;
	}
	
	float add (float a,float b) {
		return a+a;
	}
	
}
public class PolyDEmo {

	public PolyDEmo() {
		
		//Cal c1 = new Cal();
		
		
		
		new Cal().add(5,5);
		new Cal().add(5,5);
		
		System.out.println();
		
	}

}
