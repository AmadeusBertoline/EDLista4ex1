package controller;

public class ThreadController {

	public void Thread() {

		for (int i = 0; i < 5; i++) {

			Thread thread = new Thread(() -> System.out.println("TID: " + Thread.currentThread().getId()));

			thread.start();

		}

	}

}
