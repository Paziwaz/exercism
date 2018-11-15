class LuhnValidator {

    boolean isValid(String candidate) {
    	if (!candidate.matches("[\\s0-9]*") || candidate.trim().length() == 1)
    		return false;
    	int sum = 0;
    	candidate = candidate.replaceAll("[^0-9]", "");
    	for (int i = candidate.length() - 1 ; i >= 0; i--) {
    		if ((candidate.length() - i) % 2 == 0) {
	        	if (candidate.charAt(i) < '5')
	        		sum += (candidate.charAt(i) - '0') * 2;
	        	else
	        		sum += 1 + 2 * ((candidate.charAt(i)- '0') - 5);
    		}
        	else
        		sum += candidate.charAt(i) - '0';
    	}
        return sum % 10 == 0;
    }

}
