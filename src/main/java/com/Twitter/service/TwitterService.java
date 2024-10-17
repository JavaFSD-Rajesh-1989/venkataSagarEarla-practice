package com.Twitter.service;

import java.util.List;

import com.Twitter.dao.TwitterDao;
import com.Twitter.dao.TwitterDaoInterface;
import com.Twitter.entity.TwitterEntity;

public class TwitterService implements TwitterServiceInterface {

	@Override
	public int createUser(TwitterEntity twitterUser) {
		TwitterDaoInterface tdao=new TwitterDao();
		return tdao.createUser(twitterUser);
	}

	@Override
	public List<TwitterEntity> viewAllUsers() {
		TwitterDaoInterface tdao=new TwitterDao();
		List<TwitterEntity> users=tdao.getAllusers();
		return users;
	}

	@Override
	public TwitterEntity viewUserProfile(TwitterEntity user) {
		TwitterDaoInterface tdao=new TwitterDao();
		TwitterEntity ac=tdao.getUserProfile(user);
		return ac;
	}

}
