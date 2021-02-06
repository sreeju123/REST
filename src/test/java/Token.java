import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Token {


    public static String generateToken(){
        Response response=RestAssured.given()
                .formParam("client_id","MukApp")
                .formParam("client_secret","527147396459ce243898c773bbbd6b2f")
                .formParam("grant_type","client_credentials")
                .post("http://coop.apps.symfonycasts.com/token");

       String token=response.jsonPath().get("access_token");
        return token;
    }
}
