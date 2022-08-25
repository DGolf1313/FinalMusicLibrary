package com.promineotech.music.controller;

import java.util.List;
import javax.validation.constraints.Pattern;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.music.entity.Song;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping
@OpenAPIDefinition(info = @Info(
      title = "Music Viewing Service"),
servers = {
    @Server(url = "http://localhost:8080",
  description = "local server.")})

public interface MusicViewingController {

//@formatter:off
  

  @Operation(
      summary = "Returns a list of Songs on an Album",
      description = "Returns a list of Songs that appear on a specific album",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "A list of Song is returned", 
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Song.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid", 
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "No Albums were found with the input criteria", 
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
          name = "albumId",
          allowEmptyValue = false,
          required = false,
          description = "The album ID")
      }
      )
  
  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  List<Song> fetchSongs(
      @Pattern(regexp = "[\\f\\s]*")
      @RequestParam(required = false)
        int albumId);
      //@formatter:off
      
      
}
