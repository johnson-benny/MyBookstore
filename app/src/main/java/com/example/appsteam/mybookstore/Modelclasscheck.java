package com.example.appsteam.mybookstore;

public class Modelclasscheck {
    private String booknamec_id,authernamec_id,Qty_id,ratec_id;
    private int checkoutimage_id;

    public Modelclasscheck() {
    }

    public Modelclasscheck(String booknamec_id, String authernamec_id, String qty_id, String ratec_id, int checkoutimage_id) {
        this.booknamec_id = booknamec_id;
        this.authernamec_id = authernamec_id;
        Qty_id = qty_id;
        this.ratec_id = ratec_id;
        this.checkoutimage_id = checkoutimage_id;
    }

    public String getBooknamec_id() {
        return booknamec_id;
    }

    public void setBooknamec_id(String booknamec_id) {
        this.booknamec_id = booknamec_id;
    }

    public String getAuthernamec_id() {
        return authernamec_id;
    }

    public void setAuthernamec_id(String authernamec_id) {
        this.authernamec_id = authernamec_id;
    }

    public String getQty_id() {
        return Qty_id;
    }

    public void setQty_id(String qty_id) {
        Qty_id = qty_id;
    }

    public String getRatec_id() {
        return ratec_id;
    }

    public void setRatec_id(String ratec_id) {
        this.ratec_id = ratec_id;
    }

    public int getCheckoutimage_id() {
        return checkoutimage_id;
    }

    public void setCheckoutimage_id(int checkoutimage_id) {
        this.checkoutimage_id = checkoutimage_id;
    }
}
