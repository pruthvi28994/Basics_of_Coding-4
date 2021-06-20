package com.adapt.capgemini;

abstract class Player {
	String firstName;
	String lastName;

	Player(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getName() {
		return this.firstName + " " + this.lastName;
	}

	public abstract int getRating();

	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}

class CricketPlayer extends Player {
	double averageRuns;

	CricketPlayer(String firstName, String lastName, double averageRuns) {
		super(firstName, lastName);
		this.averageRuns = averageRuns;
	}

	public int getRating() {
		if (averageRuns > 55)
			return 7;
		else if (averageRuns > 50)
			return 6;
		else if (averageRuns > 40)
			return 5;
		else if (averageRuns > 30)
			return 3;
		else if (averageRuns > 20)
			return 2;
		else if (averageRuns <= 20)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "CricketPlayer [Player Name:" + getName() + ", averageRuns=" + averageRuns + ", getRating()="
				+ getRating() + "]";
	}

}

class FootballPlayer extends Player {
	int goals;

	FootballPlayer(String firstName, String lastName, int goals) {
		super(firstName, lastName);
		this.goals = goals;
	}

	public int getRating() {
		if (goals > 20)
			return 5;
		else if (goals > 15)
			return 4;
		else if (goals > 10)
			return 3;
		else if (goals > 5)
			return 2;
		else if (goals <= 5)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "FootballPlayer [Player Name:" + getName() + ",Number of goals=" + goals + "]";
	}
}

public class java_playerRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootballPlayer fb = new FootballPlayer("Pruthvi", "Sagar S", 25);
		System.out.println(fb);
		CricketPlayer c = new CricketPlayer("Jayanth", "Sanke", 45);
		System.out.println(c);
	}

}
