package utp.grupal.licores.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import utp.grupal.licores.model.*;

@Controller
public class Controlador {
    
    private static String MODEL_CONTACT="contact";

    @GetMapping("/registrar")
    public String transition0(Model model){
        Contact contact = new Contact();
        model.addAttribute(MODEL_CONTACT, contact);
        return "SignIn";
    }

}
