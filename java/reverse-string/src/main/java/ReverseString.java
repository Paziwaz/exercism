class ReverseString {

    String reverse(String inputString) {
        StringBuilder outputString = new StringBuilder();
        for (int index = inputString.length(); index != 0; index--) {
          outputString.append(inputString.charAt(index - 1));
        }
        return outputString.toString();

    }

}
