class Acronym {
	
	StringBuilder acronym = new StringBuilder();
	
    Acronym(String phrase) {
        String[] parts = phrase.replace("-", " ").split(" ");
        for (String word : parts)
        	if (!word.isEmpty())
        		acronym.append(Character.toUpperCase(word.charAt(0)));
    }

    String get() {
        return acronym.toString();
    }

}
