package com.whiteplanet.mapper.model;

public class BankcardBin {
    private String id;

    private String bankId;

    private String bankName;

    private String cardType;

    private Integer binStat;

    private String cardName;

    private String bankLink;

    private String cardBin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public Integer getBinStat() {
        return binStat;
    }

    public void setBinStat(Integer binStat) {
        this.binStat = binStat;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getBankLink() {
        return bankLink;
    }

    public void setBankLink(String bankLink) {
        this.bankLink = bankLink == null ? null : bankLink.trim();
    }

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin == null ? null : cardBin.trim();
    }
}