package com.nordmoen.titanfx.view;

import java.io.IOException;

import org.w3c.dom.NameList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import com.nordmoen.titanfx.Client;
import com.nordmoen.titanfx.model.CartItem;

public class CartItemCellView {

	@FXML
	private GridPane grid;
	@FXML
	private Label cadnameLabel;
	@FXML
	private Label numberLabel;
	@FXML
	private Label nameLabel;
	@FXML
	private ImageView icon;
	
	public CartItemCellView() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(CartItemCellView.class.getResource("CartItemCell.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setInfo(CartItem item) {
		cadnameLabel.setText(item.getCadname());
		numberLabel.setText(item.getNumber());
		nameLabel.setText(item.getName());
		//icon.setImage(new Image(item.getImageLocation()));
	}

	public GridPane getGrid() {
		return grid;
	}

}
