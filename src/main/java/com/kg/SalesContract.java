package com.kg;

public class SalesContract {
    private String buyer;
    private String seller;
    private String discription;
    private int paymentAmount;

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public salesContract(){


    }

    @Override
    public String toString() {
        return "salesContract{" +
                "buyer='" + buyer + '\'' +
                ", seller='" + seller + '\'' +
                ", discription='" + discription + '\'' +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}


}
