package com.example.appsteam.mybookstore;

public class Modelclass {
    private String bookname_id,authername_id,rate_id;
    private int bookimage_id,wishlist_id;

    public Modelclass() {
    }

    public Modelclass(String bookname_id, String authername_id, String rate_id, int bookimage_id, int wishlist_id) {
        this.bookname_id = bookname_id;
        this.authername_id = authername_id;
        this.rate_id = rate_id;
        this.bookimage_id = bookimage_id;
        this.wishlist_id = wishlist_id;
    }

    public String getBookname_id() {
        return bookname_id;
    }

    public void setBookname_id(String bookname_id) {
        this.bookname_id = bookname_id;
    }

    public String getAuthername_id() {
        return authername_id;
    }

    public void setAuthername_id(String authername_id) {
        this.authername_id = authername_id;
    }

    public String getRate_id() {
        return rate_id;
    }

    public void setRate_id(String rate_id) {
        this.rate_id = rate_id;
    }

    public int getBookimage_id() {
        return bookimage_id;
    }

    public void setBookimage_id(int bookimage_id) {
        this.bookimage_id = bookimage_id;
    }

    public int getWishlist_id() {
        return wishlist_id;
    }

    public void setWishlist_id(int wishlist_id) {
        this.wishlist_id = wishlist_id;
    }
}
