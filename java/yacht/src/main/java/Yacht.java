import java.util.Arrays;


class Yacht {

	int[] dice;
	YachtCategory yachtCategory;
	
	
    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        this.yachtCategory = yachtCategory;
    }

    int score() {
    	
    	int score = 0;
    	Arrays.sort(dice);
    	
    	switch (yachtCategory) {
    	case ONES:
    		score = Arrays.stream(dice).filter(num -> num == 1).sum();
    		break;
    	case TWOS:
    		score = Arrays.stream(dice).filter(num -> num == 2).sum();
    		break;
    	case THREES:
    		score = Arrays.stream(dice).filter(num -> num == 3).sum();
    		break;
    	case FOURS:
    		score = Arrays.stream(dice).filter(num -> num == 4).sum();
    		break;
    	case FIVES:
    		score = Arrays.stream(dice).filter(num -> num == 5).sum();
    		break;
    	case SIXES:
    		score = Arrays.stream(dice).filter(num -> num == 6).sum();
    		break;
    	case FULL_HOUSE:
    		if (dice[0] == dice[1] && dice[4] == dice[3] && dice[0] != dice[4] && 
    		(dice[0] == dice[2] || dice[4] == dice[2]))
    			score = Arrays.stream(dice).sum();
    		break;
    	case FOUR_OF_A_KIND:
    		if (Arrays.stream(dice).filter(num -> num == dice[1]).count() >= 4)
    			score = 4 * dice[1];
    		break;
    	case LITTLE_STRAIGHT:
    		int[] littleStraight = { 1, 2, 3, 4, 5 };
    		if (Arrays.equals(littleStraight, dice))
    			score = 30;
    		break;
    	case BIG_STRAIGHT:
    		int[] bigStraight = { 2, 3, 4, 5, 6 };
    		if (Arrays.equals(bigStraight, dice))
    			score = 30;
    		break;
    	case CHOICE:
    		score = Arrays.stream(dice).sum();
    		break;
    	case YACHT:
    		if (Arrays.stream(dice).filter(num -> num == dice[0]).count() == 5)
    			score = 50;
    		break;
    	}
    	
    	return score;
    	
    }

}
