public class Ushtrimi1 {

	public void sum(int a, int b){
		System.out.println("Mbledhja eshte "+(a+b));
	}
	public void product(int a, int b){
		System.out.println("Shumezimi eshte "+(a*b));
	}

  public static void main(String[] args) {
    Ushtrimi1 obj1 = new Ushtrimi1();
	
	obj1.sum(10,5);
	obj1.product(10,5);
	
  }
}
