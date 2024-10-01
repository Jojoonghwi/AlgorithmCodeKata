package 달리기경주;

import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> playersMap = new HashMap<>();

        int index = 0;
        String temp="";
        for(int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
        }

        for(int i=0; i < callings.length; i++) {
            index = playersMap.get(callings[i]);

            String tmp = players[index - 1];
            players[index - 1] = players[index];
            players[index] = tmp;

            playersMap.put(players[index], index);
            playersMap.put(players[index - 1], index - 1);
        }

        return players;
    }
}
