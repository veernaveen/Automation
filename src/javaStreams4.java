import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javaStreams4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		                //usage of collect methods - > which converts the results to list
		
		List<String> lis = Stream.of("Veer","Naveen","Madavarapu","Mounica").filter(s->
		s.startsWith("M")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(lis.get(1)); 
	
		
		
		
		// usage of  distinct method, in the below need to print only non-duplicates
		
   	List<Integer> value = Arrays.asList(2,4,4,4,2,5,1,7);
		
		//value.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		List<Integer> ram = value.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ram.get(3));   
		
		
		
		
		
		
		
	}

}
