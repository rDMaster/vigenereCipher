/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenerecipher;

/**
 *
 * @author RYAN
 */
public class Encrypter
{
    
    
    
    /**
     * 
     */
    public Encrypter()
    {
       
    }
    
    /**
     * 
     * @param longKey
     * @param plainText
     * @return encrypted text
     */
    String encrypt(String longKey, String plainText)
    {
        int length = plainText.length() - 1;
        int upperBound = 125;
        int current = 0;
        StringBuilder encryptText = new StringBuilder(length);
        
        for(int i = 1; i < length; i++)
        {
            current = plainText.charAt(i) + longKey.charAt(i) % 125;
            
            encryptText.append(current);
        }
        
        return encryptText.toString();
    }
            
    
}
