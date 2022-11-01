package co.edu.escuelaing.loginservice.login;

import co.edu.escuelaing.loginservice.security.SecureUrlReader;
import spark.Request;
import spark.Response;

public class Autheconnect {

    static final String url = "https://localhost:1234";
    public String authentication(Request req, Response res) {
        String user = req.queryParams("user");
        String password = req.queryParams("password");

        if(password != null && user != null ){
            res.status(200);
            //url to consume the other service that run in port 1234
            return SecureUrlReader.readURL(url+"/authe?user="+user+"&password"+password);
        }else{
            res.status(400);
            return "Error of authentication";
        }
    }

}
