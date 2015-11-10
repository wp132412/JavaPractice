package org.dimigo.thread;

public class Runner2 implements Runnable {
	private String name;
	
	public Runner2() {
		// TODO Auto-generated constructor stub
	}

	public Runner2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		int meter = 0;

		System.out.println(name + " 출발");

		for (int i = 10; i >= 0; i--) {
			meter = i * 10;
			System.out.println(name + " " + meter + " 미터");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(name + " 골인");
	}
}
