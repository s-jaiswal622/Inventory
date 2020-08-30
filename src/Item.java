class Item 
{
    private String pid;
    private int quant;
    private int breakage;
    private int net;

    public Item(String pid, int quant, int breakage, int net) {
        this.pid = pid;
        this.quant = quant;
        this.breakage = breakage;
        this.net = net;
    }

    public String getPid() {
        return pid;
    }

    public int getQuant() {
        return quant;
    }

    public int getBreakage() {
        return breakage;
    }

    public int getNet() {
        return net;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public void setBreakage(int breakage) {
        this.breakage = breakage;
    }

    public void setNet(int net) {
        this.net = net;
    }
    
}
