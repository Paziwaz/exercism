import java.util.List;
import java.util.ArrayList;

public class Allergies {
	
	private final int score;
	
	Allergies(int score){
		this.score = score;
	}
	
	boolean isAllergicTo(Allergen allergen) {
		return getList().contains(allergen);
	}
	
	List<Allergen> getList(){
		List<Allergen> allergies = new ArrayList<>(); 
		for (Allergen allergen : Allergen.values())
			if ((score & allergen.getScore()) > 0)
				allergies.add(allergen);
		return allergies;
	}
	
}