package com.rest.pojos;

import java.util.List;

public class Team {
	
	private String Teamname;
	private List<Player> batter;
	private List<Player> bowlers;
	
	public List<Player> getBowlers() {
		return bowlers;
	}
	public void setBowlers(List<Player> bowlers) {
		this.bowlers = bowlers;
	}
	public String getTeamname() {
		return Teamname;
	}
	public void setTeamname(String teamname) {
		Teamname = teamname;
	}
	
	public List<Player> getBatter() {
		return batter;
	}
	
	public void setBatter(List<Player> batter) {
		this.batter = batter;
	}
	@Override
	public String toString() {
		return "Team [Teamname=" + Teamname + ", batter=" + batter + ", bowlers=" + bowlers +  "]";
	}

	
}
