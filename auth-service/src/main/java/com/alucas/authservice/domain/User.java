// filename: domain/User.java

package com.alucas.authservice.domain;

import com.alucas.authservice.enums.Authorities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Document
public class User implements UserDetails {
  @Id
  private String id;

  @Indexed(unique = true)
  private String username;
  private String password;
  private boolean activated;
  private String activationKey;
  private String resetPasswordKey;
  private Set<Authorities> authorities = new HashSet<>();

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
