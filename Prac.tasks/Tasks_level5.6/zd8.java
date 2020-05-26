package app.sass;

import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class zd8 
{
    public static void main(String[] args) throws NoSuchAlgorithmException
    {
        System.out.println(getSha256Hash("Hey dude!"));
    }
    private static String getSha256Hash(String hash) throws NoSuchAlgorithmException
    {
        MessageDigest mD = MessageDigest.getInstance("SHA-256");
        byte[]hashBytes = mD.digest(hash.getBytes(StandardCharsets.UTF_8));
        StringBuilder str = new StringBuilder();
        for(byte p : hashBytes)
            str.append(String.format("%02x",p));
            return str.toString();
    }
}