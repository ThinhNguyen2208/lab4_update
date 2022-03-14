package com.example.myapplication_lab4;

public class Goods {
    private String name;
    private String shopName;
    private int imagesGoods;

    public Goods(String name, String shopName, int imagesGoods) {
        this.name = name;
        this.shopName = shopName;
        this.imagesGoods = imagesGoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImagesGoods() {
        return imagesGoods;
    }

    public void setImagesGoods(int imagesGoods) {
        this.imagesGoods = imagesGoods;
    }
}
