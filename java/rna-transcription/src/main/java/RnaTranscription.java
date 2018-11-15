class RnaTranscription {

    String transcribe(String dnaStrand) {
    	return dnaStrand.replace("A", "U").replace("T", "A").replace("C", "g").replace("G", "C").toUpperCase();
    }

}
