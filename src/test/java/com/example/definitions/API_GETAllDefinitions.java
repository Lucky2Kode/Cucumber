package com.example.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class API_GETAllDefinitions {

    private ValidatableResponse validatableResponse;

    private String endpoint = "https://reqres.in/api/users";

    @Given("I send a request to the URL to get all user details")
    @Step("Make Request To Get Users Details")
    public void sendRequest(){
        validatableResponse = given().contentType(ContentType.JSON)
                .when().get(endpoint).then();

        System.out.println("Response :"+validatableResponse.extract().asPrettyString());
    }


    @Then("Verify response status code of {int}")
    @Step("Validate Response Of Get Users")
    public void verifyStatus(int statusCode){
        validatableResponse.assertThat().statusCode(statusCode);
    }

}