package com.promineotech.music.controller;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.music.entity.Album;
import com.promineotech.music.entity.AlbumRequest;
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
      title = "Delete Album Service"),
servers = {
    @Server(url = "http://localhost:8080",
  description = "local server.")})

public interface DeleteAlbumController {

  //@formatter:off

    @Operation(
        summary = "Deletes an album and cascading songs from the library",
        description = "Deletes an album and it's songs",
        responses = {
            @ApiResponse(
                responseCode = "200", 
                description = "An album is deleted", 
                content = @Content(
                    mediaType = "application/json", 
                    schema = @Schema(implementation = Album.class))),
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
        }
       
        )
    
    @DeleteMapping
    @ResponseStatus(code = HttpStatus.OK)
    Album deleteAlbum(@Valid @RequestBody AlbumRequest albumRequest);
        //@formatter:off
        
        
  }

