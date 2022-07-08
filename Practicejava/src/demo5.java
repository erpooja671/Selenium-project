
public class demo5 extends demo3 {
	
	public void input()
	{
		System.out.println("Input Method");
	}
	public void input(String pName)
	{
		System.out.println("Input Method  " +pName);
	
	
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      demo5 D5 = new demo5();
      
      D5.Display();
      D5.input("pooja");
      
	}

}
