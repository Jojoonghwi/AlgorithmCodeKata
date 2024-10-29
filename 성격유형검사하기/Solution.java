package 성격유형검사하기;

class Solution {
	public String solution(String[] survey, int[] choices) {
		String answer = "";
		int[] score = new int[8];
		//R, T, C, F, J, M, A, N
		for (int i = 0; i < survey.length; i++) {
			char splitSurvey = 0;
			//4보다 크면 동의, 뒷 문자
			if (choices[i] > 4) {
				splitSurvey = survey[i].charAt(1);
			} else if (choices[i] < 4) {
				splitSurvey = survey[i].charAt(0);
			}
			//절댓값
			int choicesScore = Math.abs(choices[i] - 4);

			//각 배열 위치 점수
			switch (splitSurvey) {
				case 'R':
					score[0] += choicesScore;
					break;
				case 'T':
					score[1] += choicesScore;
					break;
				case 'C':
					score[2] += choicesScore;
					break;
				case 'F':
					score[3] += choicesScore;
					break;
				case 'J':
					score[4] += choicesScore;
					break;
				case 'M':
					score[5] += choicesScore;
					break;
				case 'A':
					score[6] += choicesScore;
					break;
				case 'N':
					score[7] += choicesScore;
					break;
			}
		}

		if (score[0] >= score[1]) {
			answer += 'R';
		} else {
			answer += 'T';
		}

		if (score[2] >= score[3]) {
			answer += 'C';
		} else {
			answer += 'F';
		}

		if (score[4] >= score[5]) {
			answer += 'J';
		} else {
			answer += 'M';
		}

		if (score[6] >= score[7]) {
			answer += 'A';
		} else {
			answer += 'N';
		}

		return answer;
	}
}

