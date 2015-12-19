package org.gtv.hashtables.hash;

import java.nio.charset.Charset;

public interface Hasher extends PrimitiveSink{

    Hasher putByte(byte b);
	
	Hasher putBytes(byte[] bytes);
	
	Hasher putBytes(byte[] bytes,int off,int len);
	
	Hasher putShort(short s);
	
	Hasher putInt(int i);
	
	Hasher putLong(long l);
	
	Hasher putFloat(float f);
	
	Hasher putDouble(double d);
	
	Hasher putBoolean(boolean b);
	
	Hasher putChar(char c);
	
	Hasher putUnencodedChars(CharSequence charSequence);
	
	Hasher putString(CharSequence charSequence,Charset charset);
}
