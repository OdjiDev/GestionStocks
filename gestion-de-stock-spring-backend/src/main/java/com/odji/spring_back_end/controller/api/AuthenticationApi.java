package com.odji.spring_back_end.controller.api;

import static com.odji.spring_back_end.utils.Constants.AUTHENTICATION_ENDPOINT;

import com.odji.spring_back_end.dto.auth.AuthenticationRequest;
import com.odji.spring_back_end.dto.auth.AuthenticationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Interface for Authentication API.
 */
public interface AuthenticationApi {

  /**
   * Authenticate a user.
   *
   * @param request The authentication request containing user credentials.
   * @return A ResponseEntity containing the authentication response.
   */
  @PostMapping(AUTHENTICATION_ENDPOINT + "/authenticate")
  ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request);
}
