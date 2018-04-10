package com.example.janetdo.toomapp.Helper;

import android.app.Activity;
import android.graphics.drawable.Drawable;

import com.example.janetdo.toomapp.R;

import java.io.Serializable;

/**
 * Created by janetdo on 26.12.17.
 */

public class Item  extends Activity implements Serializable  {
    private String id;
    private String name;
    private String description;
    private String quantity;
    private String category;
    private double price;
    private double salesPrice;
    private int aisle;
    private String scanCode;

    public Item(String id, String name, String description, String quantity, String category, double price, double salesPrice, int aisle, String scanCode) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
        this.salesPrice = salesPrice;
        this.price = price;
        this.aisle = aisle;
        this.scanCode = scanCode;
    }

    public String getCategory() {
        return category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public double getPrice() {
        return price;
    }

    public int getAisle() {
        return aisle;
    }

    public String getScanCode() {
        return scanCode;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity='" + quantity + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", salesPrice=" + salesPrice +
                ", aisle=" + aisle +
                ", scanCode='" + scanCode + '\'' +
                '}';
    }

    public Drawable getItemPic() {
        Drawable drawable = null;
        switch (this.getCategory().toLowerCase()) {
            case "bodenbelag":
                drawable = getDrawable(R.drawable.bodenbelag);
                break;
            case "pflanzen":
                drawable = getDrawable(R.drawable.pflanzen);
                break;
            case "lacke":
                drawable = getDrawable(R.drawable.category_paint);
                break;
            case "garten":
                drawable = getDrawable(R.drawable.garten);
                break;
            case "zement":
                drawable = getDrawable(R.drawable.zement);
                break;
            case "bauzubehoer":
                drawable = getDrawable(R.drawable.bauzubehoer);
                break;
            case "styroporleisten":
                drawable = getDrawable(R.drawable.styroporleisten);
                break;
            case "baustoffe":
                drawable = getDrawable(R.drawable.baustoffe);
                break;
            case "daemmungen":
                drawable = getDrawable(R.drawable.daemmstoffe);
                break;
            case "leuchten":
                drawable = getDrawable(R.drawable.lampen);
                break;
            default:
                drawable = getDrawable(R.drawable.sonstiges);


        }
        return drawable;

    }
}
