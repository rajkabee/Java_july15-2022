package com.sachistha.javaSE.inheritance.Q5;

import java.util.Date;

public class App {
	public static void main(String[] args) {
		Team team1 = new Team();
		team1.addMember(new Competitor("John", "Doe", new Date(), "Male", "Football"));
		team1.addMember(new Competitor("John", "Doe", new Date(), "Male", "Football"));
		team1.addMember(new Competitor("John", "Doe", new Date(), "Male", "Football"));
		team1.addMember(new Competitor("John", "Doe", new Date(), "Male", "Football"));
		team1.addMember(new Competitor("John", "Doe", new Date(), "Male", "Football"));
		team1.addMember(new Competitor("John", "Doe", new Date(), "Male", "Football"));
		team1.addMember(new Official("John", "Doe", new Date(), "Male", "Coach", true));
		team1.addMember(new Official("John", "Doe", new Date(), "Male", "Coach", true));
	}
}
