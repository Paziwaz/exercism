class Scrabble {

	private final String word;
	private static final int[] letterValues = new int[26];
	
	{
    	setLetterValues("AEIOULNRST", 1);
    	setLetterValues("DG", 2);
    	setLetterValues("BCMP", 3);
    	setLetterValues("FHVWY", 4);
    	setLetterValues("K", 5);
    	setLetterValues("JX", 8);
    	setLetterValues("QZ", 10);
	}
	
    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
    	int score = 0;
    	for (char letter: word.toCharArray())
    		score += letterValues[Character.toUpperCase(letter) - 'A'];
    	return score;
    }
    
    private static void setLetterValues(String letters, int points) {
    	for (char letter: letters.toCharArray())
    		letterValues[letter - 'A'] = points;
    }
    
}
