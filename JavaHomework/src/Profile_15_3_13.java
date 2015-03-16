/**
 * << 첫번째 수행평가 과제 >>
 * 내용 : 아이유 프로필 출력하기
 * 작성일자 : 2015년 3월 13일
 * @author JuchanP
 * @version 1.0
 */

public class Profile_15_3_13 {
	public static void main(String[] args) {
		String name = "아이유";
		boolean isman = false;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bltype = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		
		System.out.println("이름 : "+name);
		
		if (isman) System.out.println("성별 : 남자");
		else System.out.println("성별 : 여자");

		System.out.println("나이 : "+age+" 세");
		System.out.println("키 : "+height+" cm");
		System.out.println("몸무게 : "+weight+" kg");
		System.out.println("혈액형 : "+bltype+" 형");
		
	}
}
