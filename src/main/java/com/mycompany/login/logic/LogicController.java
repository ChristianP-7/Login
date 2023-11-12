package com.mycompany.login.logic;

import com.mycompany.login.persistence.PersistenceController;
import java.util.List;

public class LogicController {
    
    PersistenceController persisControl;

    public LogicController() {
        persisControl = new PersistenceController();
    }
    
    public String validarUser(String user, String password) {
        
        String mensaje = ""; 
        List<User> listaUsuarios = persisControl.traerUsers();
        for (User usu : listaUsuarios){
            if(usu.getNameUser().equals(user)){
                if(usu.getPassword().equals(password)){
                    mensaje = "Usuario y contraseña correctos. Bienvenido";
                    return mensaje;
                }else{
                    mensaje = "Contraseña incorrecta";
                    return mensaje;
                }
            }else{
                mensaje = "Usuario no encontrado";
            }
        }        
        return mensaje;
    }
}
