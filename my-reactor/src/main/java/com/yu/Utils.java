package com.yu;

import com.sun.deploy.security.SecureStaticVersioning;

public class Utils {
	public static void p (Object a){
		System.out.printf("thread %s ===%s \n",Thread.currentThread().getName(),a);
	}
}
