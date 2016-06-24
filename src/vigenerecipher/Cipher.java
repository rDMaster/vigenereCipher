/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenerecipher;

/**
 *
 * @author ryan
 */
public class Cipher {

    private final String key;
    private final StringBuilder buildKey;
    private final String plainText;
    private final String longKey;
    private final Encrypter encrypter;
    
    /**
     * this constructor builds the repeated key for the text to be encrypted
     * 
     * @param key
     * @param plainText 
     */
    public Cipher(String key, String plainText)
    {
        this.key = key;
        this.plainText = plainText;
        
        
        buildKey = new StringBuilder(plainText.length() + key.length() - 1);
        while(buildKey.length() < plainText.length())
        {
            buildKey.append(key);
        }
        buildKey.setLength(plainText.length());
        
        longKey = buildKey.toString();
        
        encrypter = new Encrypter();
    }
    
    /**
     * calls the encrypted method encrypt
     * @return 
     */
    String encrypt()
    {
        return this.encrypter.encrypt(longKey, plainText);
    }
}
