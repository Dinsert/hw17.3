package org.skypro.skyshop.model.product;

public enum TypeContent {
    PRODUCT("PRODUCT"), ARTICLE("ARTICLE");
    private String type;

    TypeContent(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
