import org.hamcrest.core.StringContains;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

public class AllApiServicesOk {


    String admin = "Basic emxhdGFib2dvbWF6QHlhbmRleC5ydTpKeVJ5OW5Q";
    //booglak@gmail.com
    String adminWs = "Basic Ym9vZ2xha0BnbWFpbC5jb206MjIyMjIy";
    String host = "https://worldskillsacademy.ru:8080";

    @Test
    public void authenticationService(){
        given().header("Content-Type", "application/json").
                body("{\"Login\":\"booglak@gmail.com\",\"Password\":\"222222\"}").
                when().post(host + "/AuthenticationService/").
                then().statusCode(200);
    }

    @Test
    public void downloadGroupArchive(){
        given().header("Authorization", adminWs).
                when().get(host + "/FileService/Archive/Group/" + archiveGroupId).
                then().statusCode(200).
                body(new StringContains("ValueResponseOfstring"));
    }
}
