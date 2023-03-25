import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int n = s.length();
        //Метод get получает значение по ключу
        //Ключ получаем из строки при помощи charAt, который принимает индекс
        //Индекс находим из размера входящей строки - 1
        int res = romanMap.get(s.charAt(n - 1));

        //Задаем цикл для каждого символа справа налево
        for (int i = n - 2; i >= 0; i--) {
            //Если левая цифра больше правой, то прибавляем, иначе отнимаем
            if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
                res += romanMap.get(s.charAt(i));
            } else {
                res -= romanMap.get(s.charAt(i));
            }
        }
        return res;
    }
}
