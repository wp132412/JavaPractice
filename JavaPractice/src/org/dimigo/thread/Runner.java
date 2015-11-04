package org.dimigo.thread;

public class Runner extends Thread {
	public Runner() {
		// TODO Auto-generated constructor stub
	}

	public Runner(String name) {
		super(name);
	}

	@Override
	public void run() {
		int meter = 0;

		System.out.println(getName() + " 출발");

		for (int i = 10; i >= 0; i--) {
			meter = i * 10;
			System.out.println(getName() + " " + meter + " 미터");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(getName() + " 골인");
	}
}
