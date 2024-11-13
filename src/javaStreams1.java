import java.util.ArrayList;
import java.util.stream.Stream;

public class javaStreams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Akash");
		list.add("Kum");
		list.add("Aveer");   
		list.add("Sattar");
		list.add("Alekya");
		
		//there is no life for intermediate operation if there is no terminal operation.
		//terminal operation will execute only if intermediate operation(filter) returns true.
		//We can directly create a stream instead of creating a Collection.	
		//how to use filter in stream api
		// The return type of count is long
		
		long v = list.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(v);
		
		                         //one type of operation
		list.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		                         //one type of operation
		list.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
	
		
		
		
		// Instead of creating a collection ArrayList<String> and all we can directly create as follows:
		//Stream.of("Veer","Naveen","Madavarapu").filter(s -> s.startsWith("A"));
	}
	

}
