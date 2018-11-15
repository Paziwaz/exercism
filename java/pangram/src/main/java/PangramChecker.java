public class PangramChecker {

    public boolean isPangram(String input) {
        char[] sentence = new char[input.length()];
        for (int i = 0; i < input.length(); i++)
        	sentence[i] = Character.toLowerCase(input.charAt(i));
        for (char ch = 'a'; ch <= 'z'; ch++)
        	if(!contains(sentence,ch))
        		return false;
        return true;
    }

    
    private static boolean contains(final char[] array, final char ch) {
        for(char character : array)
            if(character == ch)
                return true;
        return false;
    }
}
