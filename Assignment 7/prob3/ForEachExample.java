package prob3;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
			  print(list);
//		Consumer<String> consumer = new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s.toUpperCase());
//			}
//		};
		//list.forEach(consumer);
		//print each element of the list in upper case format
		//list.forEach(s-> System.out.println(s.toUpperCase()));
	}

	//implement a Consumer
	public static void print(List<String> list ){
		Consumer<String> func = new Consumer<>(){

			@Override
			public void accept(String o) {
				System.out.println(o.toUpperCase());
			}
		};
	//	list.forEach(s->func.accept(s));
		list.forEach(func);
	}
	
}