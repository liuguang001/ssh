package com.sshe.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//md5���ܹ���
public class MD5Util {

	public static String md5(String password){

		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			byte[] array = md.digest(password.getBytes()); //���ܺ��md5����
			StringBuffer sb = new StringBuffer();
			for(byte b:array){
				//ת���ú���ַ���
				String str = null;
				//��ÿ��10���Ƶ�����ת����16���Ƶ��ַ���
				str = Integer.toHexString(b);	
				//����Ǹ�ֵ��������λ�ַ���
				if(b<0){
					str = str.substring(str.length()-2);
				}
				//���ת����ֻ��1λ������ǰ�油0
				if(str.length()==1){
					str = "0"+str;
				}
				sb.append(str);
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			System.out.println("����ʧ��");
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(MD5Util.md5("123"));
		
		//-127 -36 -101 -37 82 -48 77 -62 0 54 -37 -40 49 62 -48 85   10����
		
		//81dc9bdb52d04dc20036dbd8313ed055   16����
		//81dc9bdb52d04dc20036dbd8313ed055
		
		//21232f297a57a5a743894a0e4a801fc3
		//21232f297a57a5a743894a0e4a801fc3
	}
}
