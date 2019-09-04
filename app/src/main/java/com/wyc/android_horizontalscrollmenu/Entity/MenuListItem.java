package com.wyc.android_horizontalscrollmenu.Entity;

public class MenuListItem {
    private Integer id;
    private String imgSrc;
    private String name;

    public MenuListItem(Integer id, String imgSrc, String name) {
        this.id = id;
        this.imgSrc = imgSrc;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
