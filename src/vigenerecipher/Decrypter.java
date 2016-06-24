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
public class Decrypter
{
     private final Key key;
    
    /**
     *
     * @param key
     */
    public Decrypter(String key)
    {
        this.key = new Key(key);
    }
}
