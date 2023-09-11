package com.sachistha.javaSE.inheritance.Q5;

import java.util.ArrayList;
import java.util.List;

public class Team {
	String teamName;
	List<Member> members=new ArrayList<>();
	public  void addMember(Member member) {
		members.add(member);
	}
	public void removeMember(Member member) {
		if(members.indexOf(member)>0) {
			members.remove(members.indexOf(member));
		}
	}
}
