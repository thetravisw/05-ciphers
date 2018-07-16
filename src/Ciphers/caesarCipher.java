package Ciphers;

public class caesarCipher {
    public static String caesarCipher(String str, int key, boolean encoding){
        String encryptionkey = "" ;
        while (encryptionkey.length() < 27)
        {
            encryptionkey += Cipher.ALPHABET.charAt(key);
            key++;
            if (key >25) key-=26;
        }
        String results = Cipher.encode(str, encryptionkey, encoding);
        return results;
    }
}

