package com.nordmoen.titanfx.view;

import java.io.IOException;

import com.nordmoen.titanfx.Client;
import com.nordmoen.titanfx.model.CartItem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class CartItemCell extends ListCell<CartItem> {

	@Override
    public void updateItem(CartItem item, boolean empty) {
    	super.updateItem(item, empty);
    	if (empty) {
    		clearContent();
    	} else {
    		addContent(item);
    	}
    }

	private void addContent(CartItem item) {
		CartItemCellView data = new CartItemCellView();
		data.setInfo(item);
		setGraphic(data.getGrid());
	}

	private void clearContent() {
		setText(null);
		setGraphic(null);
	}

}
