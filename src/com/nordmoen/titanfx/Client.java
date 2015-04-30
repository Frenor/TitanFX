package com.nordmoen.titanfx;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import com.nordmoen.titanfx.model.CartItem;
import com.nordmoen.titanfx.view.CartListController;

public class Client extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	
	private ObservableList<CartItem> cart = FXCollections.observableArrayList();
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Titan JavaFX Client");
		
		initRootLayout();
		
		showCartItems();
	}
	
	public Client() {
		cart.add(new CartItem("12", "12", "12", null));
		cart.add(new CartItem("wewe", "wewe", "wewe", null));
		cart.add(new CartItem("sa", "asd", "asd", null));
		cart.add(new CartItem("asdas", "asdas", "asdas", null));
		cart.add(new CartItem("2222", "2222", "2222", null));
		cart.add(new CartItem("2222", "2222", "2222", null));
	}
	
	public ObservableList<CartItem> getCart() {
		return cart;
	}
	
	private void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Client.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    /**
     * Returns the main stage.
     * @return
     */
	public Stage getPrimaryStage() {
		return primaryStage;
	}


	private void showCartItems() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Client.class.getResource("view/CartList.fxml"));
			AnchorPane cartList = (AnchorPane) loader.load();
			
			rootLayout.setCenter(cartList);
			
			CartListController controller = loader.getController();
			controller.setClient(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
