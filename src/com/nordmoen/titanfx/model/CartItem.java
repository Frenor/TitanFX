package com.nordmoen.titanfx.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CartItem {

    private StringProperty cadname;
    private StringProperty number;
    private StringProperty name;
    private StringProperty imageLocation;
    
    /**
     * Default constructor.
     */
    public CartItem() {
        this(null, null, null, null);
    }

	public CartItem(String cadname, String number, String name,	String imageLocation) {
		this.cadname = new SimpleStringProperty(cadname);
		this.number = new SimpleStringProperty(number);
		this.name = new SimpleStringProperty(name);
		this.imageLocation = new SimpleStringProperty(imageLocation);
	}

	public String getCadname() {
		return cadname.get();
	}
	
	public void setCadname(String cadname) {
		this.cadname.set(cadname);
	}

	public String getNumber() {
		return number.get();
	}
	
	public void setNumber(String number) {
		this.number.set(number);
	}

	public String getName() {
		return name.get();
	}
	
	public void setName(String name) {
		this.name.set(name);
	}

	public String getImageLocation() {
		return imageLocation.get();
	}
	
	public void setImageLocation(String imageLocation) {
		this.imageLocation.set(imageLocation);
	}
	
	public StringProperty cadnameProperty() {
		return cadname;
	}
	
	public StringProperty numberProperty() {
		return number;
	}
	
	public StringProperty nameProperty() {
		return name;
	}
	
	public StringProperty imageLocationProperty() {
		return imageLocation;
	}
    
}
