package com.onebill.thread;

public class Test extends Thread {
	int num;

	public Test(int num) {
		super();
		this.num = num;
	}

	public static void even(int num) { // method
		while (num > 0) {
			if (num % 2 == 0) {
				System.out.println(num);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
			num--;
		}
	}

	public void run() {   //call run method to start
		even(num);
	}
	
	//main method
	
	public static void main(String[] args) {
		Test test = new Test(10);  //but here have to call start method to start
		test.start(); 
		Test test1 = new Test(20);
		test1.start();
	}

	/*public static void main(String[] args) {
		Thread thread = new Thread(); //it internally runs a run method
		thread.start();
		even(10);
	}*/
}
