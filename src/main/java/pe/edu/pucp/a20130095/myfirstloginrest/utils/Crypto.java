package pe.edu.pucp.a20130095.myfirstloginrest.utils;

import de.rtner.security.auth.spi.SimplePBKDF2;

public class Crypto {

	public static String create(String password) {
		return new SimplePBKDF2().deriveKeyFormatted(password);
	}

	public static boolean verify(String userHash, String inputPassword) {
		return new SimplePBKDF2().verifyKeyFormatted(userHash, inputPassword);
	}
}
