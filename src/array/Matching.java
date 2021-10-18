package array;

import java.util.Arrays;
import java.util.List;

public class Matching {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cout = 0;
        if (ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0) .equals(ruleValue)) {
                    cout++;
                }
            }
            return cout;
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1) .equals(ruleValue)) {
                    cout++;
                }
            }
            return cout;
        } else if (ruleKey.equals("name")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    cout++;
                }
            }
            return cout;
        }
        return 0;
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("phone","blue","pixel");
        List<String> list2 = Arrays.asList("computer","silver","lenovo");
        List<String> list3 = Arrays.asList("phone","gold","iphone");
        List<List<String>> list = Arrays.asList(list1, list2, list3);
        System.out.println(countMatches(list, "color", "silver"));
    }
}
