package es.comepiedras.retosprogramacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("/iniciarSesion")
    public String login(@RequestParam String usuario,
                        @RequestParam String password, Model model){
        // Logica de validacio de usuario y contraseña
        if(!usuario.isBlank() || !password.isBlank()){
            model.addAttribute("usuario", usuario);
//            model.addAttribute("edad", 13);
        } else {
            model.addAttribute("errorMessage", "Debes introducir usuario y contraseña");
            return "error";
        }
        return "dashboard";
    }
}
