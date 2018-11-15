class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int number = numberToCheck;
		int length = 0;
		int sum = 0;
		for (int temp = number; temp != 0; temp /= 10)
			length += 1;
		while (number > 0) {
			sum += Math.pow( number % 10, length);
			number /= 10;
		}
		if (numberToCheck == sum)
			return true;
		else
			return false;
	}

}
