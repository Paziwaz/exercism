class Bob{
	
	String hey(String sentence) {
	    String asentence = sentence.trim();
	    if (asentence.isEmpty())
	    	return "Fine. Be that way!";
	    else if (asentence.endsWith("?")) {
	    	if(!asentence.matches(".*[a-z]+.*") && asentence.matches(".*[A-Z]+.*"))
	    		return "Calm down, I know what I'm doing!";
	    	else
	    		return "Sure.";
	    }
	    else if (!asentence.matches(".*[a-z]+.*") && asentence.matches(".*[A-Z]+.*"))
	    		return "Whoa, chill out!";
	    return "Whatever.";
	}
}