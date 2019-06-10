package pe.edu.pucp.a20130095.myfirstloginrest.utils;

import de.rtner.security.auth.spi.SimplePBKDF2;

public class Crypto {

	public static String createHash(String password) {
		return new SimplePBKDF2().deriveKeyFormatted(password);
	}

	public static boolean verifyPassword(String inputPassword, String userHash) {
		return new SimplePBKDF2().verifyKeyFormatted(userHash, inputPassword);
	}
}
