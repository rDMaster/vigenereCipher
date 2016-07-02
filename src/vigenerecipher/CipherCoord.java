/**
 * This is the coordinating class for Cipher.
 * All of its methods are public.
 */
package vigenerecipher;

import java.io.Serializable;

/**
 *
 * @author ryan
 */
public class CipherCoord implements Serializable{
    
    
    private Cipher cipher;
    
    
    public CipherCoord(String key, String plaintext)
    {
        cipher = new Cipher(key , plaintext);
    }
    /**
     * 
     *
    public static void main(String[] args) {
        // TODO code application logic here
        
        String plainText = "DONTWORRYBEHAPPY";
        String testKey =  "CHECKIO";
        String result;
        
        Cipher cipher = new Cipher(testKey, plainText);
        
        result = cipher.encrypt();
        
        System.out.println(result);
        
        result = cipher.decrypt();
        
        System.out.println(result);
    }*/
    
    /**
     * 
     * @return 
     */
    public String encrypt()
    {
        return cipher.encrypt();
        
    }
    
    /**
     * 
     * @return 
     */
    public String decrypt()
    {
        return cipher.decrypt();
    }
    
    /**
     * 
     * @param newKey 
     */
    public void setKey(String newKey)
    {
        cipher.setKey(newKey);
    }
    
    /**
     * 
     * @param newText 
     */
    public void setPlainText(String newText)
    {
        cipher.setPlainText(newText);
    }
    
    /**
     * 
     * @param newText 
     */
     public void setEncryptedText(String newText)
    {
        cipher.setEncryptedText(newText);
        
    }
}
