class ArithmeticOperation {

        static Transformation transformation=new Transformation();


    String operation(String s, String sChar){
        String n= null;
        char c=sChar.charAt(sChar.length()-1);

        String[] mas= array(s,sChar);
        String s1=mas[0];
        String s2=mas[1];
        check(mas);
        size(mas.length);
        int a=transformation.transformation(mas[0]);
        int b=transformation.transformation(mas[1]);
        isMathOper(a);
        isMathOper(b);

        int result=0;
        try{
            switch (c){
                case '+'->result=a+b;
                case '-'->result=a-b;
                case '*'->result=a*b;
                case '/'->result=a/b;
                default ->result=Integer.parseInt(n);

            }
        }
        catch (NumberFormatException r){
            System.err.println("Некоректный ввод арифметической операции");
            System.exit(1);
        }
        checkRomanNumb(result);

        return transformation.transformation(result);
    }
    private static void checkRomanNumb(int i){
        try{
            if(i<1) i=Integer.parseInt(null);
        }
        catch (NumberFormatException nff){
            System.err.println("Римские числа не могут быть меньше 0");
            System.exit(1);
        }
    }
    private static void size(int i){
        if(i>2) {
            try {
                i=Integer.parseInt(null);
            }
            catch (NumberFormatException nr) {
                System.err.println("Формат математической операции не удовлетворяет заданию");
                System.exit(1);
            }
        }
    }
    private static void isMathOper(int i){
        if(i==0){
            try {
                i=Integer.parseInt(null);
            }
            catch (NumberFormatException nr) {
                System.err.println("Это не математическая операция");
                System.exit(1);
            }
        }
    }
    private static void check(String [] s){
        try {
            int a = transformation.transformation(s[0]);
            int b = transformation.transformation(s[1]);
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.err.println("Строка не является математической операцией");
            System.exit(1);
        }
    }
    private static String[] array(String s, String sChar){
        return s.split(sChar);
    }
}
