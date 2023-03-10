public class StringBuilder {

    public static void main(String[] args) {

        String text = """
                1. We are paragons
                2. Deviel is a Liar
                3. There are 7 Days of the week
                
                """;

        String digitWithinText = " ";

        for (int i = 0; i < text.length(); i++) {
            char currentChatacter = text.charAt(i);
            if (Character.isDigit(currentChatacter)){
                digitWithinText += currentChatacter;
            }
        }
        System.out.println(digitWithinText);
    }


}
