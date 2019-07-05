package com.example;
import com.example.impl.DoitImplement;

public interface DoitInterface {
	public String process();
	
	public static final class Factory {
		private static volatile DoitInterface doitImpl = null;
		public static DoitInterface newInstance() {
			if (doitImpl == null) {
	            synchronized (DoitImplement.class) {
	                if (doitImpl == null) {
	                	doitImpl = new DoitImplement();
	                }
	            }
	        }
	        return doitImpl;
		}
	}
}
