package scrabble;

import java.util.HashSet;
import java.util.Set;

public class LetterValues {
    private Set<Character> lettersWorthOnePoint;
    private Set<Character> lettersWorthTwoPoint;
    private Set<Character> lettersWorthThreePoint;
    private Set<Character> lettersWorthFourPoint;
    private Set<Character> lettersWorthFivePoint;
    private Set<Character> lettersWorthEightPoint;
    private Set<Character> lettersWorthTenPoint;

    public LetterValues(){
        //Add letters of different scores to different sets
        lettersWorthOnePoint=new HashSet<>();
        lettersWorthOnePoint.add('a');
        lettersWorthOnePoint.add('e');
        lettersWorthOnePoint.add('i');
        lettersWorthOnePoint.add('o');
        lettersWorthOnePoint.add('u');
        lettersWorthOnePoint.add('l');
        lettersWorthOnePoint.add('n');
        lettersWorthOnePoint.add('r');
        lettersWorthOnePoint.add('s');
        lettersWorthOnePoint.add('t');

        lettersWorthTwoPoint=new HashSet<>();
        lettersWorthTwoPoint.add('d');
        lettersWorthTwoPoint.add('g');

        lettersWorthThreePoint=new HashSet<>();
        lettersWorthThreePoint.add('b');
        lettersWorthThreePoint.add('c');
        lettersWorthThreePoint.add('m');
        lettersWorthThreePoint.add('p');

        lettersWorthFourPoint=new HashSet<>();
        lettersWorthFourPoint.add('f');
        lettersWorthFourPoint.add('h');
        lettersWorthFourPoint.add('v');
        lettersWorthFourPoint.add('w');
        lettersWorthFourPoint.add('y');

        lettersWorthFivePoint=new HashSet<>();
        lettersWorthFivePoint.add('k');

        lettersWorthEightPoint=new HashSet<>();
        lettersWorthEightPoint.add('j');
        lettersWorthEightPoint.add('x');

        lettersWorthTenPoint=new HashSet<>();
        lettersWorthTenPoint.add('q');
        lettersWorthTenPoint.add('z');
    }

    public Set<Character> getLettersWorthOnePoint() {
        return lettersWorthOnePoint;
    }

    public Set<Character> getLettersWorthTwoPoint() {
        return lettersWorthTwoPoint;
    }

    public Set<Character> getLettersWorthThreePoint() {
        return lettersWorthThreePoint;
    }

    public Set<Character> getLettersWorthFourPoint() {
        return lettersWorthFourPoint;
    }

    public Set<Character> getLettersWorthFivePoint() {
        return lettersWorthFivePoint;
    }

    public Set<Character> getLettersWorthEightPoint() {
        return lettersWorthEightPoint;
    }

    public Set<Character> getLettersWorthTenPoint() {
        return lettersWorthTenPoint;
    }

}
