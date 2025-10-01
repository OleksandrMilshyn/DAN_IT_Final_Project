package finalProject;

import java.util.Base64;

import static io.restassured.RestAssured.given;

public class TestRailController {
    private static final String[] RUN_IDS = {"2","3"};
    private static final String BASE_API_URL = "https://scool123.testrail.io/index.php?/api/v2/";
    private static final String USER_EMAIL = "milshyn.ca@gmail.com";
    private static final String USER_PASSWORD = "hWWtUJm.m8ezSXgyDG/2-YZY5sD4Hfl8nUZPdS33n";
    private static final String CREDENTIALS = Base64.getEncoder().encodeToString((USER_EMAIL + ":" + USER_PASSWORD).getBytes());

    public static void publishResults(int statusId, int testCaseId) {
        for (String runId : RUN_IDS) {
            given()
                .header("Authorization", "Basic " + CREDENTIALS)
                .contentType("Application/json")
                .body(new TestRailRequestDto(statusId))
                .post(BASE_API_URL + String.format("add_result_for_case/%s/%s", runId, testCaseId));
        }
    }
}
