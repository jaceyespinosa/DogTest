/**
 * Jacey Espinosa - jlespinosa
 * CIS175 - Fall 2023
 * 09/06/2023
 */

package model;

public class DogLogic {
	
	public boolean isRetriever(Dog dog) {
		if (dog.getBreed().equalsIgnoreCase("Golden Retriever") || dog.getBreed().equalsIgnoreCase("Retriever")) {
			return true;
		} else {
			return false;
		}
	}
	
	public int calcDogYears(Dog dog) {	
		return dog.getAge() * 7;
	}
	
	public boolean shortName(Dog dog) {
		char[] ch = dog.getName().toCharArray();
		
		if (ch.length < 10) {
			return true;	
		} else {
			return false;
		}
	}
}
