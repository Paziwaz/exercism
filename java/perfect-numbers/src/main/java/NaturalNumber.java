class NaturalNumber {

	int number;
	
	NaturalNumber(int number) {
		if (number <= 0)
			throw new IllegalArgumentException("You must supply a natural number (positive integer)");
		this.number = number;
	}

	Classification getClassification() {
		int aliquotSum = 0;
		for (int factor = 1; factor <= number / 2; factor++)
			if (number % factor == 0)
				aliquotSum += factor;
		if (aliquotSum < number)
			return Classification.DEFICIENT;
		if (aliquotSum > number)
			return Classification.ABUNDANT;
		return Classification.PERFECT;
			
	}
	
}
