package com.onebill.runnable;

public class MainTest {
public static void main(String[] args) {
	MyThread myThread = new MyThread();
	Thread thread = new Thread(myThread);
	thread.start();
}
}
