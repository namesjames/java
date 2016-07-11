public class Magic {
	public static void main(String[] args) {

		int myNumber = 10;
		int stepOne = myNumber * myNumber;
		int stepTwo = stepOne + myNumber;
		int stepThree = stepTwo / myNumber;
		int stepFour = stepThree + 17;
		int stepFive = stepFour - myNumber;
		int stepSix = stepFive / 6;
	}
}
// This number will be printed to the console no matter what integer you choose as the original number! magic!
System.out.println(stepSix);
