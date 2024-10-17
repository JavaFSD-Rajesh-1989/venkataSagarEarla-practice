package com.Twitter.service;

import java.util.List;

import com.Twitter.entity.TwitterEntity;

public interface TwitterServiceInterface {

	int createUser(TwitterEntity twitterUser);

	List<TwitterEntity> viewAllUsers();

	TwitterEntity viewUserProfile(TwitterEntity user);

}
