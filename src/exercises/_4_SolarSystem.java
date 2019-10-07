package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _3_SolarSystem {

	public static void main(String[] args) {
		List<Planet> planets = Arrays.asList(
				new Planet("Mercury", 57, 0.056, 0),
				new Planet("Venus", 108, 0.866, 0),
				new Planet("Jupiter", 779, 1321, 79),
				new Planet("Mars", 228, 0.151, 2),
				new Planet("Earth", 150, 1, 1),
				new Planet("Saturn", 1430, 763.59, 62)
				);
		

		// 1: Sort the planets by distance from the sun
				Collections.sort(planets, (p1, p2) -> p2.getDistanceFromTheSun() - p1.getDistanceFromTheSun());
				System.out.println(planets);

				// 2. Sort the planets in alphabetical order
				Collections.sort(planets, (p1, p2) -> p1.getName().compareTo(p2.getName()));
				System.out.println(planets);

				// 3. Sort planets from largest to smallest
				Collections.sort(planets,
						(p1, p2) -> p2.getVolume() < p1.getVolume() ? -1 : p2.getVolume() == p1.getVolume() ? 0 : 1);
				System.out.println(planets);

			}

		}