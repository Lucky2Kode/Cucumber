package com.example.definitions;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class API_GETDefinitions {

    private ValidatableResponse validatableResponse;

    private String endpoint = "https://reqres.in/api/users/2";

    @Given("I send a request to the URL to get user details")
    @Step("User Navigate To Get User")
    public void sendRequest(){
        validatableResponse = given().contentType(ContentType.JSON)
                .when().get(endpoint).then();

        System.out.println("Response :"+validatableResponse.extract().asPrettyString());
    }


    @Then("Verify response status code as {int}")
    @Step("Validate Response Of Get User")
    public void verifyStatus(int statusCode){
        validatableResponse.assertThat().statusCode(statusCode);
        validatableResponse.assertThat().body("data.id",equalTo(2));
    }

}