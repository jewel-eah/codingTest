	package programmers;

import java.util.LinkedHashMap;
import java.util.Map;

public class p_02_추억점수 {

	class Solution {
		public int[] solution(String[] name, int[] yearning, String[][] photo) {
			int[] answer = new int[photo.length];
			// ["may", "kein", "kain"]
			// 그리움 점수가 [5점, 10점, 1점] >> 추억점수 : 16(5+10+1)
			// ["kali", "mari", "don", "tony"]
			// [11점, 1점, 55점 0점 ]] >> 추억점수 : 67(11+1+55)

			// 그리워하는 사람의 이름을 담은 문자열 배열 name
			// 각 사람별 그리움 점수를 담은 정수 배열 yearning
			// 각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo가 매개변수로 주어질 때
			// 사진들의 추억 점수를 photo에 주어진 순서대로 배열에 담아 return하는 solution 함수를 완성해주세요.

			Map<String, Integer> map = new LinkedHashMap<>();
			for (int i = 0; i < name.length; i++) {
				String names = name[i];
				int scores = yearning[i];
				
				map.put(names, scores);
			}
			
			for(int i=0; i<photo.length; i++) {
				for(String pick : photo[i]) {
					answer[i] += map.getOrDefault(pick, 0);
				}
			}
			
			return answer;
		}
	}

}
