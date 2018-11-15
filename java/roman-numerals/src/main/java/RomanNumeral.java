public class RomanNumeral {

	private final int ArabicNumeral;
	private final static String[][] RomanMatrix = {{"I", "V"}, {"X", "L"}, {"C", "D"}, {"M"}};
	
	RomanNumeral(int ArabicNumeral){
		this.ArabicNumeral = ArabicNumeral;
	}
	
	String getRomanNumeral(){
		StringBuilder RomanNumeral = new StringBuilder();
		for (int i = String.valueOf(ArabicNumeral).length() - 1; i >= 0; i--)
			switch (ArabicNumeral % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i)) {
			case 1:
				RomanNumeral.append(RomanMatrix[i][0]);
				break;
			case 2:
				RomanNumeral.append(RomanMatrix[i][0] + RomanMatrix[i][0]);
				break;
			case 3:
				RomanNumeral.append(RomanMatrix[i][0] + RomanMatrix[i][0] + RomanMatrix[i][0]);
				break;
			case 4:
				RomanNumeral.append(RomanMatrix[i][0] + RomanMatrix[i][1]);
				break;
			case 5:
				RomanNumeral.append(RomanMatrix[i][1]);
				break;
			case 6:
				RomanNumeral.append(RomanMatrix[i][1] + RomanMatrix[i][0]);
				break;
			case 7:
				RomanNumeral.append(RomanMatrix[i][1] + RomanMatrix[i][0] + RomanMatrix[i][0]);
				break;
			case 8:
				RomanNumeral.append(RomanMatrix[i][1] + RomanMatrix[i][0] + RomanMatrix[i][0] + RomanMatrix[i][0]);
				break;
			case 9:
				RomanNumeral.append(RomanMatrix[i][0] + RomanMatrix[i + 1][0]);
				break;
			}
		return RomanNumeral.toString();
	}
	
}
