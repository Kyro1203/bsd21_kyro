package main.java
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
        if (Usersinput<=1){
            return 1;
        }else {
            return Usersinput * fakultaet(Usersinput - 1);
        }
    }
}