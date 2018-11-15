import java.util.*;

class ProteinTranslator {
    private static final Map<String, String> codonToProtein = new HashMap<>();
    static
    {
        codonToProtein.put("AUG", "Methionine");
        codonToProtein.put("UUU", "Phenylalanine");
        codonToProtein.put("UUC", "Phenylalanine");
        codonToProtein.put("UUA", "Leucine");
        codonToProtein.put("UUG", "Leucine");
        codonToProtein.put("UCU", "Serine");
        codonToProtein.put("UCC", "Serine");
        codonToProtein.put("UCA", "Serine");
        codonToProtein.put("UCG", "Serine");
        codonToProtein.put("UAU", "Tyrosine");
        codonToProtein.put("UAC", "Tyrosine");
        codonToProtein.put("UGU", "Cysteine");
        codonToProtein.put("UGC", "Cysteine");
        codonToProtein.put("UGG", "Tryptophan");
        codonToProtein.put("UAA", "STOP");
        codonToProtein.put("UAG", "STOP");
        codonToProtein.put("UGA", "STOP");
    }

    List<String> translate(String rnaSequence) {
    	List<String> proteins = new ArrayList<>();
    	for (int i = 0; i < rnaSequence.length(); i += 3) {
    		if (codonToProtein.get(rnaSequence.substring(i, i + 3)).equals("STOP"))
    			break;
    		proteins.add(codonToProtein.get(rnaSequence.substring(i, i + 3)));
    	}
    	return proteins;
    }
}