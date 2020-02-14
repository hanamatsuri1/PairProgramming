package scrabble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void TestForNormalWords() {
        Word normalword=new Word("abroad");
        assertEquals(9,normalword.calculateScores());
    }

    @Test
    void TestForLongWord(){
        Word longword=new Word("Impedimenta");
        assertEquals(18,longword.calculateScores());
    }

    @Test
    void TestForShortWord(){
        Word shortword=new Word("The");
        assertEquals(6,shortword.calculateScores());
    }

    @Test
    void TestForOneLetterWord(){
        Word oneletterword=new Word("A");
        assertEquals(1,oneletterword.calculateScores());
    }

    @Test
    void TestForWordsWithSymbols(){
        Word symbolword=new Word("sco!re");
        assertEquals(7,symbolword.calculateScores());
    }

    @Test
    void TestForLowerCaseAndUpperCase(){
        Word lowercase=new Word("friends");
        Word uppercase=new Word("FRIENDS");
        assertEquals(lowercase.calculateScores(),uppercase.calculateScores());
    }

}