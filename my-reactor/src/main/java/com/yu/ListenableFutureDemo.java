package com.yu;

import org.springframework.core.task.SimpleAsyncTaskExecutor;
import reactor.core.publisher.Flux;

/**
 * {@link org.springframework.util.concurrent.ListenableFuture}
 */
public class ListenableFutureDemo {

	public static void main(String[] args) {
		SimpleAsyncTaskExecutor simpleAsyncTaskExecutor=new SimpleAsyncTaskExecutor("ListenableFutureDemo");

		Flux<Integer> flux = Flux.just(1,2,3);
		//flux.subscribe(a-> System.out.println(a));

		Flux.just(1,2,3).map(a->
		{
			if (a==4){
				throw new RuntimeException("a==2");
			}
			return a+1;
		}).subscribe(Utils::p,Utils::p,()-> Utils.p("over"+Thread.currentThread().getName()));
	}
}
