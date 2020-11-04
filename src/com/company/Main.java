package com.company;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(stringConvertToInteger(str));
    }


    private static int stringConvertToInteger(String str) {
        String pattern = "\\s*([+-]?\\d+)";
        Pattern  r = Pattern.compile(pattern);
        Matcher matcher = r.matcher(str);
        if(!matcher.find())
            return 0;
        BigInteger res = new BigInteger(matcher.group(1));
        if(res.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) > 0){
            return Integer.MAX_VALUE;
        }
        if(res.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE)))<0){
            return Integer.MIN_VALUE;
        }
        return res.intValue();
    }
}
