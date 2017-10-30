package ir.iran.insurance.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * An example REST-controller.
 */
@RestController
public class GreetingController {

    @ApiOperation(value = "Greeting endpoint", response = String.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK")})
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public ResponseEntity<String> GetGreeting() {
        return ResponseEntity.ok("Hello World!");
    }
}
