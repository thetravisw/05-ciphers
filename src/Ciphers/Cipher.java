package Ciphers;

public class Cipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";


    public static String encode(String str, String key, Boolean encoding){
        if (str.length() == 0) return "";

        if (!encoding){
            String temp = key;
            key = str;
            str = key;
        }

        String results = replaceCharacters(str, key, encoding);
        return results;
    }

    protected static String replaceCharacters (String str, String key, boolean encoding){
        String result= "";
        String abc = ALPHABET;

        if (!encoding){
            String temp = key;
            key = abc;
            abc = temp;
        }

            for (int i = 0; i < str.length(); i++) {
                int j = 0;
                char letter = str.charAt(i);
                while (abc.charAt(j) != letter && j < 26) {
                    j++;
                }
                if (j < 27) {
                    result += key.charAt(j);
                } else {
                    result += str.charAt(i);
                }
            }
        System.out.println(result);
        return result;
    }
}
