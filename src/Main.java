import java.util.*;

public class Main {

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        String textLow = text.toLowerCase();
        char [] chKey = textLow.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < chKey.length; i++){
            if (chKey[i] != ' ' && chKey[i] !=',' && chKey[i]!= '.'){
                if (charMap.containsKey(chKey[i])){
                    charMap.put(chKey[i], charMap.get(chKey[i])+1);
                } else {
                    charMap.put(chKey[i],1);
                }
            }
        }
        int maxCount = (Collections.max(charMap.values()));
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println("Максимальное количество повторений у символа " + entry.getKey() + " - встречается " + entry.getValue() + " раз");
            }
        }
        int minCount = (Collections.min(charMap.values()));
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()){
            if (entry.getValue() == minCount){
                System.out.println("Минимальное количество повторений у символа " + entry.getKey() + " - втстречается " + entry.getValue() + " раз");
            }
        }
    }

}



