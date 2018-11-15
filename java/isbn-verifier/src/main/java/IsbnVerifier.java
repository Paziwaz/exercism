class IsbnVerifier {

    boolean isValid(String stringToVerify) {
    	int position = 10;
    	int sum = 0;
        for (int i = 0; i < stringToVerify.length(); i++) {
        	if (stringToVerify.charAt(i) >= '0' && stringToVerify.charAt(i) <= '9') {
        		sum += (stringToVerify.charAt(i) - '0') * position;
        		position--;
        	}
        	else if (stringToVerify.charAt(i) == 'X' && position == 1) {
        		sum += 10;
        		position--;
        	}
        	else if (stringToVerify.charAt(i) != '-')
        		return false;
        }
        if (position == 0 && sum % 11 == 0)
        	return true;
        return false;
    }
}

