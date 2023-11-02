package practice.bank_account.model;

public class BankAccount {
    // Polja klasa
    private long id;// nomer s cheta ,unikalen
    private String owner;// vladeelic scheta
    private String bankName;// nosvanie banka
    private int branch;// nomer feliala
    private double balance; // tekuschi balans

    // tip schota, valuta takiee polja toje polesnie u neobchadimi
    // adresse und telifone, vosrast >18,
    // pasportnie dannie

    // kanstruktor(i) klassa

    // konstruktar na vse polja
    public BankAccount(long id, String owner, String bankName, int branch, double balance) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }
    // konstruktar bes polja balans,klient bes bolansa

    public BankAccount(long id, String owner, String bankName, int branch) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        balance = 0.0;
    }
    //konstruckter klient bes imeni

    public BankAccount(long id, String bankName, int branch, double balance) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
        owner = "Anonimus";
    }
    // konstruktor ne polni, Anonimnii i bes balansa


    public BankAccount(long id, String bankName, int branch) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
    }

    public void display() {
        System.out.println("acc: " + id + ", owner: " + owner + ", bank: " + bankName + ", balance: " + balance);
    }

    // getteri setori
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 1 otvechaet polojit dengi na schet
    public boolean diposit(double sum) {
        balance = balance + sum;
        return true;
    }


    // snjat dengi so scheta
    public boolean withdraw(double sum) {
        if (sum <= balance) {
            balance = balance - sum;
            return true;
        }

        return false;
    }
}
