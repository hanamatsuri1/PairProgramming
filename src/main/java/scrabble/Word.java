package scrabble;

public class Word {

    public String word;
    public LetterValues letterValues;

    public Word(String word){
        this.word=word;
        letterValues=new LetterValues();
    }

    public int calculateScores(){
        //Add each letter in the word individually to a set in lowercase
        char[] array =word.toLowerCase().toCharArray();

        //Create a variable for scrabble value
        int TotalScores=0;

        //Use a for loop to iterate over each letter and calculate the total score
        for (Character x:array) {
                if (letterValues.getLettersWorthOnePoint().contains(x)) {
                    TotalScores += 1;
                }

                if (letterValues.getLettersWorthTwoPoint().contains(x)) {
                    TotalScores += 2;
                }

                if (letterValues.getLettersWorthThreePoint().contains(x)) {
                    TotalScores += 3;
                }

                if (letterValues.getLettersWorthFourPoint().contains(x)) {
                    TotalScores += 4;
                }

                if (letterValues.getLettersWorthFivePoint().contains(x)) {
                    TotalScores += 5;
                }

                if (letterValues.getLettersWorthEightPoint().contains(x)) {
                    TotalScores += 8;
                }

                if (letterValues.getLettersWorthTenPoint().contains(x)) {
                    TotalScores += 10;
                }
            }
        //Print results
        System.out.println("Scrabble value: "+TotalScores);

        return TotalScores;

    }

}
