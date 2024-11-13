import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.testng.Assert;


public class javaStreams3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Merging two streams
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Akash");
		list.add("Kum");
		list.add("Aveer");   
		list.add("Sattar");
		list.add("Alekya");
		
		
		List<String> names = Arrays.asList("Samdhani","Lavanya","Rajesh");
		
		
		Stream<String> newStream = Stream.concat(list.stream(), names.stream());
		                  //OTOO
		newStream.sorted().forEach(s->System.out.println(s));
		
		
		
		
		                            //OTOO
		boolean find = newStream.anyMatch(s->s.equalsIgnoreCase("Kum"));
		System.out.print(find);
		//Assert.assertTrue(find);


}}
