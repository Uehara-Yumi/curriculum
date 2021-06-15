package check;

import constants.Constants;

public class Check {

	private static String firstName = "上原";
	private static String lastName = "優海";

	private static void printName(String firstName, String lastName){
		System.out.println("printNameメソッド → " + firstName + lastName);
	}


	public static void main(String[] args) {
		printName(firstName, lastName);

		Pet pet = new Pet(Constants.CHECK_CLASS_HOGE, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robopet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robopet.introduce();
	}
}
