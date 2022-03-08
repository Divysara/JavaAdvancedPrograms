package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LamdaExpression {

	public static void main(String[] args) {

		List<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Vijay",2020,"Master"));
		list.add(new Movie("Ajth",2019,"Viswasam"));
		list.add(new Movie("vijay",2019,"kathhi"));
		list.add(new Movie("Vijay",2020,"ghilli"));
		list.add(new Movie("surya",2019,"jai"));
		
		getMovie(list, m1 -> m1.getYear() == 2019);
		
		getMovie(list, m -> m.getActor().equalsIgnoreCase("vijay"));
		
		
	}
	
	
	public static void getMovie(List<Movie> l, Predicate<Movie> predicate) {
		for(Movie movie: l) {
			if(predicate.test(movie)) {
				System.out.println(movie.getName());
			}
		}
	}

}
class Movie{

	String actor, name;
	int year;
	
	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Movie(String actor, int year, String name) {
		// TODO Auto-generated constructor stub
		this.actor = actor;
		this.name= name;
		this.year =year;
	}
	
}