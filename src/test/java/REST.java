import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class REST {
    public static void main(String[] args) {
        RestAssured.baseURI="https://reqres.in/api/";
        RequestSpecification request=RestAssured.given();
        request.header("Content-Type","application/json");
        Response response=request.request(Method.GET,"users?page=2");
        ResponseBody responseBody=response.getBody();
        System.out.println(responseBody.asString());
        JsonPath jsonPath=responseBody.jsonPath();
        Object o1=jsonPath.get("data[0].id");
        String s1=String.valueOf(o1);
        System.out.println(s1);
    }
}
