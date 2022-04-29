import java.util.HashMap;
import java.util.Map;


class RomanNumCalc {
    String romanNumCalc(String s){
        ArithmeticOperation arOper=new ArithmeticOperation();
        String result=null;


        if (s.indexOf('*')>=0) result=arOper.operation(s, "\\*");
        else if (s.indexOf('+')>=0) result=arOper.operation(s, "\\+");
        else if (s.indexOf('-')>=0) result=arOper.operation(s, "-");
        else if (s.indexOf('/')>=0) result=arOper.operation(s, "/");
        else try{
            Integer i=Integer.parseInt(result);
        }
        catch (NumberFormatException n){
            System.err.println("Некоректный ввод арифметической операции");
            System.exit(1);
        }
        return result;
    }
}
