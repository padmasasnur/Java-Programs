package com.onebill.abstractclass;

public class BadriDogOveride extends PetAbstractClass {
	@Override
	public void sound() {
		System.out.println("Bow Bow");
	}
	@Override
	public void food() {
		System.out.println("eats rice");
	}
	@Override
    public void play() {
		System.out.println("Fight with others");
	}
	


}
