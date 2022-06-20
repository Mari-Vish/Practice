package main.java;

public class Delivery {
    private
    int IdDelivery;
    int Basket_total;
    int paymen_method;
    int Personal_data;
    String time;

    public int getIdDelivery() {
        return IdDelivery;
    }
    public int getBasket_total() {
        return Basket_total;
    }
    public int getpaymen_method() {
        return paymen_method;
    }
    public int getPersonal_data() {
        return Personal_data;
    }
    public String gettime() {
        return time;
    }

    public void setIdDelivery(int IdDelivery) {
        IdDelivery = IdDelivery;
    }

    public void setBasket_total(int basket_total) {
        Basket_total = basket_total;
    }

    public void setPaymen_method(int paymen_method) {
        this.paymen_method = paymen_method;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPersonal_data(int personal_data) {
        Personal_data = personal_data;
    }
}

