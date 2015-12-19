package org.gtv.hashtables.hash;

public interface Funnel<T> {
	
	void funnel(T from,PrimitiveSink into);

}
