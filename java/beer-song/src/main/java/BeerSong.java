public class BeerSong {
	
	String sing(int verse, int versesAmount) {
		StringBuilder song = new StringBuilder();
		for (int bottlesAmount = verse; bottlesAmount > verse - versesAmount; bottlesAmount--)
			switch (bottlesAmount) {
				case 2:
					song.append("2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, " +
	                    "1 bottle of beer on the wall.\n\n");
					break;
				case 1:
						song.append("1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, " +
	                    "no more bottles of beer on the wall.\n\n");
						break;
				case 0:
						song.append("No more bottles of beer on the wall, no more bottles of beer.\n" +
	                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n");
						break;
				default:
					song.append(String.valueOf(bottlesAmount) + " bottles of beer on the wall, " + String.valueOf(bottlesAmount) + " bottles of beer.\n" +
	                    "Take one down and pass it around, " + String.valueOf(bottlesAmount - 1) +  " bottles of beer on the wall.\n\n");	
			}
		return song.toString();
	}
	
	String singSong() {
		return sing(99, 100);
	}
	
}
