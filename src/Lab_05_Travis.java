import javax.crypto.Cipher;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;


public class Lab_05_Travis {
    public static void main(String[] args) {
        System.out.println("Choose Your Cipher");
        System.out.println("1:  Caesar (encoding)");
        System.out.println("2:  Caesar (decoding)");
        System.out.println("3:  Rot13");
        System.out.println("4:  Keyword (encoding)");
        System.out.println("5:  Keyword (decoding)");
        System.out.println();
        System.out.print("Pick your Poison\r\n");

        //  method = method number.  str string.  key = key

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int method =0;
        try {
            method = Integer.parseInt(br.readLine());

            if(method < 0 || method > 5) {
                System.out.println("You have entered an invalid selection, please try again\r\n");
            } else {
                System.out.println("You have entered " + method + "\r\n");
            }
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your input!\r\n");
            System.exit(1);
        }

        System.out.println("Type your Text");
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        System.out.println("You have entered " + str + "\r\n");

        int key=0;
        String strkey="";
        if (method !=3) {
            System.out.println("Type your Encryption key");
            if (method < 4) {
                key = reader.nextInt();
            } else {
                strkey = reader.nextLine();
            }
        }
        if (method==1) Ciphers.caesarCipher.caesarCipher(str, key, true);
        if (method==2) Ciphers.caesarCipher.caesarCipher(str, key, false);
        if (method==3) Ciphers.Rot13.Rot13(str);
        if (method==4) Ciphers.keyWordCipher.keyWordCypher(str,strkey,true);
        if (method==5) Ciphers.keyWordCipher.keyWordCypher(str,strkey,false);
    }
}


