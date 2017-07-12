package Smurf;


public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if (name.equals("Papa")) {
			return ("My hat is red.");
		} else {
			return ("My hat is white.");
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if (name.equals("Smurfette")) {
			return ("I am female.");
		} else {
			return ("I am male.");
		}
	}
}
