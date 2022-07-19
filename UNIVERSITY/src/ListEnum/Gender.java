package ListEnum;

public enum Gender {
    PRIA("L", "Laki-laki"),
    WANITA("P", "Perempuan");

    private String labelLengkap;
    private String labelInisial;

    Gender(String labelInisial, String labelLengkap){
        this.labelInisial = labelInisial;
        this.labelLengkap = labelLengkap;
    }

    public String getLabelInisial(){
        return  labelInisial;
    }
    public String getLabelLengkap(){
        return  labelLengkap;
    }
}
