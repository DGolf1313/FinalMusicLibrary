package com.promineotech.music.controller;

import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.music.entity.Musician;
import com.promineotech.music.entity.MusicianRequest;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/musicians")
@OpenAPIDefinition(info = @Info(
      title = "Musician Creating Service"),
servers = {
    @Server(url = "http://localhost:8080",
  description = "local server.")})

public interface CreateMusicianController {

//@formatter:off
  

  @Operation(
      summary = "Creates a new entry in the musician table",
      description = "Returns a new musician",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "A musician is added", 
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Musician.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid", 
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "A musician was not given the proper items to create a new musician entry", 
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred.", 
              content = @Content(
                  mediaType = "application/json"))
      },
      parameters = {
          @Parameter(
          name = "musicianRequest",
          required = true,
          description = "The musicians is JSON"),
          
      }
      )
  
  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  Musician createMusician(@Valid @RequestBody MusicianRequest musicianRequest);
      //@formatter:off
      
      

}
