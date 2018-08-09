package com.abi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name="USERMODEL")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid")
	private int userid;
	private Date date;
    private String Name;
	private String Sample_type;
	private String Weight;
	private String Gold;
	private String Silver;
	private String Copper;
	private String Zinc;
	private String KDM;
	private String Nickel;
	private String Iridium;
	private String Tin;
	private String Iron;
	private String Rhodium;
	private String Others;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSample_type() {
		return Sample_type;
	}
	public void setSample_type(String sample_type) {
		Sample_type = sample_type;
	}
	public String getWeight() {
		return Weight;
	}
	public void setWeight(String weight) {
		Weight = weight;
	}
	public String getGold() {
		return Gold;
	}
	public void setGold(String gold) {
		Gold = gold;
	}
	public String getSilver() {
		return Silver;
	}
	public void setSilver(String silver) {
		Silver = silver;
	}
	public String getCopper() {
		return Copper;
	}
	public void setCopper(String copper) {
		Copper = copper;
	}
	public String getZinc() {
		return Zinc;
	}
	public void setZinc(String zinc) {
		Zinc = zinc;
	}
	public String getKDM() {
		return KDM;
	}
	public void setKDM(String kDM) {
		KDM = kDM;
	}
	public String getNickel() {
		return Nickel;
	}
	public void setNickel(String nickel) {
		Nickel = nickel;
	}
	public String getIridium() {
		return Iridium;
	}
	public void setIridium(String iridium) {
		Iridium = iridium;
	}
	public String getTin() {
		return Tin;
	}
	public void setTin(String tin) {
		Tin = tin;
	}
	public String getIron() {
		return Iron;
	}
	public void setIron(String iron) {
		Iron = iron;
	}
	public String getRhodium() {
		return Rhodium;
	}
	public void setRhodium(String rhodium) {
		Rhodium = rhodium;
	}
	public String getOthers() {
		return Others;
	}
	public void setOthers(String others) {
		Others = others;
	}

}
