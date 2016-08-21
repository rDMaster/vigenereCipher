/**
 * The cipher class takes the key and plain text as arguments
 * and can then be used to return an encrypted string via the encrypt method
 * This cipher currently uses values 1 - 254 of the ASCii table. 
 * I may edit in the future to give the user an option of the range used.
 * 
 */
package vigenerecipher;

/**
 *
 * @author ryan
 */



public class ViginereCipher {

    private String key;
    private StringBuilder buildKey;
    private String plainText;
    private String longKey;
    private StringBuilder encryptedText;
    
    
    /**
     * this constructor builds the repeated key for the text to be encrypted
     * 
     * @param key
     * @param plainText 
     */
    public ViginereCipher(String key, String plainText)
    {
        this.key = key;
        this.plainText = plainText;
        
        
        buildKey = new StringBuilder(plainText.length() + key.length());
        while(buildKey.length() < plainText.length())
        {
            buildKey.append(key);
        }
        buildKey.setLength(plainText.length());
        
        longKey = buildKey.toString();
        encryptedText = new StringBuilder(plainText.length() );
        
        
    }
    
    /**
     *  /**
     * Returns a encrypted String encryptedText 
     * @return String encrypted Text
     * @param longKey
     * @param plainText
     * @return encrypted text
     */
    String encrypt()
    {
        int length = plainText.length();
        //longKey = longKey.toUpperCase();
        //plainText = plainText.toUpperCase();
        
        for(int i = 0; i < length; i++)
        {
            char current = plainText.charAt(i);
            char offset = longKey.charAt(i);
            int shift = offset - 1;
            //if(current < 'A' && current > 'Z') 
               // continue;
            
            encryptedText.append((char) ((current - 1 + shift) % 253 + 1));
        }
        System.out.println(longKey);
        return encryptedText.toString();
    }
    
    /**
     * Returns a decrypted String from the String encryptedText 
     * @return String decrypted Text
     */
    String decrypt()
    {
        StringBuilder decrypt = new StringBuilder(encryptedText.length());
        
        for(int i = 0; i < encryptedText.length(); i++)
        {
            char current = encryptedText.charAt(i);
            char offset = longKey.charAt(i);
            int shift = offset - 1;
            
            decrypt.append((char) ((current - offset + 253) % 253 + 1));
        }
       return decrypt.toString(); 
    }
    
    
    /**
     * Sets the value of the key to the argument 
     * String
     * @param newKey 
     */
    void setKey(String newKey)
    {
        this.key = newKey;
    }
    
    /**
     * Sets the value of plainText to the argument
     * String
     *
     * @param newText 
     */
     void setPlainText(String newText)
    {
        this.plainText = newText;
    }
     
     /**
      * Sets the value of encryptedText to the argument
      * String 
      * @param newText 
      */
    void setEncryptedText(String newText)
    {
        this.encryptedText = new StringBuilder(newText.length());
        this.encryptedText.append(newText);
    }
    
   
}
