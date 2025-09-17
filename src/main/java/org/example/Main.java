package org.example;

public class Main {
    public static boolean isPalindrome(int number){
        boolean check = true;
        String numberToString = String.valueOf(number);
        numberToString = numberToString.replaceAll("-", "");
        int fromLeft = 0;
        int fromRight = numberToString.length() - 1;
        while(fromLeft < fromRight){
            if(numberToString.charAt(fromLeft) != numberToString.charAt(fromRight)){
                check = false;
                break;

            }
            fromLeft++;
            fromRight--;
        }

        return check;
    }
    public static boolean isPerfectNumber(int number2){
        boolean checkit = false;
        int sumOfDividers = 0;
        for(int i=1; i<number2; i++){
            if(number2%i == 0){
                sumOfDividers = sumOfDividers + i;
            }
        }
        if(number2 == sumOfDividers){
            checkit= true;
        }
        return checkit;
    }

    public static String numberToWords(int number3){
        String[] sayilar = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };
        String son = "";
        String cevir = String.valueOf(number3);
        char[] verilenSayi = cevir.toCharArray();

        if(number3>=0){
            for(int i=0; i<verilenSayi.length ; i++){
                int checkSayi = Character.getNumericValue(verilenSayi[i]);;
                son = son +" " + sayilar[checkSayi];
            }
        }
        son = son.trim();
        System.out.println(son);
        return son;
    }
}
