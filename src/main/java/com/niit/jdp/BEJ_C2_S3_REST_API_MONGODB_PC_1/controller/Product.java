/*
 *Author Name:Praveen Kumar
 *Date: 24-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_PC_1.controller;

public class Product {
    private int productId;
    private String productName;
    private String productDescription;

    public Product() {

    }

    public Product(int productId, String productName, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
    }
}