class IsogramChecker {

    boolean isIsogram(String phrase) {
    	String sentence = phrase.replace("-", "").replace(" ", "").toLowerCase();
    	char[] storage = new char[sentence.length()];
        for (int index = 0; index != sentence.length(); index++) {
        	if (contains(storage, sentence.charAt(index)))
        		return false;
        	else
        		storage[index] = sentence.charAt(index);
        }
        return true;
    }
    
    public static boolean contains(final char[] array, final char schar) {
        for(char character : array)
            if(character == schar)
                return true;
        return false;
    }


}
