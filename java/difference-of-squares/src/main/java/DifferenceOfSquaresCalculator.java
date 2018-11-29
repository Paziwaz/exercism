class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
    	int sum = 0;
        for (int number = 1; number <= input; number++)
        	sum += number;
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
    	int sumOfSquares = 0;
        for (int number = 1; number <= input; number++)
        	sumOfSquares += number * number;
        return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
