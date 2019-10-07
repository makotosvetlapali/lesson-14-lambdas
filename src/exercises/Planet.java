package exercises;

public class Planet {

	private String name;
	private double volume; 
	private int satelitess;
	private int distanceFromTheSun; 


	public Planet(String name, int distanceFromSun, double volume, int satellites) {
		super();
		this.name = name;
		this.volume = volume;
		this.satelitess = satellites;
		this.distanceFromTheSun = distanceFromTheSun;

	}

	public int getDistanceFromTheSun() {
		return distanceFromTheSun;
	}

	public String getName() {
		return name;
	}

	public double getVolume() {
		return volume;
	}

	public String toString() {
		return "\n" + this.name + " - " + distanceFromTheSun + " millions of kilometers away from the Sun; " + volume + " volume";
	}

}