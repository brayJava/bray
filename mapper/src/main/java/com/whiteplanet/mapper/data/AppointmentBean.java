package com.whiteplanet.mapper.data;

/**
 *
 *
 * Created by ningchengzeng on 2017/7/17.
 */
public class AppointmentBean {

    private String id;
    private String faceimage;
    private String lastDateTime;
    private String name;
    private String pname;
    private Integer age;
    private boolean sex;
    private String phone;
    private String title;
    private String illness;
    private int status;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFaceimage() {
		return faceimage;
	}

	public void setFaceimage(String faceimage) {
		this.faceimage = faceimage;
	}

	public String getLastDateTime() {
		return lastDateTime;
	}

	public void setLastDateTime(String lastDateTime) {
		this.lastDateTime = lastDateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
