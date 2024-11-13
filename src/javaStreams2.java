import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class javaStreams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    //OTOO
//	Stream.of("Zen","Samdhani","Lavanya","Rajesh","Veer").filter(s->s.startsWith("L")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		   //Here in the below line we have used sort as extra which will put all the words in alphabatical order.
	
		Stream.of("Zennn","Samdhani","Lavanya","Rajesh","Veer").filter(s->s.length()>4).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	                         //OTOO
		
	//	List<String> names = Arrays.asList("Zen","yahoo","Samaa"); 
	//	names.stream().filter(s->s.length()>4).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));  
		
		
		//When using sorting it will first the upper case and lower case logic and then comes to alphabatical logic.
		
			
		
		

	
	

}}
