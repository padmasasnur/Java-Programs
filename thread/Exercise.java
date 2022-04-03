package com.onebill.thread;

public class Exercise extends Thread{
	int num;

	public Exercise(int num) {  //parameterised constructor
		this.num = num;
	}

    @Override
    public void run() {
    	while(num>0) {
    		if(num%2==0) {
    			System.out.println(num);
    			try {
    				Thread.sleep(1000);
    			}catch (InterruptedException e) {}
    		}
    		num--;
    		}
    	}
    public static void main(String[] args) {
		Exercise exercise = new Exercise(10);
		exercise.start(); 
		Exercise exercise2 = new Exercise(20);
		exercise2.start();
	}
    }

