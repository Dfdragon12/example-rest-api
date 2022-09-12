package co.edu.unisabana.usuario.negocio.service.user;

import co.edu.unisabana.usuario.negocio.service.model.User;
import co.edu.unisabana.usuario.negocio.service.user.port.RegisterUserPort;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {

    private final RegisterUserPort registerUserPort;

    RegisterUserService(RegisterUserPort registerUserPort) {
        this.registerUserPort = registerUserPort;
    }

    //Un codigo con muchas salidas, tiene MAYOR complejidad ciclomatica
    public int registerUser(User user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            throw new IllegalArgumentException("The name cannot be empty");
        }
        if (user.getAge() < 18) {
            throw new RuntimeException("The age cannot be minior 18");
        }

        boolean result = registerUserPort.addNewUser(user);

        if (result) {
            return 10;
        } else {
            return 3;
        }
    }

}