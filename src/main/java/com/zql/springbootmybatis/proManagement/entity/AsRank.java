package com.zql.springbootmybatis.proManagement.entity;

/**
 * As实体
 */
public class AsRank {
    private Integer id;
    private long customer;
    private long provider;
    private long peer;
    private long cone;
    private long apa;
    private long dark;
    private long alexa;
    private long darkAndAlexa;
    private long transit;
    private long betweeness;
    private long closeness;
    private long cluster;
    private long type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getCustomer() {
        return customer;
    }

    public void setCustomer(long customer) {
        this.customer = customer;
    }

    public long getProvider() {
        return provider;
    }

    public void setProvider(long provider) {
        this.provider = provider;
    }

    public long getPeer() {
        return peer;
    }

    public void setPeer(long peer) {
        this.peer = peer;
    }

    public long getCone() {
        return cone;
    }

    public void setCone(long cone) {
        this.cone = cone;
    }

    public long getApa() {
        return apa;
    }

    public void setApa(long apa) {
        this.apa = apa;
    }

    public long getDark() {
        return dark;
    }

    public void setDark(long dark) {
        this.dark = dark;
    }

    public long getAlexa() {
        return alexa;
    }

    public void setAlexa(long alexa) {
        this.alexa = alexa;
    }

    public long getDarkAndAlexa() {
        return darkAndAlexa;
    }

    public void setDarkAndAlexa(long darkAndAlexa) {
        this.darkAndAlexa = darkAndAlexa;
    }

    public long getTransit() {
        return transit;
    }

    public void setTransit(long transit) {
        this.transit = transit;
    }

    public long getBetweeness() {
        return betweeness;
    }

    public void setBetweeness(long betweeness) {
        this.betweeness = betweeness;
    }

    public long getCloseness() {
        return closeness;
    }

    public void setCloseness(long closeness) {
        this.closeness = closeness;
    }

    public long getCluster() {
        return cluster;
    }

    public void setCluster(long cluster) {
        this.cluster = cluster;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "As{" +
                "id=" + id +
                ", customer=" + customer +
                ", provider=" + provider +
                ", peer=" + peer +
                ", cone=" + cone +
                ", apa=" + apa +
                ", dark=" + dark +
                ", alexa=" + alexa +
                ", darkAndAlexa=" + darkAndAlexa +
                ", transit=" + transit +
                ", betweeness=" + betweeness +
                ", closeness=" + closeness +
                ", cluster=" + cluster +
                '}';
    }
}
