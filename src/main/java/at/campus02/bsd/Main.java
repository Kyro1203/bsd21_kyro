package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.error("Is is an error logger.");
        logger.info("It is an info logger.");

        /*
        calculator calculator = new calculator();

        System.out.println(calculator.add(1, 1));
        System.out.println(calculator.minus(1, 1));
        System.out.println(calculator.multiply(1,1));
        System.out.println(calculator.divide(1,1));
        System.out.println(calculator.fakultaet(4));

         */

    }
}
