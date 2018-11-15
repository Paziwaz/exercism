class LargestSeriesProductCalculator {
	
	String inputNumber;
	
    LargestSeriesProductCalculator(String inputNumber) {
    	for (int i = 0; i < inputNumber.length(); i++)
    		if (inputNumber.charAt(i) > '9' || inputNumber.charAt(i) < '0')
    			throw new IllegalArgumentException("String to search may only contain digits.");
        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
    	if (numberOfDigits < 0)
    		throw new IllegalArgumentException("Series length must be non-negative.");
    	if (numberOfDigits > inputNumber.length())
    		throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
    	long result = 0;
        for (int i1 = 0; i1 <= inputNumber.length() - numberOfDigits; i1++) {
        	long tempResult = 1;
        	for (int i2 = i1; i2 < i1 + numberOfDigits; i2++)
        		tempResult *= inputNumber.charAt(i2) - '0';
        	if (tempResult > result)
        		result = tempResult;
        }
        return result;
    }
}
