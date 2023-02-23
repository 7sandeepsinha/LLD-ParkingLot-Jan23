package model;

import model.enums.TransactionStatus;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel {
    private Ticket ticket;
    private Date exitTime;
    private int amount;
    private Operator operator;
    private Gate exitGate;
    private List<Payment> payments;
    private TransactionStatus transactionStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public TransactionStatus getBillStatus() {
        return transactionStatus;
    }

    public void setBillStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
