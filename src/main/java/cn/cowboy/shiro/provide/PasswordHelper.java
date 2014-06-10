package cn.cowboy.shiro.provide;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import cn.cowboy.domain.User;

/**
 * 
 * @ClassName: PasswordHelper
 * @Description: 加密工具类
 * @author Tangyinbo
 * @date 2014-6-10 下午5:45:23
 * 
 */
public class PasswordHelper {
	private static  RandomNumberGenerator numberGenerator = new SecureRandomNumberGenerator();
	private static  String algorithmName = "md5";
	private static final int hashIterations = 2;
	/**
	 * 
	* @Title: encryptPassword 
	* @Description: 给用户加密
	* @param @param user   
	* @return void  
	* @author Tangyinbo   
	* @date 2014-6-10 下午5:48:27
	* @throws
	 */
	public static void encryptPassword(User user) {
		user.setSalt(numberGenerator.nextBytes().toHex());
		String newPassword = new SimpleHash(algorithmName, user.getPassword(), ByteSource.Util.bytes(user.getCredentialsSalt()), hashIterations).toHex();
		user.setPassword(newPassword);
	}
}
