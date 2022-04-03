package com.onebill.abstractclass;

public class OwnerMain {
	public static void main(String[] args) {
        PetAbstractClass pet = new BadriDogOveride(); //upcasting
		pet.sound();
		pet.food();
		pet.play();
	}

}
