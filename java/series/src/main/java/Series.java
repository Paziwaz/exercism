import java.util.List;
import java.util.ArrayList;

public class Series {
	
	private final String series;

	Series(String series){
		this.series = series;
	}
	
	List<String> slices(int digits){
		if (series.length() < digits)
			throw new IllegalArgumentException("Slice size is too big.");
		if (digits <= 0)
			throw new IllegalArgumentException("Slice size is too small.");
		List<String> slices = new ArrayList<>();
		for (int i = 0; i <= series.length() - digits; i++)
			slices.add(series.substring(i, i + digits));
		return slices;
	}
	
}
