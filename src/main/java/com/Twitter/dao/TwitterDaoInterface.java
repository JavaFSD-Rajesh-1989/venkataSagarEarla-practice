package com.Twitter.dao;

import java.util.List;

import com.Twitter.entity.TwitterEntity;

public interface TwitterDaoInterface {

	int createUser(TwitterEntity twitterUser);

	List<TwitterEntity> getAllusers();

	TwitterEntity getUserProfile(TwitterEntity user);

}
