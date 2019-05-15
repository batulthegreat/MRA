package com.hcl.test.hacker.api;

import com.hcl.test.hacker.api.model.AllLocations;
import com.hcl.test.hacker.api.model.ErrorList;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;

@Api(value = "Locations", description = "the Locations API")
public interface LocationsApi {

    @ApiOperation(value = "Get full list of all Locations", notes = "Gets a list of all Locations to select from", response = AllLocations.class, authorizations = {
        @Authorization(value = "apiKey")
    }, tags={ "Locations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success validation response message", response = AllLocations.class),
        @ApiResponse(code = 400, message = "Parameter do not match the expected format.", response = AllLocations.class),
        @ApiResponse(code = 500, message = "Error Occurred.", response = AllLocations.class) })
    @RequestMapping(value = "/mra/getAllLocations",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AllLocations> doGetAllLocations(@ApiParam(value = "Unique identifier from the service consumer"  ) @RequestHeader(value="Call-Id", required=false) String callId,
        @ApiParam(value = "B2B/UI Channel"  ) @RequestHeader(value="Channel", required=false) String channel);

}
