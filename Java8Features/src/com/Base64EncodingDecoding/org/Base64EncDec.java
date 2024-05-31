package com.Base64EncodingDecoding.org;

import java.util.Base64;

public class Base64EncDec {

	public static void main(String[] args) {
	Base64.Encoder encoder =Base64.getEncoder();
	String EncStr= encoder.encodeToString("smita".getBytes());
	System.out.println("Encoding String is :: "+EncStr);
	
	
	Base64.Decoder decoder = Base64.getDecoder();
	String DecStr =new String(decoder.decode(EncStr));
	System.out.println("Decoding string is :: "+DecStr);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
