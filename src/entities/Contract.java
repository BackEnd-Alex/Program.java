package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private List<Installments> installments = new ArrayList<>();

    public Contract(Integer number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }
    public DateTimeFormatter getFmt() {
        return fmt;
    }
    public void setFmt(DateTimeFormatter fmt) {
        this.fmt = fmt;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
    public List<Installments> getInstallments() {
        return installments;
    }

   }