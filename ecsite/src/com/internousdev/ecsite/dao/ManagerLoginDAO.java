package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.ManagerLoginDTO;
import com.internousdev.ecsite.util.DBConnector;


public class ManagerLoginDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private ManagerLoginDTO mLDTO = new ManagerLoginDTO();

	//ユーザー情報の取得
	public ManagerLoginDTO getManagerLoginUserInfo(String loginUserId, String loginPassword){

		//入力されたidとpassと一致するものを検索
		String sql = "SELECT * FROM manager_login where login_id=? AND login_pass=? ";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			//データベスから引っ張ってきたデータをDTOに格納
			if(resultSet.next()){
				mLDTO.setLoginId(resultSet.getString("login_id"));
				mLDTO.setLoginPassword(resultSet.getString("login_password"));
				mLDTO.setUserName(resultSet.getString("user_name"));

				//上記の動作で、idがあることを確認できれば、Flgを立てる
				if(!(resultSet.getString("login_id").equals(null))){
					mLDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return mLDTO;
	}
}
