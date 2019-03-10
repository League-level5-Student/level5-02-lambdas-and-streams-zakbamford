package _02_Creating_Streams;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;
import java.util.stream.Stream;

public class CreatingStreams {
	public static void main(String[] args) {
		//1. Create a stream out of the following collections.
		String[] strArr = {"one", "two", "three", "four"};
		Stream<String> s1 = Arrays.stream(strArr);
		s1.forEach((s) -> {
			System.out.println(s);
		});
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		Stream<Integer> s2 = intList.stream();
		s2.forEach((i) -> {
			System.out.println(i);
		});
		
		Stack<Random> randStack = new Stack<Random>();
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		Stream<Random> s3 = randStack.stream();
		s3.forEach((r) -> {
			System.out.println(r);
		});
		
		ArrayDeque<Double> dQueue = new ArrayDeque<Double>();
		dQueue.push(0.0);
		dQueue.push(1.0);
		dQueue.push(2.0);
		dQueue.push(3.0);
		Stream<Double> s4 = dQueue.stream();
		s4.forEach((d) -> {
			System.out.println(d);
		});
	}
}
