package Ciphers;

public class keyWordCipher extends Cipher {

    public static String keyWordCypher(String str, String keyword, boolean encoding){
        String key="";
        for (int i = 0; i < keyword.length(); i++){
            if (!key.contains(keyword.substring(i,i+1))) key += keyword.charAt(i);

        }

        for (int i=0; i < 26; i++){
            String letter = Cipher.ALPHABET.substring(i,i+1);
            if (!key.contains(letter)) key += letter;
        }

        String results = Cipher.encode(str, key, encoding);
        return results;
    }
}
