package com.onebill.streammethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.onebill.streamapi.Employee;

public class MainTest {
	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee(1, "Ishrin", "BD", 100000),
				new Employee(2, "Ishwari", "Tester", 50000), new Employee(3, "manju", "HR", 30000),
				new Employee(4, "abhi", "Tester", 40000), new Employee(5, "adi", "BD", 200000));

		System.out.println("hiking the salary");
List<Long> collect = asList.stream().map(emp->emp.getSalary()+10000).collect(Collectors.toList());
List<Employee> collect1 = asList.stream().sorted().collect(Collectors.toList());
collect1.forEach(System.out::println);

List<Employee> collect2 = asList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
collect2.forEach(System.out::println);

System.out.println("====Grouping====");
Map<String,List<Employee>> collect11 = asList.stream().collect(Collectors.groupingBy(Employee::getDestination));

Set<String> keySet = collect11.keySet();
for(String key :keySet ) {
	System.out.println( key + ":" + collect11.get(key));
}
collect11.forEach((name,list) ->{
	System.out.println(name);
	list.forEach(System.out::println);
});



	}

}
