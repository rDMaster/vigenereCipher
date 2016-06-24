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
public class CipherCoord {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String testKey =  "hello";
        String plainText = " hello there My name is larry.";
        
        Cipher cipher = new Cipher(testKey, plainText);
    }
}
