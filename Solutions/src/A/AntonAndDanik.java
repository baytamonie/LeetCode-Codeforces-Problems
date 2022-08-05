package A;

import easy.BestTimeToSellAndBuyStocks;

import java.io.*;

public class AntonAndDanik {

    public static void main(String[] args) throws Exception{

        Solution solution = new Solution();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int stringLength = Integer.parseInt(bufferedReader.readLine().trim());
        String input = bufferedReader.readLine();
        bufferedReader.close();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int winner = solution.getWinner(input);

         if(winner == 0)
            bufferedWriter.write("Anton\n");
         if(winner == 1)
             bufferedWriter.write("Danik\n");
         if(winner==-1)
             bufferedWriter.write("Friendship");
        bufferedWriter.close();

    }

    static class Solution {

        public int getWinner(String game){
            int playerOneCounter = 0, playerTwoCounter =0;
            for(int i =0;i<game.length();i++){
                if(game.charAt(i) == 'D')
                    playerTwoCounter++;
                else playerOneCounter++;
                if(playerOneCounter>game.length()/2+1)
                    return 0;
                if(playerTwoCounter>game.length()/2+1)
                    return 1;
            }

            if(playerOneCounter>playerTwoCounter)
                return 0;
            if(playerTwoCounter>playerOneCounter)
                return 1;
            return -1;
        }



    }
}
