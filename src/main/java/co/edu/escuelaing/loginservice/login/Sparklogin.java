package co.edu.escuelaing.loginservice.login;

import static spark.Spark.get;

public class Sparklogin {

    public Sparklogin(Autheconnect au) {
        get("hello",(req,res)->
            "hello world from sparklogin"
                );

        get("authe",(req,res)->
                au.authentication(req,res)
        );
    }
}
