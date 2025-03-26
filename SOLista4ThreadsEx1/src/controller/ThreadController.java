package controller;

public class ThreadController extends Thread {

	public ThreadController() {
		super();
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getId());
	}

}
