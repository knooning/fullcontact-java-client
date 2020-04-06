package com.fullcontact.apilib.models.Response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ProfileData {
  private String url, service, username, userid, bio, photoUrl;
  private int followers, following;
}
