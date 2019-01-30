public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;


    String checkYourself(String guess) {
        int guessInt = Integer.parseInt(guess);
        String result = "miss";
        for(int cell : locationCells){
            if(guessInt == cell) {
                numOfHits++;
                result = "hit";
                break;
            }
        }
        if (numOfHits == locationCells.length) result =  "kill";
        System.out.println(result);
        return result;
    }

    void setLocationCells(int[] loc) {
        locationCells = loc;
    }
}
