package InClassChapterNine;

import java.util.ArrayList;

public class shop95 {

	public static void main(String[] args){
		ArrayList<Food> foodList = new ArrayList<Food>();
		ArrayList<Double> checkList = new ArrayList<Double>();
		
		Sandwich sand1 = new Sandwich("Italian", 10);
		Sandwich sand2 = new Sandwich("Veggie", 8);
		Salad salad1 = new Salad("Italian", 10, .8);
		Salad salad2 = new Salad("Ceasar", 10, .5);
		
		checkList.add(10.0);
		checkList.add(8.0);
		checkList.add(8.0);
		checkList.add(5.0);
		
		foodList.add(sand1);
		foodList.add(sand2);
		foodList.add(salad1);
		foodList.add(salad2);
		
		int i = 0;
		for(Food f : foodList){
			System.out.println("Expected: " + checkList.get(i));
			System.out.println(f.getPrice());
			i++;
		}
	}
}
