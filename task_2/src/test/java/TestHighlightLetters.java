/**
 * Тестовый класс класса HighlightLetters.
 *
 * @author    Денис Гончаренко
 */
import org.junit.Assert;
import org.junit.Test;

public class TestHighlightLetters {

    /**
     * тестовый метод метода highlightVowels
     */
    @Test
    public void testHighlightVowels(){
        String letters = "maaathematics";
        String expected = "m*a*a*a*th*e*m*a*t*i*cs";

        HighlightLetters highlightLetters = new HighlightLetters();

        Assert.assertEquals(expected, highlightLetters.highlightVowels(letters));
    }
}
