package com.sonika.nepstra.pojo;

/**
 * Created by sonika on 10/16/2017.
 */

public class WomenPoducts_pojo {
   public String wname, wprice, wimage;
    public Integer id;
    public Integer cid;

    public WomenPoducts_pojo() {
    }

    public WomenPoducts_pojo(String wname, String wprice, String wimage, Integer cid) {

        this.wname = wname;
        this.wprice = wprice;
        this.wimage = wimage;
        this.cid = cid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getWprice() {
        return wprice;
    }

    public void setWprice(String wprice) {
        this.wprice = wprice;
    }

    public String getWimage() {
        return wimage;
    }

    public void setWimage(String wimage) {
        this.wimage = wimage;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}
