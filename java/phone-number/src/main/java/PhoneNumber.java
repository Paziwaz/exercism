public class PhoneNumber {
	
	String formattedNumber;

	PhoneNumber(String rawNumber){
		if (!rawNumber.matches("[0-9 ()-.]+"))
			throw new IllegalArgumentException("Illegal character in phone number. Only digits, spaces, parentheses, hyphens or dots accepted.");
		
		String formattedNumber = rawNumber.replaceAll("[^0-9]", "");
		
		if (formattedNumber.length() == 11 || formattedNumber.length() == 10) {
			if (formattedNumber.length() == 11) {
				if (formattedNumber.charAt(0) != '1')
					throw new IllegalArgumentException("Can only have 11 digits if number starts with '1'");
				formattedNumber = formattedNumber.substring(1);
			}
			if (formattedNumber.charAt(0) < '2' || formattedNumber.charAt(3) < '2')
				throw new IllegalArgumentException("Illegal Area Or Exchange Code. Only 2-9 are valid digits");
		}
		else
			throw new IllegalArgumentException("Number must be 10 or 11 digits");
		
		this.formattedNumber = formattedNumber;
	}
	
	String getNumber() {
		return formattedNumber;
	}
}
