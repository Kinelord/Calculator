import static java.lang.Character.compare;

class ArabicNumCalc {
      String arabicNumCalc(String s){
        char[]mas=s.toCharArray();
        int a=isDigit(mas[0]);
        int b=isDigit(mas[2]);
        String n= null;
        int result=0;
        try{
            switch (mas[1]){
                case '*'->result=a*b;
                case '+'->result=a+b;
                case '-'->result=a-b;
                case '/'->result=a/b;
                default ->result=Integer.parseInt(n);

            }
        }
        catch (NumberFormatException r){
            System.err.println("Некоректный ввод арифметической операции");
            System.exit(1);
        }
        catch (ArithmeticException ae){
            System.err.println("by zero");
            System.exit(1);
        }
        return String.valueOf(result);
    }
    private static int isDigit(char c){
            try {
                return Integer.parseInt(String.valueOf(c));
            }
            catch (NumberFormatException formatException){
                System.err.println("Вы пытаетесь произвести расчет различных систем счисления");
                System.exit(1);
            }
            return 0;
    }
}
