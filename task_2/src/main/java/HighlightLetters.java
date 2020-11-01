/**
 * Класс для выделения букв в строках.
 *
 * @author    Денис Гончаренко
 */
public class HighlightLetters {
    /** перечисление всех гласных букв Английского алфавита */
    public static final String vowels = "EeYyUuIiOoAa";

    /**
     * рекурсивный метод, возвращающий новую строку,
     * где все гласные отделены от примыкающих букв символом "*".
     *
     * @param letters строка для редактирования
     */
    public String highlightVowels(String letters){
        if(letters.length() < 2){
            return letters;
        }
        if(vowels.contains(letters.substring(0, 1)) || vowels.contains(letters.substring(1, 2))){
            return letters.substring(0, 1) + "*" + highlightVowels(letters.substring(1));
        }else {
            return letters.substring(0, 1) + highlightVowels(letters.substring(1));
        }
    }
}
