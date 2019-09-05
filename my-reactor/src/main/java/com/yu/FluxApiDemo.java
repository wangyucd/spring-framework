package com.yu;

import org.springframework.core.task.SimpleAsyncTaskExecutor;
import reactor.core.publisher.Flux;

/**
 * {@link org.springframework.util.concurrent.ListenableFuture}
 */
public class FluxApiDemo {

	public static void main(String[] args) {
		Flux.generate(()->0, (v,sink)->{

			if(v==3){
				sink.complete();
			}else{
				sink.next("value="+v);
			}
			return v+1;
		}).subscribe(Utils::p);


	}
}
