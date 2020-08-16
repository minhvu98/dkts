package com.example.dto;

public class UserDto {
	private int id;
	private String fullname;
	private String email;
	private String sex;
	private String birthday;
	private String identification;
	private String math_mark;
	private String english_mark;
	private String literature_mark;
	private String total_mark;
	private String six_academic;
	private String sevent_academic;
	private String eight_academic;
	private String nine_academic;
	private String six_conduct;
	private String sevent_conduct;
	private String eight_conduct;
	private String nine_conduct;
	public UserDto() {}
	public UserDto(int id, String fullname, String email, String sex, String birthday, String identification,
			String math_mark, String english_mark, String literature_mark, String total_mark, String six_academic,
			String sevent_academic, String eight_academic, String nine_academic, String six_conduct,
			String sevent_conduct, String eight_conduct, String nine_conduct) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.sex = sex;
		this.birthday = birthday;
		this.identification = identification;
		this.math_mark = math_mark;
		this.english_mark = english_mark;
		this.literature_mark = literature_mark;
		this.total_mark = total_mark;
		this.six_academic = six_academic;
		this.sevent_academic = sevent_academic;
		this.eight_academic = eight_academic;
		this.nine_academic = nine_academic;
		this.six_conduct = six_conduct;
		this.sevent_conduct = sevent_conduct;
		this.eight_conduct = eight_conduct;
		this.nine_conduct = nine_conduct;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public String getMath_mark() {
		return math_mark;
	}
	public void setMath_mark(String math_mark) {
		this.math_mark = math_mark;
	}
	public String getEnglish_mark() {
		return english_mark;
	}
	public void setEnglish_mark(String english_mark) {
		this.english_mark = english_mark;
	}
	public String getLiterature_mark() {
		return literature_mark;
	}
	public void setLiterature_mark(String literature_mark) {
		this.literature_mark = literature_mark;
	}
	public String getTotal_mark() {
		return total_mark;
	}
	public void setTotal_mark(String total_mark) {
		this.total_mark = total_mark;
	}
	public String getSix_academic() {
		return six_academic;
	}
	public void setSix_academic(String six_academic) {
		this.six_academic = six_academic;
	}
	public String getSevent_academic() {
		return sevent_academic;
	}
	public void setSevent_academic(String sevent_academic) {
		this.sevent_academic = sevent_academic;
	}
	public String getEight_academic() {
		return eight_academic;
	}
	public void setEight_academic(String eight_academic) {
		this.eight_academic = eight_academic;
	}
	public String getNine_academic() {
		return nine_academic;
	}
	public void setNine_academic(String nine_academic) {
		this.nine_academic = nine_academic;
	}
	public String getSix_conduct() {
		return six_conduct;
	}
	public void setSix_conduct(String six_conduct) {
		this.six_conduct = six_conduct;
	}
	public String getSevent_conduct() {
		return sevent_conduct;
	}
	public void setSevent_conduct(String sevent_conduct) {
		this.sevent_conduct = sevent_conduct;
	}
	public String getEight_conduct() {
		return eight_conduct;
	}
	public void setEight_conduct(String eight_conduct) {
		this.eight_conduct = eight_conduct;
	}
	public String getNine_conduct() {
		return nine_conduct;
	}
	public void setNine_conduct(String nine_conduct) {
		this.nine_conduct = nine_conduct;
	}
	
}
