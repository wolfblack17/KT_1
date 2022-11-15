package com.example.kt_1;

public class CongAn {
    private String Ten;
    private String CapBac;
    private String NoiCongTac;
    private  int Hinh;

    public CongAn(String ten, String capBac, String noiCongTac, int hinh) {
        Ten = ten;
        CapBac = capBac;
        NoiCongTac = noiCongTac;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getCapBac() {
        return CapBac;
    }

    public void setCapBac(String capBac) {
        CapBac = capBac;
    }

    public String getNoiCongTac() {
        return NoiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        NoiCongTac = noiCongTac;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
