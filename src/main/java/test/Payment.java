package test;

public class Payment {
    private String name;
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public Payment(String name, String cardNumber, String expiryDate, String cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return cvv;
    }
}

