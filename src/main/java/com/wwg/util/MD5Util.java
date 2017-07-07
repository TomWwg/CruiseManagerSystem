package com.wwg.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5Util {

    /**
     *
     * @param password     明文
     * 
     * @return 32位密文
     */
    public static String encryption(String password) {
        String re_md5 = new String();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }

            re_md5 = buf.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return re_md5;
    }
public static void main(String[] args) {
   System.err.println( MD5Util.encryption("123456"));
}
}
