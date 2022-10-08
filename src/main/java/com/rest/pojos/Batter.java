package com.rest.pojos;

import java.util.List;

public class Batter {
	
	private List<Player> batterList;
	
	public List<Player> getPlayers() {
		return batterList;
	}

	public void setPlayers(List<Player> players) {
		this.batterList = players;
	}

	@Override
	public String toString() {
		return "Batter [batterList=" + batterList + ", getPlayers()=" + getPlayers() + "]";
	}

	
}
