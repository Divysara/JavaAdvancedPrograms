package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	Java Program to show the difference between map vs flatMap
  map() is used to transform one Stream into another by applying a function on each element, 
  and flatMap() does both transformations as well as flattening.
  The flatMap() function can take a Stream of List and return a Stream of values combined from all those lists.
  In the example below, we have collected the result in a List 
  but you can also print them using the forEach() method of Java 8.

*/
		
		List<String> fruits = new ArrayList<String>(Arrays.asList("apple","pears","plums", "banana","peaches"));
		
		List<Integer> length = fruits.stream().map(f->f.length()).collect(Collectors.toList());
		System.out.println(length);
		
		
		
		
		
/*Why flat a Stream?
 It’s challenging to process a Stream containing more than one level, 
 like Stream<String[]> or Stream<List<LineItem>> or Stream<Stream<String>>. 
 And we flat the 2 levels Stream into one level, like Stream<String> or Stream<LineItem>, 
 so that we can easily loop the Stream and process it.

 Below is a 2d array, and we can use Arrays.stream or Stream.of to convert it into a Stream,
  and it produces a Stream of String[] or Stream<String[]>.
*/
		String[][] str = new String[][]{{"a","b"}, {"c","d"}};
		
		Stream<String[]> stream = Stream.of(str);
		//or
		
		Stream<String[]> stream1 = Arrays.stream(str);
		
		stream1.collect(Collectors.toList()).forEach(x->System.out.println(x.toString()));
		
	}

}
