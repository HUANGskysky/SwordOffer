package com.nowcoder.offer.problem2;

/**
 * Problem2
 * 静态内部类实现的线程安全的单例
 * @author hztaoran
 *
 */
public class Singleton {
	
	private Singleton() {
		
	}
	
	private static class SingletonHolder {
		private static final Singleton unqiqueInstance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.unqiqueInstance;
	}
	
}
