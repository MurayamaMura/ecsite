package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AddItemDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddItemCompleteAction extends ActionSupport implements SessionAware{

	private String itemName;
	private int itemPrice;
	private int itemStock;
	public Map<String, Object> session;
	private AddItemDAO addItemDAO = new AddItemDAO();

	public String execute() throws SQLException{
		addItemDAO.createItem((String)session.get("itemName"),
				(int)session.get("itemPrice"),
				(int)session.get("itemStock"));

		String result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemStock() {
		return itemStock;
	}

	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
}
