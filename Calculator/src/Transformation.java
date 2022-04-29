import java.util.HashMap;
import java.util.Map;

class Transformation {
    int transformation(String str){
        String s=null;
        try {
            Map<Integer, String> m = new HashMap<>();
            m.put(1, "I");
            m.put(2, "II");
            m.put(3, "III");
            m.put(4, "IV");
            m.put(5, "V");
            m.put(6, "VI");
            m.put(7, "VII");
            m.put(8, "VIII");
            m.put(9, "IX");
            m.put(10, "X");
            for (Map.Entry<Integer, String> p : m.entrySet())
                if (str.equals(p.getValue())) return p.getKey();
            int ss=Integer.parseInt(s);
        }
        catch (NumberFormatException formatException){
            System.err.println("Некоректный ввод арифметической операции");
            System.exit(1);
        }
       return 0;

    }

    String transformation(int i){
        char[] c=reversString(String.valueOf(i)).toCharArray();
        return arabInRoman(discharge(c,2), discharge(c,1), discharge(c,0));
    }
    private static String reversString(String s){
        if(s.length()<=1) return s;
        return reversString(s.substring(1))+s.charAt(0);
    }
    private static int discharge(char[] c,int index){
        try {
            return Character.getNumericValue(c[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
        }
        return 0;
    }
    private static String arabInRoman(int hundred, int dozens, int unit){
        String hund="";
        switch (hundred) {
            case 1 -> {hund="C";
            }
            case 2 -> {hund="CC";
            }
            case 3 -> {hund="CCC";
            }
            case 4 -> {hund="CD";
            }
            case 5 -> {hund="D";
            }
            case 6 -> {hund="DC";
            }
            case 7 -> {hund="DCC";
            }
            case 8 -> {hund="DCCC";
            }
            case 9 -> {hund="CM";
            }
        }
        String doz="";
        switch (dozens) {
            case 1 -> {doz="X";
            }
            case 2 -> {doz="XX";
            }
            case 3 -> {doz="XXX";
            }
            case 4 -> {doz="XL";
            }
            case 5 -> {doz="L";
            }
            case 6 -> {doz="LX";
            }
            case 7 -> {doz="LXX";
            }
            case 8 -> {doz="LXXX";
            }
            case 9 -> {doz="XC";
            }
        }
        String uni="";
        switch (unit) {
            case 1 -> {uni="I";
            }
            case 2 -> {uni="II";
            }
            case 3 -> {uni="III";
            }
            case 4 -> {uni="IV";
            }
            case 5 -> {uni="V";
            }
            case 6 -> {uni="VI";
            }
            case 7 -> {uni="VII";
            }
            case 8 -> {uni="VIII";
            }
            case 9 -> {uni="IX";
            }
        }
        StringBuffer sb=new StringBuffer();
        return sb.append(hund).append(doz).append(uni).toString();
    }
}
