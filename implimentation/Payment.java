class Payment {
    int paymentId;
    double amount;
    String method;
    String status;

    Booking booking;

    Payment(int paymentId, double amount, String method, String status, Booking booking) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.method = method;
        this.status = status;
        this.booking = booking;
    }

    void display() {
        System.out.println("\n===== Payment Details =====");
        System.out.println("Payment ID : " + paymentId);
        System.out.println("Amount     : ₹" + amount);
        System.out.println("Method     : " + method);
        System.out.println("Status     : " + status);
    }
}
