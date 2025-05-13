package src.main.java.com.younuschains;
import java.security.MessageDigest;

public class DigitalFingerprint{
    public static String applySha256(String input){
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(input.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();
            
            for (int i = 0; i < hash.length; i++){
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) hexString.append("0");
                hexString.append(hex);
            } 
            return hexString.toString();
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}