package com.rest.serialize.deserialize;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.pojos.Player;
import com.rest.pojos.Team;

public class TestSerialize {
	
	public Team createTeam() {
		
		Player player1 = new Player();
		player1.setPlayerName("Hemant Tumbare");
		
		Player player2 = new Player();
		player2.setPlayerName("Sanket Patil");
		
		Player player3 = new Player();
		player3.setPlayerName("Prasad Chaure");
		
		
		List<Player> batter = new ArrayList<>();
		batter.add(player1);
		batter.add(player2);
		batter.add(player3);
		
		List<Player> bowler = new ArrayList<>();
		bowler.add(player1);
		bowler.add(player2);
		bowler.add(player3);
		
		Team myTeam = new Team();
		myTeam.setBatter(batter);
		myTeam.setBowlers(bowler);
		myTeam.setTeamname("Maharastra Worriors");
		return myTeam;
	}
	
	@Test
	public void serialization() {
		
		TestSerialize test = new TestSerialize();
		Team team = test.createTeam();
		
		ObjectMapper objMapper = new ObjectMapper();
		try {
			System.out.println("Output : "+objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(team));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void deSerialization() {
		
		TestSerialize test = new TestSerialize();
		Team team = test.createTeam();
		
		ObjectMapper objMapper = new ObjectMapper();
		try {
			String str = "{\r\n"
					+ "	\"batter\": [{\r\n"
					+ "		\"playerName\": \"Hemant Tumbare\"\r\n"
					+ "	}, {\r\n"
					+ "		\"playerName\": \"Sanket Patil\"\r\n"
					+ "	}, {\r\n"
					+ "		\"playerName\": \"Prasad Chaure\"\r\n"
					+ "	}],\r\n"
					+ "	\"bowlers\": [{\r\n"
					+ "		\"playerName\": \"Hemant Tumbare\"\r\n"
					+ "	}, {\r\n"
					+ "		\"playerName\": \"Sanket Patil\"\r\n"
					+ "	}, {\r\n"
					+ "		\"playerName\": \"Prasad Chaure\"\r\n"
					+ "	}],\r\n"
					+ "	\"teamname\": \"Maharastra Worriors\"\r\n"
					+ "}"	;
			Team team1 = objMapper.readValue(str, Team.class);
			System.out.println(team1.toString());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
