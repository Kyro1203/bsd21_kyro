package at.campus02.bsd;

import java.util.Scanner;

public class calculator {

    public static Scanner scanner = new Scanner(System.in);


    public static double add(double UsersInput, double UsersInput1){
        return UsersInput + UsersInput1;
    }
    public static double minus(double UsersInput, double UsersInput1){
        return UsersInput - UsersInput1;
    }
    public static double divide(double UsersInput, double UsersInput1){
        return UsersInput / UsersInput1;
    }
    public static double multiply(double UsersInput, double UsersInput1){
        return UsersInput * UsersInput1;
    }
    public static double fakultaet(double Usersinput){
        if (Usersinput==1){
            return 1;
        }else if(Usersinput<=0){
            return 0;
        } else {
            return Usersinput * fakultaet(Usersinput - 1);
        }
    }
}
