package cn.cowboy.test;

import java.io.IOException;
import java.security.Key;

import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.AesCipherService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Assert;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class BaseTest {
	public static void main(String[] args) throws IOException {
		AesCipherService aesCipherService = new AesCipherService();
		aesCipherService.setKeySize(128); //设置key长度
		//生成key
		Key key = aesCipherService.generateNewKey();
		String text = "hello";
		//加密
		String encrptText =
		aesCipherService.encrypt(text.getBytes(), key.getEncoded()).toHex();
		//解密
		String text2 =
		new String(aesCipherService.decrypt(Hex.decode(encrptText), key.getEncoded()).getBytes());
		Assert.assertEquals(text, text2);
		System.out.println(text);
		System.out.println(text2);
	}
}
