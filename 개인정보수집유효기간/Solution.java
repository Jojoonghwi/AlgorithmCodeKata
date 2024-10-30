package 개인정보수집유효기간;
//https://school.programmers.co.kr/learn/courses/30/lessons/150370
import java.util.ArrayList;

class Solution {
	public int[] solution(String today, String[] terms, String[] privacies) {
		int[] answer = {};
		ArrayList<Integer> arrList = new ArrayList<>();
		char privaciesAlphabet = 0;
		char termsAlphabet = 0;
		int termsMonth = 0;
		int todayInt = 0;
		int privaciesDateInt = 0;

		//today 숫자로 변환
		todayInt = Integer.parseInt(today.replaceAll("\\.", ""));

		for (int i = 0; i < privacies.length; i++) {
			//privacies 문자A추출
			privaciesAlphabet = privacies[i].charAt(11);

			for (int j = 0; j < terms.length; j++) {
				//terms 문자 추출
				termsAlphabet = terms[j].charAt(0);

				// 두 문자 비교 후 같은 문자에 있는 숫자 int형으로 변환
				if (privaciesAlphabet == termsAlphabet) {
					termsMonth = Integer.parseInt(terms[j].split(" ")[1]);
					break;
				}
			}

			//privacies 띄어쓰기 기분으로 자르고 앞 문자열 숫자로 변환
			privaciesDateInt = Integer.parseInt((privacies[i].split(" ")[0]).replaceAll("\\.", ""));

			int year = privaciesDateInt / 10000;
			int month = (privaciesDateInt / 100) % 100;
			int day = privaciesDateInt % 100;

			month += termsMonth;
			if (month > 12) {
				year += month / 12;
				month = month % 12;

				if (month == 0) {
					month = 12;
					year--;
				}
			}

			privaciesDateInt = year * 10000 + month * 100 + day;

			//today > privacies면 answer에 저장
			if (todayInt >= privaciesDateInt) {
				arrList.add(i + 1);
			}
		}
		answer = arrList.stream().mapToInt(i -> i).toArray();
		return answer;
	}
}
