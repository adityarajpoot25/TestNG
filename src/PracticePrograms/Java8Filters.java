package PracticePrograms;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Java8Filters {

	public static void main(String[] args) {
		
		ArrayList<String>names= new ArrayList<String>();
		names.add("aditya");
		names.add("pankaj");
		names.add("anuj");
		names.add("ankur");
		names.add("deep");
		
		long c=names.stream().filter(s ->s.startsWith("a")).count();
		System.out.println(c);
		long d=Stream.of("aditya","pankaj","anuj","ankur","deep").filter(s ->
		{
			s.startsWith("a");
			return true;
		}).count();
		System.out.println(d);
		
		names.stream().filter(s ->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}

}
