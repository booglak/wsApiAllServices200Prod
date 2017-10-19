import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.given;

public class AllApiServicesOk {

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
    public void competenceService(){
        given().header("Authorization", adminWs).
                when().get(host + "/CompetenceService/1").
                then().statusCode(200);
    }

    @Test
    public void courseParticipantService(){
        given().header("Authorization", adminWs).
                when().get(host + "/CourseParticipantService/10320").
                then().statusCode(200);
    }

    @Test
    public void courseService(){
        given().header("Authorization", adminWs).
                when().get(host + "/CourseService/Course/").
                then().statusCode(200);
    }

    @Test
    public void fileService(){
        given().header("Authorization", adminWs).
                when().get(host + "/FileService/Report/Competence/").
                then().statusCode(200);
    }

    @Test
    public void groupParticipantService(){
        given().header("Authorization", adminWs).
                when().get(host + "/GroupParticipantService/").
                then().statusCode(200);
    }

    @Test
    public void groupService(){
        given().header("Authorization", adminWs).
                when().get(host + "/GroupService/1").
                then().statusCode(200);
    }

    @Test
    public void organizationService(){
        given().header("Authorization", adminWs).
                when().get(host + "/OrganizationService/").
                then().statusCode(200);
    }

    @Test
    public void placeService(){
        given().header("Authorization", adminWs).
                when().get(host + "/PlaceService/Region/").
                then().statusCode(200);
    }

    @Test
    public void programService(){
        given().header("Authorization", adminWs).
                when().get(host + "/ProgramService/").
                then().statusCode(200);
    }

    @Test
    public void reportService(){
        given().header("Authorization", adminWs).
                when().get(host + "/ReportService/Competence/").
                then().statusCode(200);
    }

    @Test
    public void userService(){
        given().header("Authorization", adminWs).
                when().get(host + "/UserService/1234").
                then().statusCode(200);
    }

}
