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
    
    
    private ViginereCipher cipher;
    
    /**
     * 
     * @param key
     * @param plaintext 
     */
    public CipherCoord(String key, String plaintext) {cipher = new ViginereCipher(key , plaintext);}
    
    
    /**
     * Returns a encrypted String encryptedText 
     * @return 
     */
    public String encrypt() {return cipher.encrypt();}
    
    /**
     * Returns a decrypted String from the String encryptedText 
     * @return encryptedText String
     */
    public String decrypt() {return cipher.decrypt();}
    
    /**
     * Sets the value of the key to the argument 
     * @param newKey 
     */
    public void setKey(String newKey) {cipher.setKey(newKey);}
    
    /**
     * Sets the value of plainText to the argument
     * @param newText 
     */
    public void setPlainText(String newText) {cipher.setPlainText(newText);}
    
    /**
     * Sets the value of encryptedText to the argument
     * @param newText 
     */
     public void setEncryptedText(String newText) {cipher.setEncryptedText(newText);}
}
