package com.algorithms.misc;

/**
 * 
 * @author Judas
 * 
 *         Method to print odd and even
 *
 */
public class ConsumerProducer {

	public static void main(String[] args) {

		final SharedResouce shared = new SharedResouce();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					shared.printEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					shared.printOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}

	static class SharedResouce {
		int MAX = 50;
		int i = 0;

		void printEven() throws InterruptedException {
			while (true) {
				synchronized (this) {
					if (i % 2 == 0) {
						System.out.println("Printing Even " + i);
						i++;
						Thread.sleep(1000);
					} else
						this.wait();
				}
			}
		}

		void printOdd() throws InterruptedException {
			while (true) {
				synchronized (this) {
					if (i % 2 != 0) {
						System.out.println("Printing odd " + i);
						i++;
						Thread.sleep(1000);
					} else
						this.notifyAll();
				}
			}

		}
	}
}
