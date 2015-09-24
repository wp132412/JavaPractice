package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("바람이나 좀 쐐", "개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "iKon"));
		
		System.out.println("-- << 멜론 차트 >> --"); 
		printList(list);
		
		System.out.println("-- << 2위곡 추가 >> --");
		list.add(1, new Music("레옹", "이유갓지"));
		printList(list);
		
		System.out.println("-- << 3위곡 변경 >> --");
		list.set(2, new Music("맙소사", "황태지"));
		printList(list);
		
		System.out.println("-- << 4위곡 삭제 >> --");
		list.remove(3);
		printList(list);
	}
	
	public static void printList(List <Music> list) {
		int size = list.size();
		
		for (int i = 0; i < size; i++) {
			System.out.println((i+1)+". "+list.get(i));
		}
		
		System.out.println();
	}
}
