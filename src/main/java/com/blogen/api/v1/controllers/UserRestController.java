package com.blogen.api.v1.controllers;

import com.blogen.api.v1.model.UserDTO;
import com.blogen.api.v1.model.UserListDTO;
import com.blogen.api.v1.services.UserService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author Cliff
 */
@Log4j
@RestController
public class UserRestController {

    public static final String BASE_URL = "/api/v1/users";

    private UserService userService;

    @Autowired
    public UserRestController( @Qualifier("userRestService") UserService userService ) {
        this.userService = userService;
    }

    @GetMapping( BASE_URL )
    @ResponseStatus(HttpStatus.OK)
    public UserListDTO getAllUser() {
        log.debug( "getAllUsers" );
        return userService.getAllUsers();
    }

    @GetMapping( BASE_URL + "/{id}" )
    @ResponseStatus( HttpStatus.OK )
    public UserDTO getUser( @PathVariable("id") Long id ) {
        log.debug( "getUser id=" + id );
        return userService.getUser( id );
    }

    @PostMapping( BASE_URL )
    @ResponseStatus( HttpStatus.CREATED )
    public UserDTO createNewUser( @RequestBody UserDTO userDTO ) {
        log.debug( "createNewUser userDTO=" + userDTO );
        return userService.createNewUser( userDTO );
    }

    @PatchMapping( BASE_URL + "/{id}" )
    @ResponseStatus( HttpStatus.OK )
    public UserDTO updateUser( @PathVariable("id") Long id, @RequestBody UserDTO userDTO ) {
        log.debug( "update user id=" + id + " userDTO=" + userDTO );
        return userService.updateUser( id, userDTO );
    }
}
