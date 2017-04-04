package com.ipcount.core.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "clients")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "hosts", nullable = false)
    private String hosts;
    @Column(name = "ipaddress", nullable = false)
    private String ipaddress;
    @Column(name = "mac", nullable = false)
    private String mac;
    @Column(name = "rule", nullable = false)
    private int rule;
    @Column(name = "i", nullable = false)
    private String i;
    @Column(name = "status", nullable = false)
    private int status;
    @Column(name = "tplane", nullable = false)
    private int tplane;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "sms", nullable = false)
    private String sms;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "streetname", nullable = false)
    private String streetname;
    @Column(name = "housenumber", nullable = false)
    private String housenumber;
    @Column(name = "flatnumber", nullable = false)
    private String flatnumber;
    @Column(name = "mail", nullable = false)
    private String mail;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "balance", nullable = false)
    private double balance;
    @Column(name = "speedin", nullable = false)
    private int speedin;
    @Column(name = "speedout", nullable = false)
    private int speedout;
    @Column(name = "speedloc", nullable = false)
    private int speedloc;
    @Column(name = "date", nullable = false)
    private Date date;
    @Column(name = "ndog", nullable = false)
    private int ndog;
    @Column(name = "groupc", nullable = false)
    private int groupc;
    @Column(name = "statusp", nullable = false)
    private int statusp;
    @Column(name = "macr", nullable = false)
    private int macr;
    @Column(name = "ruler", nullable = false)
    private int ruler;
    @Column(name = "speedinr", nullable = false)
    private int speedinr;
    @Column(name = "speedoutr", nullable = false)
    private int speedoutr;
    @Column(name = "speedlocr", nullable = false)
    private int speedlocr;
    @Column(name = "tools", nullable = false)
    private int tools;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getRule() {
        return rule;
    }

    public void setRule(int rule) {
        this.rule = rule;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTplane() {
        return tplane;
    }

    public void setTplane(int tplane) {
        this.tplane = tplane;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getFlatnumber() {
        return flatnumber;
    }

    public void setFlatnumber(String flatnumber) {
        this.flatnumber = flatnumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getSpeedin() {
        return speedin;
    }

    public void setSpeedin(int speedin) {
        this.speedin = speedin;
    }

    public int getSpeedout() {
        return speedout;
    }

    public void setSpeedout(int speedout) {
        this.speedout = speedout;
    }

    public int getSpeedloc() {
        return speedloc;
    }

    public void setSpeedloc(int speedloc) {
        this.speedloc = speedloc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNdog() {
        return ndog;
    }

    public void setNdog(int ndog) {
        this.ndog = ndog;
    }

    public int getGroupc() {
        return groupc;
    }

    public void setGroupc(int groupc) {
        this.groupc = groupc;
    }

    public int getStatusp() {
        return statusp;
    }

    public void setStatusp(int statusp) {
        this.statusp = statusp;
    }

    public int getMacr() {
        return macr;
    }

    public void setMacr(int macr) {
        this.macr = macr;
    }

    public int getRuler() {
        return ruler;
    }

    public void setRuler(int ruler) {
        this.ruler = ruler;
    }

    public int getSpeedinr() {
        return speedinr;
    }

    public void setSpeedinr(int speedinr) {
        this.speedinr = speedinr;
    }

    public int getSpeedoutr() {
        return speedoutr;
    }

    public void setSpeedoutr(int speedoutr) {
        this.speedoutr = speedoutr;
    }

    public int getSpeedlocr() {
        return speedlocr;
    }

    public void setSpeedlocr(int speedlocr) {
        this.speedlocr = speedlocr;
    }

    public int getTools() {
        return tools;
    }

    public void setTools(int tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "ClientEntity{" +
                "id=" + id +
                ", hosts='" + hosts + '\'' +
                ", ipaddress='" + ipaddress + '\'' +
                ", mac='" + mac + '\'' +
                ", rule=" + rule +
                ", i='" + i + '\'' +
                ", status=" + status +
                ", tplane=" + tplane +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", sms='" + sms + '\'' +
                ", address='" + address + '\'' +
                ", streetname='" + streetname + '\'' +
                ", housenumber='" + housenumber + '\'' +
                ", flatnumber='" + flatnumber + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", speedin=" + speedin +
                ", speedout=" + speedout +
                ", speedloc=" + speedloc +
                ", date='" + date + '\'' +
                ", ndog=" + ndog +
                ", groupc=" + groupc +
                ", statusp=" + statusp +
                ", macr=" + macr +
                ", ruler=" + ruler +
                ", speedinr=" + speedinr +
                ", speedoutr=" + speedoutr +
                ", speedlocr=" + speedlocr +
                ", tools=" + tools +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity that = (ClientEntity) o;

        if (id != that.id) return false;
        if (rule != that.rule) return false;
        if (status != that.status) return false;
        if (tplane != that.tplane) return false;
        if (Double.compare(that.balance, balance) != 0) return false;
        if (speedin != that.speedin) return false;
        if (speedout != that.speedout) return false;
        if (speedloc != that.speedloc) return false;
        if (ndog != that.ndog) return false;
        if (groupc != that.groupc) return false;
        if (statusp != that.statusp) return false;
        if (macr != that.macr) return false;
        if (ruler != that.ruler) return false;
        if (speedinr != that.speedinr) return false;
        if (speedoutr != that.speedoutr) return false;
        if (speedlocr != that.speedlocr) return false;
        if (tools != that.tools) return false;
        if (!hosts.equals(that.hosts)) return false;
        if (!ipaddress.equals(that.ipaddress)) return false;
        if (!mac.equals(that.mac)) return false;
        if (!i.equals(that.i)) return false;
        if (!name.equals(that.name)) return false;
        if (!phone.equals(that.phone)) return false;
        if (!sms.equals(that.sms)) return false;
        if (!address.equals(that.address)) return false;
        if (!streetname.equals(that.streetname)) return false;
        if (!housenumber.equals(that.housenumber)) return false;
        if (!flatnumber.equals(that.flatnumber)) return false;
        if (!mail.equals(that.mail)) return false;
        if (!password.equals(that.password)) return false;
        return date.equals(that.date);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + hosts.hashCode();
        result = 31 * result + ipaddress.hashCode();
        result = 31 * result + mac.hashCode();
        result = 31 * result + rule;
        result = 31 * result + i.hashCode();
        result = 31 * result + status;
        result = 31 * result + tplane;
        result = 31 * result + name.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + sms.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + streetname.hashCode();
        result = 31 * result + housenumber.hashCode();
        result = 31 * result + flatnumber.hashCode();
        result = 31 * result + mail.hashCode();
        result = 31 * result + password.hashCode();
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + speedin;
        result = 31 * result + speedout;
        result = 31 * result + speedloc;
        result = 31 * result + date.hashCode();
        result = 31 * result + ndog;
        result = 31 * result + groupc;
        result = 31 * result + statusp;
        result = 31 * result + macr;
        result = 31 * result + ruler;
        result = 31 * result + speedinr;
        result = 31 * result + speedoutr;
        result = 31 * result + speedlocr;
        result = 31 * result + tools;
        return result;
    }
}
