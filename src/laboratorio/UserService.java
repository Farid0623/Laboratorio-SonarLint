package laboratorio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public void processUser(String name) {
        if (name != null) {
            logger.info("User: {}", name.toUpperCase());
        } else {
            logger.warn("El nombre de usuario es nulo");
        }
    }

    public void longMethod() {
        // Código duplicado simplificado utilizando un método auxiliar.
        int totalSum = calculateSum(10) * 4; // Se repite 4 veces el cálculo original.
        logger.info("Total sum calculated: {}", totalSum);
    }

    private int calculateSum(int limit) {
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += i;
        }
        return sum;
    }
}