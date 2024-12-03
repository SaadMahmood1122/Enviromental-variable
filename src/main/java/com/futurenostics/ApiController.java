package com.futurenostics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


//    @Value("${app.api.key}")
//    private  String apiKey;
    //getting through enviromental class
@Autowired
    private Environment environment;

    @GetMapping("/")
    public String getApiKey() {

//    return apiKey;

        return environment.getProperty("app.api.key");
    }

    @Value("${app.api.key2}")
    private String apiKey2;
@GetMapping("/ev")
    public String getApiKeyValueSetThroughEV(){

        return apiKey2;
    }

    @Value("${app.datasource.url}")
    private String dsUrl;
    @GetMapping("/ds")
    public String getDataSourceUrl(){
    return dsUrl;
    }
}
