import java.util.*;

class Anagram{
	private char[] letters;
	private int size;
	private String word;
	Anagram(String word){
		this.word = word.toLowerCase();
		size = word.length();
		letters = new char[size];
	}
	
	public List<String> match(List<String> words) {
		for (int i = 0; i != size; i++)
			letters[i] = word.charAt(i);
		Arrays.sort(letters);
		List<String> anagrams = new ArrayList<String>();
		for (String obj : words) {
			String object = obj.toLowerCase();
			if (object.length() == size && !word.equals(object)) {
				char[] temp = new char[size];
				for ( int i = 0; i != size; i++)
					temp[i] = object.charAt(i);
				Arrays.sort(temp);
				if (Arrays.equals(letters, temp))
					anagrams.add(obj);
			}
		}
		return anagrams;
	}
}