package com.ipcount.core.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "clients")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "hosts", nullable = false, columnDefinition = "char")
    private String hosts;
    @Column(name = "ipaddress", nullable = false, columnDefinition = "char")
    private String ipAddress;
    @Column(name = "mac", nullable = false, columnDefinition = "char")
    private String mac;
    @Column(name = "rule", nullable = false)
    private Integer rule;
    @Column(name = "i", nullable = false, columnDefinition = "char")
    private String i;
    @Column(name = "status", nullable = false)
    private Integer status;
    @Column(name = "tplane", nullable = false)
    private Integer tPlane;
    @Column(name = "name", nullable = false, columnDefinition = "char")
    private String name;
    @Column(name = "phone", nullable = false, columnDefinition = "char")
    private String phone;
    @Column(name = "sms", nullable = false, columnDefinition = "char")
    private String sms;
    @Column(name = "address", nullable = false, columnDefinition = "char")
    private String address;
    @Column(name = "streetname", nullable = false, columnDefinition = "char")
    private String streetName;
    @Column(name = "housenumber", nullable = false, columnDefinition = "char")
    private String houseNumber;
    @Column(name = "flatnumber", nullable = false, columnDefinition = "char")
    private String flatNumber;
    @Column(name = "mail", nullable = false, columnDefinition = "char")
    private String mail;
    @Column(name = "password", nullable = false, columnDefinition = "char")
    private String password;
    @Column(name = "balance", nullable = false)
    private Double balance;
    @Column(name = "speedin", nullable = false)
    private Integer speedIn;
    @Column(name = "speedout", nullable = false)
    private Integer speedOut;
    @Column(name = "speedloc", nullable = false)
    private Integer speedLoc;
    @Column(name = "date", nullable = false)
    private Date date;
    @Column(name = "ndog", nullable = false)
    private Integer nDog;
    @Column(name = "groupc", nullable = false)
    private Integer groupC;
    @Column(name = "statusp", nullable = false)
    private Integer statusP;
    @Column(name = "macr", nullable = false)
    private Integer macR;
    @Column(name = "ruler", nullable = false)
    private Integer ruleR;
    @Column(name = "speedinr", nullable = false)
    private Integer speedInR;
    @Column(name = "speedoutr", nullable = false)
    private Integer speedOutR;
    @Column(name = "speedlocr", nullable = false)
    private Integer speedLocR;
    @Column(name = "tools", nullable = false, columnDefinition = "char")
    private String tools;

    public ClientEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public Integer getRule() {
        return rule;
    }

    public void setRule(Integer rule) {
        this.rule = rule;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer gettPlane() {
        return tPlane;
    }

    public void settPlane(Integer tPlane) {
        this.tPlane = tPlane;
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

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getSpeedIn() {
        return speedIn;
    }

    public void setSpeedIn(Integer speedIn) {
        this.speedIn = speedIn;
    }

    public Integer getSpeedOut() {
        return speedOut;
    }

    public void setSpeedOut(Integer speedOut) {
        this.speedOut = speedOut;
    }

    public Integer getSpeedLoc() {
        return speedLoc;
    }

    public void setSpeedLoc(Integer speedLoc) {
        this.speedLoc = speedLoc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getnDog() {
        return nDog;
    }

    public void setnDog(Integer nDog) {
        this.nDog = nDog;
    }

    public Integer getGroupC() {
        return groupC;
    }

    public void setGroupC(Integer groupC) {
        this.groupC = groupC;
    }

    public Integer getStatusP() {
        return statusP;
    }

    public void setStatusP(Integer statusP) {
        this.statusP = statusP;
    }

    public Integer getMacR() {
        return macR;
    }

    public void setMacR(Integer macR) {
        this.macR = macR;
    }

    public Integer getRuleR() {
        return ruleR;
    }

    public void setRuleR(Integer ruleR) {
        this.ruleR = ruleR;
    }

    public Integer getSpeedInR() {
        return speedInR;
    }

    public void setSpeedInR(Integer speedInR) {
        this.speedInR = speedInR;
    }

    public Integer getSpeedOutR() {
        return speedOutR;
    }

    public void setSpeedOutR(Integer speedOutR) {
        this.speedOutR = speedOutR;
    }

    public Integer getSpeedLocR() {
        return speedLocR;
    }

    public void setSpeedLocR(Integer speedLocR) {
        this.speedLocR = speedLocR;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "ClientEntity{" +
                "id=" + id +
                ", hosts='" + hosts + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", mac='" + mac + '\'' +
                ", rule=" + rule +
                ", i='" + i + '\'' +
                ", status=" + status +
                ", tPlane=" + tPlane +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", sms='" + sms + '\'' +
                ", address='" + address + '\'' +
                ", streetName='" + streetName + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", speedIn=" + speedIn +
                ", speedOut=" + speedOut +
                ", speedLoc=" + speedLoc +
                ", date=" + date +
                ", nDog=" + nDog +
                ", groupC=" + groupC +
                ", statusP=" + statusP +
                ", macR=" + macR +
                ", ruleR=" + ruleR +
                ", speedInR=" + speedInR +
                ", speedOutR=" + speedOutR +
                ", speedLocR=" + speedLocR +
                ", tools=" + tools +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity that = (ClientEntity) o;

        if (!id.equals(that.id)) return false;
        if (!hosts.equals(that.hosts)) return false;
        if (!ipAddress.equals(that.ipAddress)) return false;
        if (!mac.equals(that.mac)) return false;
        if (!rule.equals(that.rule)) return false;
        if (!i.equals(that.i)) return false;
        if (!status.equals(that.status)) return false;
        if (!tPlane.equals(that.tPlane)) return false;
        if (!name.equals(that.name)) return false;
        if (!phone.equals(that.phone)) return false;
        if (!sms.equals(that.sms)) return false;
        if (!address.equals(that.address)) return false;
        if (!streetName.equals(that.streetName)) return false;
        if (!houseNumber.equals(that.houseNumber)) return false;
        if (!flatNumber.equals(that.flatNumber)) return false;
        if (!mail.equals(that.mail)) return false;
        if (!password.equals(that.password)) return false;
        if (!balance.equals(that.balance)) return false;
        if (!speedIn.equals(that.speedIn)) return false;
        if (!speedOut.equals(that.speedOut)) return false;
        if (!speedLoc.equals(that.speedLoc)) return false;
        if (!date.equals(that.date)) return false;
        if (!nDog.equals(that.nDog)) return false;
        if (!groupC.equals(that.groupC)) return false;
        if (!statusP.equals(that.statusP)) return false;
        if (!macR.equals(that.macR)) return false;
        if (!ruleR.equals(that.ruleR)) return false;
        if (!speedInR.equals(that.speedInR)) return false;
        if (!speedOutR.equals(that.speedOutR)) return false;
        if (!speedLocR.equals(that.speedLocR)) return false;
        return tools.equals(that.tools);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + hosts.hashCode();
        result = 31 * result + ipAddress.hashCode();
        result = 31 * result + mac.hashCode();
        result = 31 * result + rule.hashCode();
        result = 31 * result + i.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + tPlane.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + sms.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + streetName.hashCode();
        result = 31 * result + houseNumber.hashCode();
        result = 31 * result + flatNumber.hashCode();
        result = 31 * result + mail.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + balance.hashCode();
        result = 31 * result + speedIn.hashCode();
        result = 31 * result + speedOut.hashCode();
        result = 31 * result + speedLoc.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + nDog.hashCode();
        result = 31 * result + groupC.hashCode();
        result = 31 * result + statusP.hashCode();
        result = 31 * result + macR.hashCode();
        result = 31 * result + ruleR.hashCode();
        result = 31 * result + speedInR.hashCode();
        result = 31 * result + speedOutR.hashCode();
        result = 31 * result + speedLocR.hashCode();
        result = 31 * result + tools.hashCode();
        return result;
    }

    public static Builder builder() {

        return new ClientEntity().new Builder();
    }

    public class Builder {



        private Builder() {
        }

        public Builder setId(Integer id) {
            ClientEntity.this.id = id;
            return this;
        }

        public Builder setHosts(String hosts) {
            ClientEntity.this.hosts = hosts;
            return this;
        }
        public Builder setIpAddress(String ipAddress) {
            ClientEntity.this.ipAddress = ipAddress;
            return this;
        }

        public Builder setMac(String mac) {
           ClientEntity.this.mac = mac;
           return this;
        }

        public Builder setRule(Integer rule) {
            ClientEntity.this.rule = rule;
            return this;
        }

        public Builder setI(String i) {
            ClientEntity.this.i = i;
            return this;
        }

        public Builder setStatus(Integer status) {
            ClientEntity.this.status = status;
            return this;
        }

        public Builder settPlane(Integer tPlane) {
            ClientEntity.this.tPlane = tPlane;
            return this;
        }

        public Builder setName(String name) {
            ClientEntity.this.name = name;
            return this;
        }

        public Builder setPhone(String phone) {
            ClientEntity.this.phone = phone;
            return this;
        }

        public Builder setSms(String sms) {
            ClientEntity.this.sms = sms;
            return this;
        }

        public Builder setAddress(String address) {
            ClientEntity.this.address = address;
            return this;
        }

        public Builder setStreetName(String streetName) {
            ClientEntity.this.streetName = streetName;
            return this;
        }

        public Builder setHouseNumber(String houseNumber) {
            ClientEntity.this.houseNumber = houseNumber;
            return this;
        }

        public Builder setFlatNumber(String flatNumber) {
            ClientEntity.this.flatNumber = flatNumber;
            return this;
        }

        public Builder setMail(String mail) {
            ClientEntity.this.mail = mail;
            return this;
        }

        public Builder setPassword(String password) {
            ClientEntity.this.password = password;
            return this;
        }

        public Builder setBalance(Double balance) {
            ClientEntity.this.balance = balance;
            return this;
        }

        public Builder setSpeedIn(Integer speedIn) {
            ClientEntity.this.speedIn = speedIn;
            return this;
        }

        public Builder setSpeedOut(Integer speedOut) {
            ClientEntity.this.speedOut = speedOut;
            return this;
        }

        public Builder setSpeedLoc(Integer speedLoc) {
            ClientEntity.this.speedLoc = speedLoc;
            return this;
        }

        public Builder setDate(Date date) {
            ClientEntity.this.date = date;
            return this;
        }

        public Builder setnDog(Integer nDog) {
            ClientEntity.this.nDog = nDog;
            return this;
        }

        public Builder setGroupC(Integer groupC) {
            ClientEntity.this.groupC = groupC;
            return this;
        }

        public Builder setStatusP(Integer statusP) {
            ClientEntity.this.statusP = statusP;
            return this;
        }

        public Builder setMacR(Integer macR) {
            ClientEntity.this.macR = macR;
            return this;
        }

        public Builder setRuleR(Integer ruleR) {
            ClientEntity.this.ruleR = ruleR;
            return this;
        }

        public Builder setSpeedInR(Integer speedInR) {
            ClientEntity.this.speedInR = speedInR;
            return this;
        }

        public Builder setSpeedOutR(Integer speedOutR) {
            ClientEntity.this.speedOutR = speedOutR;
            return this;
        }

        public Builder setSpeedLocR(Integer speedLocR) {
            ClientEntity.this.speedLocR = speedLocR;
            return this;
        }

        public Builder setTools(String tools) {
            ClientEntity.this.tools = tools;
            return this;
        }
        public ClientEntity build() {
            return ClientEntity.this;
        }
    }

    public ClientEntity(Integer id, String hosts, String ipAddress, String mac, Integer rule, String i, Integer status, Integer tPlane, String name, String phone, String sms, String address, String streetName, String houseNumber, String flatNumber, String mail, String password, Double balance, Integer speedIn, Integer speedOut, Integer speedLoc, Date date, Integer nDog, Integer groupC, Integer statusP, Integer macR, Integer ruleR, Integer speedInR, Integer speedOutR, Integer speedLocR, String tools) {
        this.id = id;
        this.hosts = hosts;
        this.ipAddress = ipAddress;
        this.mac = mac;
        this.rule = rule;
        this.i = i;
        this.status = status;
        this.tPlane = tPlane;
        this.name = name;
        this.phone = phone;
        this.sms = sms;
        this.address = address;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.mail = mail;
        this.password = password;
        this.balance = balance;
        this.speedIn = speedIn;
        this.speedOut = speedOut;
        this.speedLoc = speedLoc;
        this.date = date;
        this.nDog = nDog;
        this.groupC = groupC;
        this.statusP = statusP;
        this.macR = macR;
        this.ruleR = ruleR;
        this.speedInR = speedInR;
        this.speedOutR = speedOutR;
        this.speedLocR = speedLocR;
        this.tools = tools;
    }
}
