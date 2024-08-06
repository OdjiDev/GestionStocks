package com.odji.spring_back_end.dto.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationResponse {

  private String accessToken;

}
