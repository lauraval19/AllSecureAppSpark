package co.edu.escuelaing.loginservice;

import co.edu.escuelaing.loginservice.login.Autheconnect;
import co.edu.escuelaing.loginservice.login.Sparklogin;
import co.edu.escuelaing.loginservice.security.SecureUrlReader;

import static spark.Spark.*;

public class Sparkserver {
    public static void main(String[] args) {

        port(getPort());
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        secure("keystores/otherkeystore.p12", String.valueOf(123456), null, null);
        SecureUrlReader.secureInitial();
        staticFileLocation("public");
        new Sparklogin(new Autheconnect());
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
