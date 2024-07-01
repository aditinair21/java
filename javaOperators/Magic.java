public class Magic {
	public static void main(String[] args) {
    
    // referred to as original number
    int myNumber = 34;

    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo/myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive/6;

    // prints out number 3
    System.out.println(stepSix);
		

	}
}
