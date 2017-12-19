import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

import methods.Game;
import methods.MountainBike;
import methods.methodArgument;

// Luis Mendez
// Discription of program at the moment is to show the knowledge ive gained
public class Main {

	public static void main(String[] args) {
		System.out.println("\nHello World! " + "Welcome to my project :)");

		// Variable = A container that holds values that are used in a Java program.
		int myAge = 23; // The variable "myAge" is declared to be an int data type
										// and initialized to a value of 21.F
		System.out.println("\nMy age is = " + myAge);

		boolean bln = true; // booleans can only be 'true' or 'false'
		byte by = 0x20; // using hexadecimal notation
		short s = 500; // small integer
		char ch = 'A'; // must use single quotes to denote characters
		char tab = '\t'; // other specials: \n, \r, \f, \b, \\, \', \"
		int in = 1000000; // decimal notation
		int j = 0x3FA0B3; // hexadecimal notation
		int k = 0777; // octal notation
		float f = 1.5f; // trailing 'f' distinguishes from double
		long l = 2000000L; // trailing 'L' distinguishes from int
		double pi = 3.141592653589793; // doubles are higher precision
		double large = 1.3e100; // using the exponent notation

		System.out.println("boolean = " + bln);
		System.out.println("byte = " + by);
		System.out.println("short = " + s);
		System.out.println("char = " + ch);
		System.out.println("char tab = " + tab);
		System.out.println("int decimal notation = " + in);
		System.out.println("int hecadecimal notation  = " + j);
		System.out.println("int octal notation = " + k);
		System.out.println("float = " + f);
		System.out.println("long = " + l);
		System.out.println("double = " + pi);
		System.out.println("double using exponant notation = " + large);

		// arithmetic using integers
		System.out.println("\nInteger Arithmetic");
		int i = 1 + 1;
		int n = i * 3;
		int m = n / 4;
		int p = m - i;
		int q = -p;
		System.out.println("i = " + i);
		System.out.println("n = " + n);
		System.out.println("m = " + m);
		System.out.println("p = " + p);
		System.out.println("q = " + q);
		// arithmetic using doubles
		System.out.println("\nFloating Point Arithmetic");
		double a = 1 + 1;
		double b = a * 3;
		double c = b / 4;
		double d = c - a;
		double e = -d;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);

		int num1 = 16; // Assigning number to variable
		int num2 = 3;
		int answer = num1 + num2; // Addition to assigned variable
		System.out.println("\nAddition total = " + answer);
		// Integer division
		// Integer division is division in which the fractional part(remainder) is
		// discarded is called integer division and is sometimes denoted
		int result;
		int rem;
		result = num1 / (num2 * 2); // Integer equation
		rem = num1 % (num2 * 2); // Modulo remainder
		System.out.println("Integer division = " + result);
		System.out.println("Remainder is = " + rem);

		//
		// Method Call and Argument
		Scanner input = new Scanner(System.in);
		// allows is to use scanner
		methodArgument methodArgumentObject = new methodArgument();

		System.out.println("\nEnter your name here = ");
		String name = input.nextLine();
		// to type in any name
		// input string use the next line method

		methodArgumentObject.simpleMessage(name);

		// refer to person
		person person1 = new person();

		person1.name1 = "Luis";
		person1.age1 = 23;

		// person1.speak();

		int years = person1.calculateYearsToRetirement();

		System.out.println("\nYears till retirements " + years);

		int age1 = person1.getAge();
		String name1 = person1.getName();

		System.out.println("Name is: " + name1);
		System.out.println("Age is: " + age1);

		// if else statement
		int mistake = 1;

		// removing characters that make program crash
		try {
			System.out.println("\nEnter test score = ");
			int testscore = input.nextInt();
			char grade;

			if (testscore >= 90) {
				grade = 'A';
			} else if (testscore >= 80) {
				grade = 'B';
			} else if (testscore >= 70) {
				grade = 'C';
			} else if (testscore >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println("Grade = " + grade);
		} catch (Exception E) {
			System.out.println("Invalid Entry");
		}

		// relation operator
		int a1 = 10;
		int b1 = 20;

		System.out.println("\nRelation Operator");
		System.out.println("a == b = " + (a1 == b1));
		System.out.println("a != b = " + (a1 != b1));
		System.out.println("a > b = " + (a1 > b1));
		System.out.println("a < b = " + (a1 < b1));
		System.out.println("b >= a = " + (b1 >= a1));
		System.out.println("b <= a = " + (b1 <= a1));

		// The switch statement
		System.out.println("\nSwitch Statement");
		System.out.println("Are you male or female? = ");
		String gender = input.nextLine();

		switch (gender) {
		case "male":
			System.out.println("You are a BOY!");
			break;
		case "female":
			System.out.println("You are a GIRL!");
			break;
		default:
			System.out.println("Gender not recognized");
		}

		// conditional operator
		// && Conditional-AND
		// || Conditional-OR
		// These operators exhibit "short-circuiting" behavior, which means that the
		// second operand is evaluated only if needed.
		System.out.println("\nConditional operator && ||");
		int value1 = 1;
		int value2 = 2;
		if ((value1 == 1) && (value2 == 2))
			System.out.println("value1 is 1 AND value2 is 2");
		if ((value1 == 1) || (value2 == 1))
			System.out.println("value1 is 1 OR value2 is 1");

		// while loop
		System.out.println("\nWhile loop");
		int counter = 0;

		while (counter < 10) {
			System.out.println(counter);
			counter++;
		}

		// for loop
		System.out.println("\nFor loop");
		for (int counter1 = 1; counter1 <= 10; counter1++) {
			System.out.println(counter1);
		}

		// array of 10 numbers
		int numbers[] = new int[] { 32, 43, 53, 54, 32, 65, 63, 98, 43, 23 };

		// assign first element of an array to largest and smallest
		int smallest = numbers[0];
		int largetst = numbers[0];

		for (int i2 = 1; i2 < numbers.length; i2++) {
			if (numbers[i2] > largetst)
				largetst = numbers[i2];
			else if (numbers[i2] < smallest)
				smallest = numbers[i2];

		}
		System.out.println("\nArray ");
		System.out.println("Array list = 32, 43, 53, 54, 32, 65, 63, 98, 43, 23");
		System.out.println("Largest Number is = " + largetst);
		System.out.println("Smallest Number is = " + smallest);

		// Sum of array
		int sum = 0;
		for (int counter2 = 0; counter2 < numbers.length; counter2++) {
			sum += numbers[counter2];
		}
		System.out.println("Sum of the numer is = " + sum);

		// identifying array locations
		System.out.println("Element at index 0: " + numbers[0]);
		System.out.println("Element at index 1: " + numbers[1]);
		System.out.println("Element at index 2: " + numbers[2]);
		System.out.println("Element at index 3: " + numbers[3]);
		System.out.println("Element at index 4: " + numbers[4]);
		System.out.println("Element at index 5: " + numbers[5]);
		System.out.println("Element at index 6: " + numbers[6]);
		System.out.println("Element at index 7: " + numbers[7]);
		System.out.println("Element at index 8: " + numbers[8]);
		System.out.println("Element at index 9: " + numbers[9]);

		// hashmap
		System.out.println("\nHashMap");
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");

		String text = map.get(6);

		System.out.println(text);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + "= " + value);
		}

		// string processing
		int myInt = 7;
		String text1 = "Hello";
		String blank = " ";
		String name11 = "Bob";

		String greeting = text1 + blank + name11;

		System.out.println("\nString processing");
		System.out.println(greeting);
		System.out.println("Hello" + " " + "Bob");
		System.out.println("My integer is: " + myInt);

		double myDouble = 7.8;

		System.out.println("My number is: " + myDouble + ".");

		// 2D array tic tac toe
		char player = 'o';
		int row, column;
		Scanner k1 = new Scanner(System.in);
		Game g = new Game();

		g.initializeGame();
		System.out.println("\n2D array Tic-Tac-Toe !");
		System.out.println("Game ready !");

		try {
			while (true) {
				player = g.changePlayer(player);
				System.out
						.print("\n" + player + " ,choose your location (row, column):");
				row = k1.nextInt();
				column = k1.nextInt();

				while (g.checkIfLegal(row, column)) {
					System.out.println(
							"That slot is already taken or out of bounds, please try again (row, column).");
					g.displayBoard();
					row = k1.nextInt();
					column = k1.nextInt();
				}
				g.changeBoard(player, row, column);
				g.displayBoard();

				if (g.checkIfWinner()) {
					System.out.println("\nThe winner is " + player + " !");
					break;

				}
				if (g.checkIfTie()) {
					System.out.println("\nThe game is a tie !");
					break;
				}
			}
		} catch (Exception e1) {
			System.out.println("Invalid Entry");
		}

		// inheritance = an important pillar of OOP(Object Oriented Programming). It
		// is the mechanism in java by which one class is allow to inherit the
		// features(fields and methods) of another class.
		System.out.println("\nInheritance for MountainBike");
		MountainBike mb = new MountainBike(3, 100, 25);
		System.out.println(mb.toString());

		// polymorphism = describes a language’s ability to process objects of
		// various types and classes through a single, uniform interface.
		System.out.println("\nPolymprphism for MotorBike");
		Vehicle vh = new MotorBike();

		vh.move(); // prints MotorBike can move and accelerate too!!
		vh = new Vehicle();
		vh.move(); // prints Vehicles can move!!

		// Queue a collection for holding elements prior to processing
		Queue<Integer> q1 = new LinkedList<>();

		// Adds elements {0, 1, 2, 3, 4} to queue
		for (int i1 = 0; i1 < 5; i1++)
			q1.add(i1);

		// Display contents of the queue.
		System.out.println("\nQueue");
		System.out.println("Elements of queue = " + q1);

		// To remove the head of queue.
		int removedele = q1.remove();
		System.out.println("removed element = " + removedele);

		System.out.println(q1);

		// To view the head of queue
		int head = q1.peek();
		System.out.println("head of queue = " + head);

		// Rest all methods of collection interface,
		// Like size and contains can be used with this
		// implementation.
		int size = q1.size();
		System.out.println("Size of queue = " + size);

		// Stack = is a subclass of Vector that implements a standard last-in,
		// first-out stack
		System.out.println("\nStack");
		Stack<String> stack = new Stack<>();
		stack.push("fly");
		stack.push("worm");
		stack.push("butterfly");

		// Peek at the top of the stack.
		String peekResult = stack.peek();
		System.out.println("Peek result = " + peekResult);

		// Pop the stack and display the result.
		String popResult = stack.pop();
		System.out.println("Pop result = " + popResult);

		// Pop again.
		popResult = stack.pop();
		System.out.println("Pop result = " + popResult);

	}

}
