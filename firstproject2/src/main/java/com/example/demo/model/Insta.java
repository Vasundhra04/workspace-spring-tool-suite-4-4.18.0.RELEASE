package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Instadetails")
public class Insta {
    @Id
    @Column(name="phno")
    private int phno;
    @Column(name="Privacc")
    private String privacc;
    @Column(name="Followers")
    private int followers;
    @Column(name="Following")
    private int following;
    @Column(name="Likes")
    private int likes;
    @Column(name="Bft")
    private String bft;
 
	public Insta() {
		super();
	}
//	public Insta(int phno, String emailid, String password, String username) {
//		super();
//		this.phno = phno;
//		this.emailid = emailid;
//		this.password = password;
//		this.username = username;
//	}
	@Column(name="Emailid")
    private String emailid;
    @Column(name="Password")
    private String password;
    @Column(name="Username")
    private String username;
    @Column(name="Pubacc")
    private String pubacc;
    public String getPubacc() {
		return pubacc;
	}
	public void setPubacc(String pubacc) {
		this.pubacc = pubacc;
	}
	public String getPrivacc() {
		return privacc;
	}
	public void setPrivacc(String privacc) {
		this.privacc = privacc;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	public int getFollowing() {
		return following;
	}
	public void setFollowing(int following) {
		this.following = following;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getBft() {
		return bft;
	}
	public void setBft(String bft) {
		this.bft = bft;
	}
	
    
    
    public int getPhno()
    {
    	return phno;
    }
    public void setPhno(int phno)
    {
    	 this.phno  = phno;
    }
    public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	   @Override
		public String toString() {
			return "Insta [phno=" + phno + ", emailid=" + emailid + ", password=" + password + ", username=" + username
					+ ", pubacc=" + pubacc + ", privacc=" + privacc + ", followers=" + followers + ", following="
					+ following + ", likes=" + likes + ", bft=" + bft + "]";
		}
	
}
