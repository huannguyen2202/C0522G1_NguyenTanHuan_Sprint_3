package sprint3_watch.dto;


import sprint3_watch.model.WatchType;

public class WatchDto {
    private int id;
    private String name;
    private String price;
    private String discount;
    private String image;
    private String detail;

    private WatchType watchType;

    public WatchDto() {
    }

    public WatchDto(int id, String name, String price, String discount, String image, String detail, WatchType watchType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.image = image;
        this.detail = detail;
        this.watchType = watchType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public WatchType getWatchType() {
        return watchType;
    }

    public void setWatchType(WatchType watchType) {
        this.watchType = watchType;
    }
}
