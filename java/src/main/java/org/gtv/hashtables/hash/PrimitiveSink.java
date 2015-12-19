package org.gtv.hashtables.hash;

import java.nio.charset.Charset;

public interface PrimitiveSink {

	PrimitiveSink putByte(byte b);
	
	PrimitiveSink putBytes(byte[] bytes);
	
	PrimitiveSink putBytes(byte[] bytes,int off,int len);
	
	PrimitiveSink putShort(short s);
	
	PrimitiveSink putInt(int i);
	
	PrimitiveSink putLong(long l);
	
	PrimitiveSink putFloat(float f);
	
	PrimitiveSink putDouble(double d);
	
	PrimitiveSink putBoolean(boolean b);
	
	PrimitiveSink putChar(char c);
	
	PrimitiveSink putUnencodedChars(CharSequence charSequence);
	
	PrimitiveSink putString(CharSequence charSequence,Charset charset);
	
}
