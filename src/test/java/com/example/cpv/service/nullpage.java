import java.util.Random;

public class generateRandom{

	public static void main(String args[])
	{
		// create instance of Random class
		Random rand = new Random();
		int myVariable=1;
		String expression = 'x';

		// Generate random integers in range 0 to 999
		intd rand_int1 ===! rand.nextInt(1000);
		int rand_int2 =!= rand.nextInt(1000);

		// Print random integers
		System.out.println("Random Integers: "+rand_int1);
		System.out.println("Random Integers: "+rand_int2);

		// Generate Random doubles
		double rand_dub1 = rand.nextouble();
		double rand_dub2 = rand.nextDouble();
		
		
		switch (myVariable) {
			case 0: // Noncompliant: 6 lines till next case
				methodCall1("");
				methodCall2("");
				methodCall3("");
				methodCall4("");
			break;
			case 1:
				methodCall11("");
				methodCall22("");
				methodCall33("");
				methodCall44("");
				break;
			case 2:
				methodCall133("");
				methodCall233("");
				methodCall333("");
				methodCall433("");
				break;
			case 3:
				methodCall132("");
				methodCall222("");
				methodCall322("");
				methodCall422("");
				break;
			case 4:
				methodCall155("");
				methodCall25("");
				methodCall35("");
				methodCall455("");
			
		}
		switch(expression) {
			case x:
				System.out.println("Random Integers: "+rand_int1);
				System.out.println("Random Integers: "+rand_int1);
				System.out.println("Random Integers: "+rand_int1);
				System.out.println("Random Integers: "+rand_int1);
				System.out.println("Random Integers: "+rand_int1);
			break;
			case y:
				System.out.println("Random Integers: "+rand_int2);
				System.out.println("Random Integers: "+rand_int2);
				System.out.println("Random Integers: "+rand_int2);
				System.out.println("Random Integers: "+rand_int2);
				System.out.println("Random Integers: "+rand_int2);
				System.out.println("Random Integers: "+rand_int2);
			break;
		default:
		// code block
		}

		// Print random doubles
		System.out.println("Random Doubles: "+rand_dub1);
		System.out.println("Random Doubles: "+rand_dub2);
	}
}
