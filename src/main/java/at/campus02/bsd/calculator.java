package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class calculator {

    private static Logger logger = LogManager.getLogger();

    public static Scanner scanner = new Scanner(System.in);

    /**
     * Adds two numbers
     * @param UsersInput first number
     * @param UsersInput1 second number
     * @return Value of first number added with the second number
     */

    public static double add(double UsersInput, double UsersInput1){
        logger.debug(UsersInput + "+" + UsersInput1);
        return UsersInput + UsersInput1;
    }

    /**
     * Subtract two numbers
     * @param UsersInput first number
     * @param UsersInput1 second number
     * @return Value of first number minus with the second number
     */

    public static double minus(double UsersInput, double UsersInput1){
        logger.debug(UsersInput + "-" + UsersInput1);
        return UsersInput - UsersInput1;
    }

    /**
     * divide two numbers
     * @param UsersInput first number
     * @param UsersInput1 second number
     * @return Value of first number divided by the second number
     */

    public static double divide(double UsersInput, double UsersInput1){
        logger.debug(UsersInput + "/" + UsersInput1);
        if (UsersInput1 == 0){
            logger.error("Divider is not allowed to be zero");
            throw new ArithmeticException();

        }else {
            return UsersInput / UsersInput1;
        }
    }

    /**
     * multiply two numbers
     * @param UsersInput first number
     * @param UsersInput1 second number
     * @return Value of first number multiplied by the second number
     */

    public static double multiply(double UsersInput, double UsersInput1){
        logger.debug(UsersInput + "*" + UsersInput1);
        return UsersInput * UsersInput1;
    }

    /**
     * faculty of a number
     * @param Usersinput first number
     * @return Value of first number multiplied with the same number - 1 until Usersinput is 1
     */

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
