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
public final class Key
{
    private final String key;
    
    /**
     * 
     * @param key 
     */
    public Key(String key)
    {
        this.key = key;
       
    }
    
    /**
     * Returns the key specified created by the constructor
     * @return key a String
     */
    String getKey()
    {
        return this.key;
    }
}
