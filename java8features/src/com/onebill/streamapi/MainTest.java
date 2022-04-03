package com.onebill.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTest {
	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee(1, "Ishrin", "BD", 100000),
				new Employee(2, "Ishwari", "Tester", 50000), new Employee(3, "manju", "HR", 30000),
				new Employee(4, "abhi", "Tester", 40000), new Employee(5, "adi", "BD", 200000));

		System.out.println("====streamapi o/p by stream method break down====");

		Stream<Employee> stream = asList.stream();
		Comparator<Employee> com = (o1, o2) -> {
			return (int) (o1.getSalary() - o2.getSalary());
		};
		Optional<Employee> max2 = stream.max(com);
		System.out.println(max2);

		System.out.println("====streamapi o/p by stream method====");
		asList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::print);

		System.out.println("== breakdown any match breakdown==");
		Stream<Employee> stream2 = asList.stream();
		Predicate<Employee> p = (emp) -> {
			return emp.getName() == "Pratheeba";
		};

		boolean anyMatch2 = stream2.anyMatch(p);
		System.out.println(anyMatch2);

		System.out.println("==any match==");
		boolean anyMatch = asList.stream().anyMatch(emp -> emp.getName() == "Pratheeba");
		System.out.println(anyMatch);
		
		System.out.println("break down of == for each and filter ==");
		List<Employee> collect = asList.stream().filter(emp -> emp.getSalary() > 1000).collect(Collectors.toList());
				Consumer<Employee> c = (emp) -> {
					System.out.println(emp);
				};
        collect.forEach(c);
        
		Stream<Employee> stream3 = asList.stream();
		Predicate<Employee> filter = (emp) -> {
			return emp.getId() > 3;
		};

		System.out.println("== for each and filter==");
		
		asList.stream().filter(emp -> emp.getSalary() > 1000).collect(Collectors.toList()).forEach(System.out::println);

	}

}
