public class Girl {
    //-------------------------------------------------------------------------
    private String name;
    private int diamondCarat;
    private int diamondValue;
    //-------------------------------------------------------------------------
    public Girl(){
        name = null;
        diamondCarat = 0;
        diamondValue = 0;
    }
    //-------------------------------------------------------------------------
    public Girl(String name) {
        this();
        this.name = name;
    }
    //-------------------------------------------------------------------------
    public String toString() {
        if (diamondCarat == 0) {
            return (name + " has no best friend");
        } else if (diamondValue == 0) {
            return (name + " has no best friend");
        } else {
            return (name + " has a diamond, " + diamondCarat + " carats, worth $" + diamondValue + ".0");
        }
    }
    //-------------------------------------------------------------------------
    public void setCarat(int newCarat){
        if(newCarat > diamondCarat){
            diamondCarat = newCarat;
        }
    }
    //-------------------------------------------------------------------------
    public void setValue(int newValue){
        if(newValue > diamondValue){
            diamondValue = newValue;
            System.out.println("Woohoo, the girl took the diamond");
        }
        else{
            System.out.println("Aaargh, the diamond was rejected");
        }
    }
    //-------------------------------------------------------------------------
    public int getCarat(){
        return(diamondCarat);

    }
    public int getValue(){
        return(diamondValue);
    }
}
