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
    public Cipher(String key, String plainText)
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
     * 
     * @param longKey
     * @param plainText
     * @return encrypted text
     */
    String encrypt()
    {
        int length = plainText.length();
        longKey = longKey.toUpperCase();
        plainText = plainText.toUpperCase();
        
        for(int i = 0; i < length; i++)
        {
            char current = plainText.charAt(i);
            char offset = longKey.charAt(i);
            int shift = offset - 'A';
            if(current < 'A' && current > 'Z') 
                continue;
            
            encryptedText.append((char) ((current - 1 + shift) % 253 + 1));
        }
        System.out.println(longKey);
        return encryptedText.toString();
    }
    
    String decrypt()
    {
        StringBuilder decrypt = new StringBuilder(encryptedText.length());
        
        for(int i = 0; i < encryptedText.length(); i++)
        {
            char current = encryptedText.charAt(i);
            char offset = longKey.charAt(i);
            int shift = offset - 'A';
            
            decrypt.append((char) ((current - offset + 253) % 253 + 1));
        }
       return decrypt.toString(); 
    }
    
    void setKey(String newKey)
    {
        this.key = newKey;
    }
    
     void setPlainText(String newText)
    {
        this.plainText = newText;
    }
     
    void setEncryptedText(String newText)
    {
        this.encryptedText = new StringBuilder(newText.length());
        this.encryptedText.append(newText);
    }
    
   
}
