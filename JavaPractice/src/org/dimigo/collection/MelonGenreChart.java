package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {
	public static void main(String[] args) {
		Map <String, List<Music>> map = new HashMap<>();
		
		List<Music> balad = new ArrayList<>();
		List<Music> dance = new ArrayList<>();
		
		balad.add(new Music("내 첫사랑", "베리굿"));
		balad.add(new Music("또 다시 사랑", "임창정"));
		balad.add(new Music("부산에 가면", "박진영"));
		
		dance.add(new Music("커피", "유재환, 김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		
		map.put("발라드", balad);
		map.put("댄스", dance);
		
		System.out.println("----- << 멜론 장르별 차트 >> -----");	
		printMap(map);
		System.out.println("----- << 발라드 3위곡 변경 >> -----");
		map.get("발라드").set(2, new Music("지우고 지워도", "차수경"));
		printMap(map);
		System.out.println("----- << 발라드 1위곡 삭제 >> -----");
		map.get("발라드").remove(0);
		printMap(map);
		System.out.println("----- << 전체 리스트 삭제 >> -----");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for (Map.Entry<String, List<Music>> entry : map.entrySet()) {
			System.out.println("["+entry.getKey()+"]");
			List<Music> tmplist = entry.getValue();
			
			for (int i=0; i<tmplist.size(); i++) {
				System.out.println((i+1)+". "+tmplist.get(i));
			}
		}
	}
}
