package com.nordmoen.titanfx.view;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import com.nordmoen.titanfx.Client;
import com.nordmoen.titanfx.model.CartItem;

public class CartListController {
	@FXML
	private ListView<CartItem> cartList;
	
	private Client client;
	
    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
	public CartListController() {
		
	}
	
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;

        // Add observable list data to the table
        cartList.setItems(client.getCart());
        cartList.setCellFactory((ListView<CartItem> lw) -> new CartItemCell());
    }
}
