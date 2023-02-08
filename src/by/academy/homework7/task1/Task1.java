package by.academy.homework7.task1;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {

        Map<Number, String> map = Stream.generate(() -> new Random().nextLong(101))
				.limit(100)
				.map(i -> i * Math.PI - 20)
				.filter(i -> i < 100)
				.sorted()
				.skip(3)
				.collect(Collectors.toMap(k -> k, v -> " Number: " + v, (o1, o2) -> o1));

		for (Map.Entry<Number, String> entry : map.entrySet()) {
			System.out.println(entry);
		}


    }

}
