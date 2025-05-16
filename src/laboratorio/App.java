package laboratorio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;

        // Manejo de división por cero
        try {
            logger.info("Sum: {}", calculator.sum(a, b));
            logger.info("Division: {}", calculator.divide(a, b));
        } catch (IllegalArgumentException e) {
            logger.error("Error en división: {}", e.getMessage());
        }

        // Eliminación de código duplicado
        for (int i = 0; i < 3; i++) {
            logger.info("Iteration {}", i);
        }

        // Validación para evitar NullPointerException
        UserService userService = new UserService();
        try {
            userService.processUser(null);
        } catch (NullPointerException e) {
            logger.error("NullPointerException caught: {}", e.getMessage());
        }

        // Uso de try-with-resources para cerrar el Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            logger.info("Enter a number:");
            int input = scanner.nextInt();
            logger.info("Input recibido: {}", input);
        }
    }
}