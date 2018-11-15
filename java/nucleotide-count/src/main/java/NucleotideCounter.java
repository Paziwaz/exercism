import java.util.HashMap;
import java.util.Map;

class NucleotideCounter{
	
	private final String sequence;
	
	NucleotideCounter(String sequence){
		if (!sequence.matches("[ACTG\\s]*"))
			throw new IllegalArgumentException("");
		this.sequence = sequence;
	}
	
	Map<Character, Integer> nucleotideCounts(){
		Map<Character, Integer> counts = new HashMap<Character, Integer>();
		counts.put('A', 0);
		counts.put('C', 0);
		counts.put('G', 0);
		counts.put('T', 0);
		for (Character nucleotide: sequence.toCharArray())
				counts.put(nucleotide, counts.get(nucleotide) + 1);
		return counts;
	}
	
}