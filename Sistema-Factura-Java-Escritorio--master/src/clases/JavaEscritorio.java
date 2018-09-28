package clases;

import formularios.FrmLogin;


public class JavaEscritorio {

    public static void main(String[] args) {
        Datos misDatos = new Datos();
        
        //llamamos al formulario login
        FrmLogin miLogin = new FrmLogin();
        miLogin.setDatos(misDatos);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
    
}
