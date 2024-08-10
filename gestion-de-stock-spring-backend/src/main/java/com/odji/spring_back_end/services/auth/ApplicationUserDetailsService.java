//package com.odji.spring_back_end.services.auth;
//
//import com.odji.spring_back_end.dto.UtilisateurDto;
//import com.odji.spring_back_end.model.auth.ExtendedUser;
//import com.odji.spring_back_end.services.UtilisateurService;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ApplicationUserDetailsService implements UserDetailsService {
//
//  @Autowired
//  private UtilisateurService service;
//
//
//  @Override
//  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//    UtilisateurDto utilisateur = service.findByEmail(email);
//
//    List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//    utilisateur.getRoles().forEach(role -> authorities.add(new SimpleGrantedAuthority(role.getRoleName())));
//
//    return new ExtendedUser(utilisateur.getEmail(), utilisateur.getMoteDePasse(), utilisateur.getEntreprise().getId(), authorities);
//  }
//}
