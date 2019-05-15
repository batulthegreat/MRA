package com.hcl.test.hacker.api;

import com.hcl.test.hacker.api.model.AllAmenities;
import com.hcl.test.hacker.api.model.AllLocations;
import com.hcl.test.hacker.api.model.ErrorList;

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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.google.gson.*;

import javax.validation.constraints.*;

@Controller
public class LocationsApiController implements LocationsApi {
	



    public ResponseEntity<AllLocations> doGetAllLocations(@ApiParam(value = "Unique identifier from the service consumer"  ) @RequestHeader(value="Call-Id", required=false) String callId,
        @ApiParam(value = "B2B/UI Channel"  ) @RequestHeader(value="Channel", required=false) String channel) {
    	AllLocations allLocations = new AllLocations();		
		try (FileReader reader = new FileReader("Locations.json"))
        {
            //Read JSON file
			Gson gson=new GsonBuilder().create();			
             allLocations = gson.fromJson(reader, AllLocations.class);
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return new ResponseEntity<AllLocations>(    new AllLocations(),   HttpStatus.OK);
		return new ResponseEntity<AllLocations>(  allLocations  ,   HttpStatus.OK);
    }

}
