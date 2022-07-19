package ListEnum;

public enum Agama {
    KRISTEN("KR", "Kristen"),
    ISLAM("I", "Islam"),
    HINDU("H", "Hindu"),
    BUDDHA("B", "Buddha"),
    KONGHUCU("K", "Konghucu");

    private String labelLengkap;
    private String labelInisial;

    Agama(String labelInisial, String labelLengkap){
        this.labelInisial = labelInisial;
        this.labelLengkap = labelLengkap;
    }

    public String getLabelInisial(){
        return  labelInisial;
    }
    public String getLabelLengkap(){
        return labelLengkap;
    }
}
