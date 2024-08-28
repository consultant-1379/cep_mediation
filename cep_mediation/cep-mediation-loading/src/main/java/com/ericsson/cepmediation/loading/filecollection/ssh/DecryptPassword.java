package com.ericsson.cepmediation.loading.filecollection.ssh;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;

/**
 * Decrypt encrypted password
 * @author evikkua
 *
 */
public class DecryptPassword {
    private static final String ALGORITHM = "AES";

    //Common key to encrypt and decrypt password
    private static final byte[] keyValue = new byte[] { 0x43, 0x45, 0x50, 0x4d, 0x45, 0x44, 0x49, 0x41, 0x54, 0x49, 0x4f, 0x4e, 0x50, 0x41, 0x53, 0x53 };

    /**
     *           
     * @param encryptedData
     * @return decrypted password
     */
    public static String decrypt(String encryptedData) {
        try {
            Key key = new SecretKeySpec(keyValue, ALGORITHM);
            Cipher chiper = Cipher.getInstance(ALGORITHM);
            chiper.init(2, key);
            byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
            byte[] decValue = chiper.doFinal(decordedValue);
            return new String(decValue);
        } catch (Exception e) {
            return encryptedData;
        }
    }
}