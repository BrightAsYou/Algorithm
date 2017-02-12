package prs.rfh.algorithm.sign;

import org.junit.Test;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Swift
 * @version $Algorithm: MD5Sign, v 0.1 2017/1/19 10:59 Swift Exp $$
 */
public class MD5Sign {

    public String EncoderByMd5(String str) throws NoSuchAlgorithmException,
                                           UnsupportedEncodingException, NoSuchAlgorithmException {
        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        byte[] bs = md5.digest(str.getBytes("utf-8"));
        return bytesToHexString(bs);
    }

    @Test
    public void testMD5() {
        String str = "amount=1.00&cardNo=3870497431454e0ab769f4053eed4fa3cdac86541af72b14&channelFromUserNo=110000061754&channelToUserNo=110000068085&charset=UTF-8&outOrderId=161213150053472703&requestId=161213110053479228&requestTime=20170119123200&status=S&timeVersion=161213110053479228&tradeChannel=PRT&version=1.0aa";
        try {
            System.out.println(EncoderByMd5(str));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

}
