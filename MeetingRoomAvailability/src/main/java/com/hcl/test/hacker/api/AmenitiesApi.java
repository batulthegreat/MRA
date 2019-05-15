package com.hcl.test.hacker.api;

import com.hcl.test.hacker.api.model.AllAmenities;
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

@Api(value = "Amenities", description = "the Amenities API")
public interface AmenitiesApi {

    @ApiOperation(value = "Get list of all amenities", notes = "Gets the full list of amenities to select from", response = AllAmenities.class, authorizations = {
        @Authorization(value = "apiKey")
    }, tags={ "Amenities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success validation response message", response = AllAmenities.class),
        @ApiResponse(code = 400, message = "Parameter do not match the expected format.", response = AllAmenities.class),
        @ApiResponse(code = 500, message = "Error Occurred.", response = AllAmenities.class) })
    @RequestMapping(value = "/mra/getAllAmenities",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AllAmenities> doGetAllAmenities(@ApiParam(value = "Unique identifier from the service consumer"  ) @RequestHeader(value="Call-Id", required=false) String callId,
        @ApiParam(value = "B2B/UI Channel"  ) @RequestHeader(value="Channel", required=false) String channel);

}
