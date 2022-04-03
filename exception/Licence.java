package com.onebill.exception;
//custom and runtime exception
public class Licence {
	public int age;

	public int getAge() {
		return age;
	}

	public void generate(int age) {
		if( age>18 ) {
			System.out.println("generate licence");
		}else {
			try {
				throw new LicenceGenerateException("Not able to generate a licence");
			}
				catch(LicenceGenerateException e) {
					System.out.println(e.getMsg());
					
				}
			}
	
	}

}

