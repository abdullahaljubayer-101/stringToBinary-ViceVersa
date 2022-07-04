public class StringToBinary {
    public static String decimalToBinary (int decimal) {
        String binary = "";
        String result = "";
        int remainder;

        while (decimal != 0) {
            remainder = (int) decimal % 2;

            result += remainder;

            decimal /= 2;
        }

        for (int i = result.length(); i < 8; ++i)
            result += "0";

        for (int i = result.length() - 1; i >= 0; --i)
            binary += result.charAt(i);

        return binary;
    }

    public static String stringToBinary (String string) {
        String binary = "";
        int ASCII;

        for (int i = 0; i < string.length(); ++i) {
            ASCII = (int) string.charAt(i);

            binary += decimalToBinary(ASCII) + " ";
        }

        return binary;
    }
}
