import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class RestRequest {

    @Test
    public void createUser(){
        RestAssured.baseURI="https://reqres.in/api/";
        JSON json=new JSON();
        RequestSpecification request=RestAssured.given();
        request.header("Content-Type","application/json");
        request.body(json.userBody().toJSONString());

        Response response=request.request(Method.POST,"users");
        ResponseBody responseBody=response.getBody();
        System.out.println(responseBody.asString());
        System.out.println(response.getStatusCode());

    }

    @Test
    public void feedChickenManual(){
        Response response=RestAssured.given().auth().oauth2(Token.generateToken())
                .post("http://coop.apps.symfonycasts.com/api/1681/chickens-feed");
//        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
    }
}
