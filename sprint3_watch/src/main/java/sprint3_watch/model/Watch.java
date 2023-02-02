package sprint3_watch.model;

import javax.persistence.*;

@Entity
public class Watch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String price;
    private String discount;
    private String image;
    private String detail;
    private boolean isDelete;

    @ManyToOne
    @JoinColumn(name = "watch_type_id", referencedColumnName = "id")
    private WatchType watchType;

    @ManyToOne
    @JoinColumn(name = "watch_producer_id", referencedColumnName = "id")
    private WatchProducer watchProducer;

    public Watch() {
    }

    public Watch(int id, String name, String price, String discount,
                 String image, String detail, boolean isDelete,
                 WatchType watchType, WatchProducer watchProducer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.image = image;
        this.detail = detail;
        this.isDelete = isDelete;
        this.watchType = watchType;
        this.watchProducer = watchProducer;
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

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public WatchType getWatchType() {
        return watchType;
    }

    public void setWatchType(WatchType watchType) {
        this.watchType = watchType;
    }

    public WatchProducer getWatchProducer() {
        return watchProducer;
    }

    public void setWatchProducer(WatchProducer watchProducer) {
        this.watchProducer = watchProducer;
    }
}
