package Ciphers;

public class Rot13 {
    public static String Rot13 (String str){
        String results = caesarCipher.caesarCipher(str, 13, true);
        return results;
    }
}
