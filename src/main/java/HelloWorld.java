import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {


        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        secure("keystores/ecikeystore.p12", String.valueOf(123456), null, null);
        port(5000);

        get("/hello", (req, res) -> "Hello World");
    }
}
