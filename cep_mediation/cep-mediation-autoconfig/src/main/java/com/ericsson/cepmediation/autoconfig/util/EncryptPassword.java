package com.ericsson.cepmediation.autoconfig.util;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Encoder;

/**
 * Generate encrypted password based on input
 * @author evikkua
 *
 */
public class EncryptPassword {

    private static final String ALGORITHM = "AES";

    //Common key to encrypt and decrypt password
    private static final byte[] keyValue = new byte[] { 0x43, 0x45, 0x50, 0x4d, 0x45, 0x44, 0x49, 0x41, 0x54, 0x49, 0x4f, 0x4e, 0x50, 0x41, 0x53, 0x53 };

    /**
     * Encrypt password using AES (16-bytes) algorithm 
     * @param password
     * @return encrypted password
     * @throws BadPaddingException 
     * @throws IllegalBlockSizeException 
     * @throws InvalidKeyException 
     * @throws NoSuchPaddingException 
     * @throws NoSuchAlgorithmException 
     * @throws Exception
     */
    public static String encrypt(String password) throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException, NoSuchAlgorithmException,
            NoSuchPaddingException {
        Key key = generateKey();
        Cipher chiper = Cipher.getInstance(ALGORITHM);
        chiper.init(Cipher.ENCRYPT_MODE, key);
        byte[] encPass = chiper.doFinal(password.getBytes());
        String encryptedPass = new BASE64Encoder().encode(encPass);
        return encryptedPass;
    }

    private static Key generateKey() {
        Key key = new SecretKeySpec(keyValue, ALGORITHM);
        return key;
    }

    public static void main(String[] args) {
        String password = null;
        try {
            if (args != null && args.length > 0 && !args[0].equals("")) {
                password = args[0];
                String passwordEnc = EncryptPassword.encrypt(password);
                System.out.println(passwordEnc);
            } else {
                System.out.println("Password not entered by user");
            }
        } catch (Exception e) {
            System.out.println("Error in encrypting password" + e.getMessage());
        }
    }
}