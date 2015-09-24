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
		
		System.out.println("-----\20\3C\3C\20\uBA5C\uB860\20\uC7A5\uB974\uBCC4\20\uCC28\uD2B8\20\3E\3E\20-----");	
		printMap(map);
		System.out.println("-----\20\3C\3C\20\uBC1C\uB77C\uB4DC\203\uC704\uACE1\20\uBCC0\uACBD\20\3E\3E\20-----");
		map.get("발라드").set(2, new Music("지우고 지워도", "차수경"));
		printMap(map);
		System.out.println("-----\20\3C\3C\20\uBC1C\uB77C\uB4DC\201\uC704\uACE1\20\uC0AD\uC81C\20\3E\3E\20-----");
		map.get("발라드").remove(0);
		printMap(map);
		System.out.println("-----\20\3C\3C\20\uC804\uCCB4\20\uB9AC\uC2A4\uD2B8\20\uC0AD\uC81C\20\3E\3E\20-----");
		map.clear();
		printMap(map);
		
		System.out.println("\uCC29\uD55C\20\uC5B4\uB9B0\uC774\uB294\20\uCF54\uB4DC\uB97C\20\uC9C1\uC811\uC9DC\uC57C\uB418\uC694");
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
