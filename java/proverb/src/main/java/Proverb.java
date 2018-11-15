class Proverb {

	String[] words;
	
    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
    	String output = "";
    	if (words.length != 0) {
	        for (int i = 1; i < words.length; i++)
	        	output += "For want of a " + words[i - 1] + " the " + words[i] + " was lost.\n";
	        output += "And all for the want of a " + words[0] +".";
    	}
        return output;
    }

}
