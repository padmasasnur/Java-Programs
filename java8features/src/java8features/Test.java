package java8features;

public interface Test {
	default void message() {
		System.out.println("Hello");
	}

}
