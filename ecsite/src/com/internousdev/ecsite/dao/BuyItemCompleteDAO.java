package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class BuyItemCompleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql = "INSERT INTO user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay_insert_date)VALUES(?,?,?,?,?,?)";

	public void buyItemInfo(String item_transaction_id, String total_price, String total_count,String user_master_id,  String pay)
			throws SQLException{
	try{
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		prepareStatement.setString(1,item_transaction_id);
		prepareStatement.setString(2,total_price);
		prepareStatement.setString(3,total_count);
		prepareStatement.setString(4,user_master_id);
		prepareStatement.setString(5,pay);
		prepareStatement.setString(6,dateUtil.getDate());
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		connection.close();
	}

	}

}
