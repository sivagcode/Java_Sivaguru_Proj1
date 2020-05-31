package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Flash");
		tvSeries.add("Punisher");
		tvSeries.add("Universe");
		tvSeries.add("Narcos");
		tvSeries.add("Money Heist");
		
		System.out.println("1. Iterating using forEach and lambda expression");
		//1. Iterating using forEach and lambda expression
		
		tvSeries.forEach(shows->{
			System.out.println(shows);
		});

		System.out.println("2. Iterating using iterator()");
		//2. Iterating using iterator()
		
		Iterator <String> it = tvSeries.iterator();
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
		
		System.out.println("3. Iterating using iterator() and Java 8 forEachRemaining() method");
		//3. Iterating using iterator() and Java 8 forEachRemaining() method
		
		it = tvSeries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});
		
		
		System.out.println("4. Iterating using for each loop");
		//4. Iterating using for each loop	
		for(String stseries : tvSeries) {
			System.out.println(stseries);
		}
		
		System.out.println("5. Iterating using for loop");
		//5. Iterating using for loop
		for(int i = 0; i<tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));	
		}
		
		System.out.println("6. Iterating using listIterator() to traverse in both the direction");
		//6. Iterating using listIterator(). In this case we are iterating backward direction
		
		ListIterator <String> tvSeriesListIterator= tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious()) {
			String tvsit = tvSeriesListIterator.previous();
			System.out.println(tvsit);
		}
		
		
	}

}
