package com.cydeo.utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public abstract class HrTestBase {

    @BeforeAll
    public static void init(){
        RestAssured.baseURI = "http://54.86.2.212:1000/ords/hr";
        //MyIpAddress:1000/ords/hr
    }
}
