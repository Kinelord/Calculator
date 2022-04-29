import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите математическую операцию");
        String str=scanner.nextLine();
        scanner.close();
        String result=calc(str);
        System.out.println(result);

    }
    public static String calc(String input) {
        ArabicNumCalc anc=new ArabicNumCalc();
        RomanNumCalc rnc=new RomanNumCalc();
        try{
            input.charAt(2);
        }
        catch (StringIndexOutOfBoundsException s){
            System.err.println("Строка не является арифметической операцией");
            System.exit(1);
        }
        if(input.length()>3) return rnc.romanNumCalc(input);
        else if(!Character.isDigit(input.charAt(0))) return rnc.romanNumCalc(input);
        else return anc.arabicNumCalc(input);
    }
}
