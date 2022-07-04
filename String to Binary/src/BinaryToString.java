public class BinaryToString {
    public static String binaryToString (String binary) {
        String string = "";
        String temBinary = "";
        int decimal = 0;

        for (int i = 0; i < binary.length(); ++i) {
            if (binary.charAt(i) == ' ') {
                for (int j = temBinary.length() - 1; j >= 0; --j)
                    if (temBinary.charAt(j) == '1')
                        decimal += Math.pow(2, 7 - j);

                string += (char) decimal;

                decimal = 0;
                temBinary = "";
            }
            else
                temBinary += binary.charAt(i);
        }

        return string;
    }
}
