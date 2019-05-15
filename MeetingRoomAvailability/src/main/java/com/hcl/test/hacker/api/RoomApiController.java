package com.hcl.test.hacker.api;

import java.math.BigDecimal;
import com.hcl.test.hacker.api.model.ErrorList;
import com.hcl.test.hacker.api.model.Suggestions;

import io.swagger.annotations.*;
import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import java.util.List;
import java.sql.*;

import javax.validation.constraints.*;

@Controller
public class RoomApiController implements RoomApi {
	
    public ResponseEntity<Suggestions> doSearch( @NotNull @ApiParam(value = "Date of the meeting", required = true) @RequestParam(value = "meetingDate", required = true) BigDecimal meetingDate,
         @ApiParam(value = "Start time of meeting") @RequestParam(value = "startTime", required = false) BigDecimal startTime,
         @ApiParam(value = "End time of meeting") @RequestParam(value = "endTime", required = false) BigDecimal endTime,
         @ApiParam(value = "Seating capacity of the room") @RequestParam(value = "capacity", required = false) Integer capacity,
         @ApiParam(value = "List of amenities by amenities Id") @RequestParam(value = "amenities", required = false) List<String> amenities,
         @ApiParam(value = "Location of the meeting") @RequestParam(value = "locationId", required = false) String locationId,
         @ApiParam(value = "Specific building for the room") @RequestParam(value = "building", required = false) String building,
         @ApiParam(value = "Specific Floor for the room") @RequestParam(value = "floor", required = false) String floor,
        @ApiParam(value = "Unique identifier from the service consumer"  ) @RequestHeader(value="Call-Id", required=false) String callId,
        @ApiParam(value = "B2B/UI Channel"  ) @RequestHeader(value="Channel", required=false) String channel) {
    	
    	//This search requires a back-end SQL or ElasticSearch DB, cannot be done with flat files
    	
        return new ResponseEntity<Suggestions>(    new Suggestions(),   HttpStatus.OK);
    }

}
