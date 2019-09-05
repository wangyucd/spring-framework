package com.refactor;

import java.util.List;

public class MyClass {

	public <T,R> void xx(IMyOtherClass my){

	}
}


class MyOtherClass<X extends List> implements IMyOtherClass {

	private MyOtherClass() {
	}

	static <X extends List> MyOtherClass<X> createMyOtherClass() {
		return new MyOtherClass<X>();
	}
}