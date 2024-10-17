package com.Twitter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Twitter.databaseConnections.DataBaseConnection;
import com.Twitter.entity.TwitterEntity;

public class TwitterDao implements TwitterDaoInterface {

	@Override
	public int createUser(TwitterEntity twitterUser) {
		int i=0;
		try {
			Connection con=DataBaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into TwitterEntity values(?,?,?,?)");
			ps.setString(1, twitterUser.getName());
			ps.setString(2, twitterUser.getPassword());
			ps.setString(3, twitterUser.getEmail());
			
			ps.setString(4, twitterUser.getAddress());
			i=ps.executeUpdate();
					return i;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<TwitterEntity> getAllusers() {
		List<TwitterEntity> users=new ArrayList<TwitterEntity>();
		try {
			Connection con=DataBaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select *from  TwitterEntity");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String n=rs.getString(1);
				String e=rs.getString(2);
				String p=rs.getString(3);
				String a=rs.getString(4);
				TwitterEntity tw=new TwitterEntity();
				tw.setName(n);
				tw.setEmail(e);
				tw.setPassword(p);
				tw.setAddress(a);
				users.add(tw);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public TwitterEntity getUserProfile(TwitterEntity user) {
		TwitterEntity tt=new TwitterEntity();
		
		try {
			Connection con=DataBaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement(" select * from TwitterEntity where email=?");
			ps.setString(1, user.getEmail());
			ResultSet rs=ps.executeQuery();  
			while(rs.next()) {
				String n=rs.getString(1);
				String p=rs.getString(2);
				String e=rs.getString(3);
				String ad=rs.getString(4);
				tt.setName(n);
				tt.setPassword(p);
				tt.setEmail(e);
				tt.setAddress(ad);
				return tt;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return tt;
	}

}
