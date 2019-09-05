package com.yu;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FluxAsyncDemo {

	public static void main(String[] args) {
	//	Flux.range(0, 20).publishOn(Schedulers.immediate()).subscribe(Utils::p);

		Flux.range(0, 20).publishOn(Schedulers.single()).subscribe(Utils::p);
		try {
			TimeUnit.SECONDS.sleep(3);
			Thread.currentThread().join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
