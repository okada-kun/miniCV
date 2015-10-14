package lang.c;

import lang.SimpleToken;

public class CToken extends SimpleToken {
	public static final int TK_PLUS				= 2;				// +
	public static final int TK_SLASH			= 3;				// "/"
	public static final int TK_ASTERISK			= 4;				// "*"
	public static final int TK_MINUS			= 5;				// -
	public static final int TK_AND				= 6;				// &

	public CToken(int type, int lineNo, int colNo, String s) {
		super(type, lineNo, colNo, s);
	}
}
