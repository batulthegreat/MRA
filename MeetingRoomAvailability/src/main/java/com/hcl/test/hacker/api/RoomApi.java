package com.hcl.test.hacker.api;

import java.math.BigDecimal;
import com.hcl.test.hacker.api.model.ErrorList;
import com.hcl.test.hacker.api.model.Suggestions;

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

@Api(value = "Room", description = "the Room API")
public interface RoomApi {

    @ApiOperation(value = "Meeting room search", notes = "Searches for meeting room availability based on date-timeslot, capacity, amenities & facility", response = Suggestions.class, authorizations = {
        @Authorization(value = "apiKey")
    }, tags={ "Room", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Suggestions.class),
        @ApiResponse(code = 400, message = "Parameter do not match the expected format.", response = Suggestions.class),
        @ApiResponse(code = 500, message = "Error Occurred.", response = Suggestions.class) })
    @RequestMapping(value = "/mra/search",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Suggestions> doSearch( @NotNull @ApiParam(value = "Date of the meeting", required = true) @RequestParam(value = "meetingDate", required = true) BigDecimal meetingDate,
         @ApiParam(value = "Start time of meeting") @RequestParam(value = "startTime", required = false) BigDecimal startTime,
         @ApiParam(value = "End time of meeting") @RequestParam(value = "endTime", required = false) BigDecimal endTime,
         @ApiParam(value = "Seating capacity of the room") @RequestParam(value = "capacity", required = false) Integer capacity,
         @ApiParam(value = "List of amenities by amenities Id") @RequestParam(value = "amenities", required = false) List<String> amenities,
         @ApiParam(value = "Location of the meeting") @RequestParam(value = "locationId", required = false) String locationId,
         @ApiParam(value = "Specific building for the room") @RequestParam(value = "building", required = false) String building,
         @ApiParam(value = "Specific Floor for the room") @RequestParam(value = "floor", required = false) String floor,
        @ApiParam(value = "Unique identifier from the service consumer"  ) @RequestHeader(value="Call-Id", required=false) String callId,
        @ApiParam(value = "B2B/UI Channel"  ) @RequestHeader(value="Channel", required=false) String channel);

}
