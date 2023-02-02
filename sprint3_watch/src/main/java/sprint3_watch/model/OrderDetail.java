package sprint3_watch.model;

import javax.persistence.*;

@Entity
//@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String datePayment;
    private String quantity;
    private boolean isDelete;
//    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "watch_id", referencedColumnName = "id")
    private Watch watch;
//
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;


    public OrderDetail() {
    }

    public OrderDetail(int id, String datePayment, String quantity,
                       boolean isDelete, Watch watch, Customer customer) {
        this.id = id;
        this.datePayment = datePayment;
        this.quantity = quantity;
        this.isDelete = isDelete;
        this.watch = watch;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(String datePayment) {
        this.datePayment = datePayment;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public Watch getWatch() {
        return watch;
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
