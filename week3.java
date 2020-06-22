
import java.util.Random;
import java.text.DecimalFormat;
import java.util.Scanner;

public class week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1(a)
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int firstElement = ages[ages.length-ages.length];
		int lastElement = ages[ages.length - 1];
		System.out.println("-----Question 1-----");
		System.out.println(lastElement - firstElement); // answer 90
		System.out.println("\n------------------\n");
		
		
		//Question 1(b)
		Random rand = new Random();
		int newAges[] = new int[8];
		int i = 0;
		int upperLimit = 100;
		while (i < 8) {
			newAges[i] = rand.nextInt(upperLimit);
			i++;
		}
		int newFirst = newAges[newAges.length-newAges.length];
		int newLast = newAges[newAges.length-1];
		System.out.println("Random ages array:");
		System.out.println("First element of array: " + newAges[0]);
		System.out.println("Last element of array: " + newAges[newAges.length-1]);
		System.out.println(newFirst + " subtracted from " + newLast + " equals " + (newLast - newFirst));
		System.out.println("\n------------------\n");	
		
		//Question 1(c)
		int sum = 0;
		for(int age : ages) {
			sum += age; 
		}
		double averageAge = sum / ages.length;
		System.out.println(averageAge + " is the average age of the array.");
		
		//END QUESTION 1
		
		//Question 2(a)
		String[] firstNames = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int letterCount = 0; 
		for (String firstName : firstNames) {
			letterCount += firstName.length();
		}
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double arrayLength = firstNames.length;
		double averageLetter = letterCount / arrayLength; 
		System.out.println("\n\n-----Question 2-----\n");
		System.out.println("The average number of letters in the names array is " + df.format(averageLetter));
		System.out.println("\n------------------\n");
		
		//Question 2(b)
		String concatNames = ""; 
		for (String firstName : firstNames) {
			concatNames += firstName + " ";
		}	
		System.out.println(concatNames);
		System.out.println("\n------------------\n");
		
		
		//Question 3
		System.out.println("\n\n-----Question 3-----\n");	
		System.out.println("Accessing the last element of an array:");
		System.out.println("For firstNames Array you can access the last element by using .length on the array name.");
		System.out.println("WARNING - You must subtract '1' from the length total, otherwise it will cause an error.");
		System.out.println("Example: firstNames[firstNames.length - 1] = " + firstNames[firstNames.length - 1]);		
		
		
		//Question 4
		System.out.println("\n\n-----Question 4-----\n");	
		System.out.println("Accessing the first element of an array:");
		System.out.println("For firstNames Array you can access the first element by using zero index.");
		System.out.println("Example: firstNames[0] = " + firstNames[0]);
		
		
		//Question 5
		int namesLength[] = new int[firstNames.length];
		System.out.println("\n\n-----Question 5-----\n");	
		for (int j = 0; j <= firstNames.length - 1; j++) {
			namesLength[j] = firstNames[j].length();
			System.out.println("The number of characters in " + firstNames[j] + " is " + namesLength[j]);
		}
		
		
		//Question 6 
		int totalCharacters = 0;
		for (int nameLength : namesLength) {
			totalCharacters += nameLength; 
		}
		System.out.println("\n\n-----Question 6-----\n");
		System.out.println("The total number of characters in the array is " + totalCharacters);
	
		
		//Question 7 
		System.out.println("\n\n-----Question 7-----\n");		
		wordRepeat("Yay", 10);
		
		
		//Question 8 
		System.out.println("\n\n-----Question 8-----\n");
		String fullNameReturned = fullName("Jeffery", "Haupt");
		System.out.println(fullNameReturned);
		
		
		//Question 9 
		System.out.println("\n\n-----Question 9-----\n");
		Random rand2 = new Random();
		int randomArray[] = new int[8];
		int t = 0;
		int upperLimit2 = 25;
		while (t < 8) {
			randomArray[t] = rand2.nextInt(upperLimit2);
			t++;
		}
		System.out.print("Therefore, the condition that the sum is > 100 is: " + intArray100(randomArray));
		
		
		//Question 10 
		System.out.println("\n\n-----Question 10-----\n");	
		Random rand3 = new Random();
		double doubleArray[] = new double[10];
		int s = 0;
		while (s < 10) {
			doubleArray[s] = (rand3.nextDouble() * 10);
			s++;
		}
		System.out.println(df.format(doubleArrayAvg(doubleArray)));
	
		
		//Question 11 
		System.out.println("\n\n-----Question 11-----\n");		
		double doubleArray1[] = new double[10];
		double doubleArray2[] = new double[10];
		int b = 0;
		while (b < 10) {
			doubleArray1[b] = (rand3.nextDouble() * 10);
			doubleArray2[b] = (rand3.nextDouble() * 10);			
			b++;
		}
		System.out.println("True or False, the 1st array avg is larger than the 2nd array avg: " + doubleGreater(doubleArray1, doubleArray2));
		
		
		//Question 12 
		System.out.println("\n\n-----Question 12-----\n");	
		boolean hotOrNot = true; 
		double money = 11.25;
		System.out.println("I will by a drink (True or False): " + willBuyDrink(hotOrNot, money));
	
	
		//Question 13 - Ask for age and checks to see what options a person has in life (just simple and fun)
		System.out.println("\n\n-----Question 13-----\n");			
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Please enter your numeric age (1 - 100) to see what you are allowed to do in life: ");
		int myAge = myObj.nextInt();
		oldEnough(myAge);
	} // END OF MAIN
	
	// Methods -----------------------------------------------------
	
	//Question 7 - Method 
	static void wordRepeat(String word, int n) {
		int k = 0;
		String newWord = "";
		while (k < n) {
			newWord += word;
			k++;
		}
		System.out.println(newWord);
	} // End Method Question 7 
	
	
	//Question 8 - Method
	static String fullName(String firstN, String lastN) {
		String fullN; 
		fullN = firstN + " " + lastN;
		return fullN;
	} // End Method Question 8 
	
	
	//Question 9 - Method
	static boolean intArray100(int[] numbers1) {
		int sumOfAll = 0;
		for (int num2 : numbers1) {
			sumOfAll += num2;
		}
		System.out.println("The sum of all the numbers in the array is: " + sumOfAll);
		if (sumOfAll > 100) {
			return true;
		} else {
			return false;
		}
		
	} // End Method Question 9 
	
	
	//Question 10 - Method 
	static double doubleArrayAvg(double[] decimalNums) {
		double sumOfDoubles = 0.00;
		for (double dec : decimalNums) {
			sumOfDoubles += dec;
		}
		return sumOfDoubles / decimalNums.length;
	} // End Method Question 10 
	
	
	//Question 11 - Method
	static boolean doubleGreater(double[] doub1, double[] doub2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double d1 : doub1) {
			sum1 += d1;
		}
		for (double d2 : doub2) {
			sum2 += d2;
		}
		if ((sum1/doub1.length) > (sum2/doub2.length)) {
			return true;
		} else {
			return false;
		}
	} // End Method Question 11
	
	
	//Question 12 - Method 
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && (moneyInPocket > 10.50)) {
			return true;
		} else {
			return false;
		}
	} // End Method Question 12 
	
	
	//Question 13 - Method 
	static void oldEnough(int ageCheck) {
		if (ageCheck < 13) {
			System.out.println("You aren't old enough to even use internet apps!");
		} else if (ageCheck >=13 && ageCheck < 16) {
			System.out.println("Cool, you can download Snapchat...if you're parents will let you");
		} else if (ageCheck >-16 && ageCheck < 18) {
			System.out.println("So you can drive now, huh?  Good luck convincing your parents to let you use the car.");
		} else {
			System.out.println("Congratulations! You are an adult...don't you miss being under 18?");
		}
	} // End Method Question 13
	

} // END OF WEEK3 CLASS
