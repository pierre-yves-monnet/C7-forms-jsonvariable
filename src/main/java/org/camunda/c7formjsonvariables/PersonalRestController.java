package org.camunda.c7formjsonvariables;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PersonalRestController {

    @GetMapping(value = "/info", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Object> getInfo(@RequestParam(value = "name", defaultValue = "World") String name) {
        Map<String,Object> result = new HashMap<>();
        result.put("message", "Hello "+name);
        return result;
    }
}
