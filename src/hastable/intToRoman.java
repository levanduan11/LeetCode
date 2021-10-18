package hastable;

import java.util.*;

public class intToRoman {
    public static ArrayList r(int n) {
        ArrayList<String> re = new ArrayList<>();
        int i = 1;
        while (n > 0) {
            int v = n % 10 * i;
            String s = String.valueOf(v);
            re.add(s);
            n = n / 10;
            i = i * 10;
        }
        return re;
    }

    public String intToRoman(int num) {
        HashMap<Integer, Character> t = new HashMap<>();
        t.put(1, 'I');
        t.put(5, 'V');
        t.put(10, 'X');
        t.put(50, 'L');
        t.put(100, 'C');
        t.put(500, 'D');
        t.put(1000, 'M');
        ArrayList<String> y = r(num);
        ArrayList<Integer> tt = new ArrayList<>();
        for (int i = 0; i < y.size(); i++) {
            int o = Integer.valueOf(y.get(i));
            if (o == 0) {
                continue;
            }
            tt.add(o);
        }
        Collections.sort(tt, (a, b) -> b - a);
        ArrayList<String> pp = new ArrayList<>();

        for (int i = 0; i < tt.size(); i++) {
            String s = String.valueOf(tt.get(i));
            pp.add(s);
        }
        y = pp;
        StringBuffer o = new StringBuffer();

        for (int i = 0; i < y.size(); i++) {
            int k = Integer.valueOf(y.get(i));
            if (t.containsKey(k)) {
                o.append(t.get(k));
            } else {
                int u = Integer.valueOf(y.get(i).substring(0, 1));
                int n = y.get(i).length();
                String p = "";
                switch (n) {
                    case 1:
                        if (u >= 2 && u <= 3) {
                            for (int j = 0; j < u; j++) {
                                p = p + t.get(1);
                            }

                        } else if (u >= 6 && u <= 8) {
                            for (int j = 0; j < u - 5; j++) {
                                p += t.get(1);
                            }
                            p = "V" + p;
                        } else if (u == 4) {
                            p = "IV";
                        } else {
                            p = "IX";
                        }
                        break;
                    case 2:
                        if (u >= 2 && u <= 3) {
                            for (int j = 0; j < u; j++) {
                                p = p + t.get(10);
                            }

                        } else if (u >= 6 && u <= 8) {
                            for (int j = 0; j < u - 5; j++) {
                                p += t.get(10);
                            }
                            p = "L" + p;
                        } else if (u == 4) {
                            p = "XL";
                        } else {
                            p = "XC";
                        }
                        break;
                    case 3:
                        if (u >= 2 && u <= 3) {
                            for (int j = 0; j < u; j++) {
                                p = p + t.get(100);
                            }

                        } else if (u >= 6 && u <= 8) {
                            for (int j = 0; j < u - 5; j++) {
                                p += t.get(100);
                            }
                            p = "D" + p;
                        } else if (u == 4) {
                            p = "CD";
                        } else {
                            p = "CM";
                        }
                        break;
                    case 4:
                        if (u >= 2 && u <= 3) {
                            for (int j = 0; j < u; j++) {
                                p = p + t.get(1000);
                            }

                        }


                }

                o.append(p);
            }
        }
        return o.toString();
    }

    public static void main(String[] args) {


        System.out.println(new intToRoman().intToRoman(99));

    }
}
