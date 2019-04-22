package com.xuexiang.xupdateservice.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * 	生成唯一的GUID
 *
 * @author XUE
 * @since 2019/4/22 13:30
 */
public final class RandomGUID {

	public String valueBeforeMD5 = "";
	public String valueAfterMD5 = "";
	private static Random myRand;
	private static SecureRandom mySecureRand;

	private static String s_id;
	private static final int PAD_BELOW = 0x10;
	private static final int TWO_BYTES = 0xFF;

	static {
		mySecureRand = new SecureRandom();
		long secureInitializer = mySecureRand.nextLong();
		myRand = new Random(secureInitializer);
		new Thread(new Runnable() {
			public void run() {
				try {
					s_id = InetAddress.getLocalHost().toString();
				} catch (UnknownHostException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	/**
	 * 获取随机生成的GUID
	 * @return
	 */
	public static String getRandomGUID() {
		return new RandomGUID().toString();
	}

	public RandomGUID() {
		getRandomGUID(false);
	}
	public RandomGUID(boolean secure) {
		getRandomGUID(secure);
	}

	/*
	 * Method to generate the random GUID
	 */
	private void getRandomGUID(boolean secure) {
		MessageDigest md5 = null;
		StringBuffer sbValueBeforeMD5 = new StringBuffer(128);

		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {

		}
		try {
			long time = System.currentTimeMillis();
			long rand = 0;

			if (secure) {
				rand = mySecureRand.nextLong();
			} else {
				rand = myRand.nextLong();
			}
			sbValueBeforeMD5.append(s_id);
			sbValueBeforeMD5.append(":");
			sbValueBeforeMD5.append(time);
			sbValueBeforeMD5.append(":");
			sbValueBeforeMD5.append(rand);

			valueBeforeMD5 = sbValueBeforeMD5.toString();
			md5.update(valueBeforeMD5.getBytes());

			byte[] array = md5.digest();
			StringBuffer sb = new StringBuffer(32);
			for (byte b1 : array) {
				int b = b1 & TWO_BYTES;
				if (b < PAD_BELOW)
					sb.append('0');
				sb.append(Integer.toHexString(b));
			}

			valueAfterMD5 = sb.toString();

		} catch (Exception e) {

		}
	}

	public String toString() {
		String raw = valueAfterMD5.toUpperCase();
		StringBuffer sb = new StringBuffer(64);
		sb.append(raw, 0, 8);
		sb.append("-");
		sb.append(raw, 8, 12);
		sb.append("-");
		sb.append(raw, 12, 16);
		sb.append("-");
		sb.append(raw, 16, 20);
		sb.append("-");
		sb.append(raw.substring(20));

		return sb.toString();
	}

}
