package com.example.cryptotracker;

public class CryptoModal
{
    private String companyname;
    private String logo;
    private double price;

    public CryptoModal(String companyname, String logo, double price) {
        this.companyname = companyname;
        this.logo = logo;
        this.price = price;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
