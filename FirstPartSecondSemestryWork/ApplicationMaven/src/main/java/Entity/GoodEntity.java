package Entity;

import java.math.BigDecimal;

/**
 * Created by salavatshirgaleev on 29.05.16.
 */
public class GoodEntity {
    private Long id;

    private String name;


    private String description;


    private String imageUrl;;


    private BigDecimal price;

    private String decoratedName;


    public GoodEntity(Long id, String name, String description, String imageUrl, BigDecimal price, String decoratedName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.decoratedName = decoratedName;
    }


    public GoodEntity(String decoratedName, BigDecimal price, String description, String name, Long id) {
        this.decoratedName = decoratedName;
        this.price = price;
        this.description = description;
        this.name = name;
        this.id = id;
    }

    public GoodEntity() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDecoratedName() {
        return decoratedName;
    }

    public void setDecoratedName(String decoratedName) {
        this.decoratedName = decoratedName;
    }


}



