package com.hfad.inventoryappfinalproject;

public class Parts {

    private String part_num;
    private String part_name;
    private String part_qoh;

    public Parts(String part_num, String part_name, String part_qoh){
        this.part_num = part_num;
        this.part_name = part_name;
        this.part_qoh = part_qoh;
    }

    public String getPartNum() {
        return part_num;
    }

    public void setPartNum(String part_num) {
        this.part_num = part_num;
    }

    public String getPartName() {
        return part_name;
    }

    public void setPartName(String part_name) {
        this.part_name = part_name;
    }

    public String getQOH() { return part_qoh; }

    public void setQOH(String part_qoh) {
        this.part_qoh = part_qoh;
    }

//    public String toString(){
//        return "Parts{" +
//                "partid=" + part_num +
//                ", partname='" + part_name + '\'' +
//                ", qoh='" + part_qoh + '\''+
//                '}';
//    }
}
