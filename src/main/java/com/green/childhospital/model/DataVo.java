package com.green.childhospital.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.ToString;

@ToString
public class DataVo {
    private String sigunNm;
    private String sigunCd;
    private String facltNm;
    private String telNo;
    private String appontDate;
    private String dataStdDate;
    private String refineLotNoAddr;
    private String refineRoadNmAddr;
    private String refineZipCd;
    private double refineLng; //경도
    private double refineLat; //위도

    @JsonGetter("sigunNm")
    public String getSigunNm() {
        return sigunNm;
    }

    @JsonSetter("SIGUN_NM")
    public void setSigunNm(String sigunNm) {
        this.sigunNm = sigunNm;
    }

    @JsonGetter("sigunCd")
    public String getSigunCd() {
        return sigunCd;
    }

    @JsonSetter("SIGUN_CD")
    public void setSigunCd(String sigunCd) {
        this.sigunCd = sigunCd;
    }

    @JsonGetter("facltNm")
    public String getFacltNm() {
        return facltNm;
    }

    @JsonSetter("FACLT_NM")
    public void setFacltNm(String facltNm) {
        this.facltNm = facltNm;
    }

    @JsonGetter("telNo")
    public String getTelNo() {
        return telNo;
    }

    @JsonSetter("TELNO")
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @JsonGetter("appontDate")
    public String getAppontDate() {
        return appontDate;
    }

    @JsonSetter("APPONT_DE")
    public void setAppontDate(String appontDate) {
        this.appontDate = appontDate;
    }

    @JsonGetter("dataStdDate")
    public String getDataStdDate() {
        return dataStdDate;
    }

    @JsonSetter("DATA_STD_DE")
    public void setDataStdDate(String dataStdDate) {
        this.dataStdDate = dataStdDate;
    }

    @JsonGetter("refineLotNoAddr")
    public String getRefineLotNoAddr() {
        return refineLotNoAddr;
    }

    @JsonSetter("REFINE_LOTNO_ADDR")
    public void setRefineLotNoAddr(String refineLotNoAddr) {
        this.refineLotNoAddr = refineLotNoAddr;
    }

    @JsonGetter("refineRoadNmAddr")
    public String getRefineRoadNmAddr() {
        return refineRoadNmAddr;
    }

    @JsonSetter("REFINE_ROADNM_ADDR")
    public void setRefineRoadNmAddr(String refineRoadNmAddr) {
        this.refineRoadNmAddr = refineRoadNmAddr;
    }

    @JsonGetter("refineZipCd")
    public String getRefineZipCd() {
        return refineZipCd;
    }

    @JsonSetter("REFINE_ZIP_CD")
    public void setRefineZipCd(String refineZipCd) {
        this.refineZipCd = refineZipCd;
    }

    @JsonGetter("refineLng")
    public double getRefineLng() {
        return refineLng;
    }

    @JsonSetter("REFINE_WGS84_LOGT")
    public void setRefineLng(double refineLng) {
        this.refineLng = refineLng;
    }

    @JsonGetter("refineLat")
    public double getRefineLat() {
        return refineLat;
    }

    @JsonSetter("REFINE_WGS84_LAT")
    public void setRefineLat(double refineLat) {
        this.refineLat = refineLat;
    }
}
