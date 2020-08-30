
import java.sql.Timestamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
class Record {

    private String pid;
    private Timestamp date;
    private int quant;
    private int rate;
    private int total;

    public Record(String pid, Timestamp date, int quant, int rate, int total) {
        this.pid = pid;
        this.date = date;
        this.quant = quant;
        this.rate = rate;
        this.total = total;
    }
    
    public String getPid() {
        return pid;
    }

    public Timestamp getDate() {
        return date;
    }

    public int getQuant() {
        return quant;
    }

    public int getRate() {
        return rate;
    }

    public int getTotal() {
        return total;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
