package sprint3_watch.model;
import sprint3_watch.model.decentralization.User;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private boolean isDelete;
    private String birthday;
    private int gender;
    private String idCard;
    private String email;
    private String address;
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "order_detail", joinColumns = @JoinColumn(name = "orderDetail"),
//            inverseJoinColumns = @JoinColumn(name = "order_detail_id"))
//    private List<OrderDetail> orderDetails;

    public Customer() {
    }

    public Customer(int id, String name, boolean isDelete,
                    String birthday, int gender, String idCard,
                    String email, String address, String phoneNumber, User user) {
        this.id = id;
        this.name = name;
        this.isDelete = isDelete;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.user = user;
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

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
