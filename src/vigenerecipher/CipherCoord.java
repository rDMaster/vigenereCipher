/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    public String encrypt()
    {
        return cipher.encrypt();
        
    }
    
    public String decrypt()
    {
        return cipher.decrypt();
    }
    
    public void setKey(String newKey)
    {
        cipher.setKey(newKey);
    }
    
    public void setPlainText(String newText)
    {
        cipher.setPlainText(newText);
    }
    
     public void setEncryptedText(String newText)
    {
        cipher.setEncryptedText(newText);
        
    }
}
