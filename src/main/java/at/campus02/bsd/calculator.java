package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class calculator {

    private static Logger logger = LogManager.getLogger();

    public static Scanner scanner = new Scanner(System.in);


    public static double add(double UsersInput, double UsersInput1){
        logger.debug(UsersInput + "+" + UsersInput1);
        return UsersInput + UsersInput1;
    }
    public static double minus(double UsersInput, double UsersInput1){
        logger.debug(UsersInput + "-" + UsersInput1);
        return UsersInput - UsersInput1;
    }
    public static double divide(double UsersInput, double UsersInput1){
        logger.debug(UsersInput + "/" + UsersInput1);
        if (UsersInput1 == 0){
            logger.error("Divider is not allowed to be zero");
            throw new ArithmeticException();

        }else {
            return UsersInput / UsersInput1;
        }
    }
    public static double multiply(double UsersInput, double UsersInput1){
        logger.debug(UsersInput + "*" + UsersInput1);
        return UsersInput * UsersInput1;
    }
    public static double fakultaet(double Usersinput){
        logger.debug(Usersinput + "!");
        if (Usersinput==1){
            return 1;
        }else if(Usersinput<=0){
            return 0;
        } else {
            return Usersinput * fakultaet(Usersinput - 1);
        }
    }
}
