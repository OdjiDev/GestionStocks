//package com.odji.spring_back_end.controller;
//
//import com.odji.spring_back_end.controller.api.AuthenticationApi;
//import com.odji.spring_back_end.dto.auth.AuthenticationRequest;
//import com.odji.spring_back_end.dto.auth.AuthenticationResponse;
//import com.odji.spring_back_end.model.auth.ExtendedUser;
//import com.odji.spring_back_end.services.auth.ApplicationUserDetailsService;
//import com.odji.spring_back_end.utils.JwtUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * Controller for handling authentication-related operations.
// */
//@RestController
//@RequestMapping("/api")
//public class AuthenticationController implements AuthenticationApi {
//
//  @Autowired
//  private AuthenticationManager authenticationManager;
//
//  @Autowired
//  private ApplicationUserDetailsService userDetailsService;
//
//  @Autowired
//  private JwtUtil jwtUtil;
//
//  @Override
//  public ResponseEntity<AuthenticationResponse> authenticate(AuthenticationRequest request) {
//    authenticationManager.authenticate(
//            new UsernamePasswordAuthenticationToken(
//                    request.getLogin(),
//                    request.getPassword()
//            )
//    );
//    final UserDetails userDetails = userDetailsService.loadUserByUsername(request.getLogin());
//
//    final String jwt = jwtUtil.generateToken((ExtendedUser) userDetails);
//
//    return ResponseEntity.ok(AuthenticationResponse.builder().accessToken(jwt).build());
//  }
//
//}
//
