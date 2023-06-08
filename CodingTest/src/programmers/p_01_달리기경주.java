package programmers;

import java.util.HashMap;
import java.util.Map;

//_01_달리기경주 

class Solution {
	public String[] solution(String[] players, String[] callings) {
		
		// <선수명, 등수>
		// 변하는 랭크를 저장할 수 있는 map 
		Map<String, Integer> rank = new HashMap<>();
		
		// 맵에 기존 플레이어 넣기 
		for(int i=0; i<players.length; i++) {
			rank.put(players[i], i);
		}
		
		for(String player : callings) {
			// 현재 랭크 
			int nowRank = rank.get(player);
			// 앞지른 선수 
			String ratePlayer = players[nowRank-1];
			
			players[nowRank-1] = player;
			players[nowRank] = ratePlayer;
			
			//랭크갱신 
			rank.put(player, nowRank-1);
			rank.put(ratePlayer, nowRank);
			
		}
	

		return players;
	}
}
