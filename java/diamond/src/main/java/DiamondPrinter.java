import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
    	int size = 2 * (a - 'A') + 1;
    	int center = size / 2;
    	char[][] matrix = new char[size][size];
    	for (char[] row : matrix)
    		Arrays.fill(row, ' ');
    	matrix[0][center] = 'A';
    	for (int i = 1; i < size - 1; i++) {
    		matrix[i][Math.abs(center - i)] = (char) ('A' + center - Math.abs(center - i));
    		matrix[i][size - Math.abs(center - i) - 1] = (char) ('A' + center - Math.abs(center - i));
    	}
    	matrix[size - 1][center] = 'A';
    	List<String> diamond = new ArrayList<>();
    	for (char[] row : matrix)
    		diamond.add(String.valueOf(row));
    	return diamond;
    }

}
