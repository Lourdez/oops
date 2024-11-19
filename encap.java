package encapsulation;


abstract  class HouseRules{

abstract void hall();
abstract void kitchen();
abstract void livingRoom();

void road(){
System.out.println("road finished ");
}
}

class Sk_Builders extends HouseRules{

	@Override
	public void hall(){
		System.out.println("Hall completed");
	}
	
	@Override
	public void kitchen() {
		System.out.println("Kitchen Completed ");
	}
	
	@Override
	public void livingRoom() {
		System.out.println("Living room Completed ");
	}
}


public class DemoEncap{
	
	public static void main (String[] args) {
		HouseRules o1 = new Sk_Builders();
		o1.hall();
		o1.kitchen();
		o1.livingRoom();
		
	}
}



