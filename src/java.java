 import java.util.ArrayList;

public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Akash");
		list.add("Kumar");
		list.add("Aveer");   
		list.add("Sattar");
		list.add("Alekya");
		int count = 0;
		
		for(int i=0;i<list.size();i++)
		{
			String name = list.get(i);
			if(name.startsWith("A"))
					{
				count++;
					}
		
		}
		System.out.println(count); 
		
	/*	public void()
		{

		ArrayList<String> list = new ArrayList<String>();
		list.add("Akash");
		list.add("Kumar");
		list.add("Aveer");   
		list.add("Sattar");
		list.add("Alekya");
		
		
			
		} */

}
}