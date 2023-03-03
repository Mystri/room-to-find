package com.room.backend.data.entity;

import java.io.Serializable;
import java.util.Date;

public class UsersInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_info.id
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_info.login_id
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    private Integer login_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_info.name
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_info.birthday
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_info.gender
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_info.mobile_phone
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    private Integer mobile_phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_info.email
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_info.create_time
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    private Date create_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_info.last_modify
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    private Date last_modify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_info
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_info.id
     *
     * @return the value of users_info.id
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_info.id
     *
     * @param id the value for users_info.id
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_info.login_id
     *
     * @return the value of users_info.login_id
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public Integer getLogin_id() {
        return login_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_info.login_id
     *
     * @param login_id the value for users_info.login_id
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public void setLogin_id(Integer login_id) {
        this.login_id = login_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_info.name
     *
     * @return the value of users_info.name
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_info.name
     *
     * @param name the value for users_info.name
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_info.birthday
     *
     * @return the value of users_info.birthday
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_info.birthday
     *
     * @param birthday the value for users_info.birthday
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_info.gender
     *
     * @return the value of users_info.gender
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_info.gender
     *
     * @param gender the value for users_info.gender
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_info.mobile_phone
     *
     * @return the value of users_info.mobile_phone
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public Integer getMobile_phone() {
        return mobile_phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_info.mobile_phone
     *
     * @param mobile_phone the value for users_info.mobile_phone
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public void setMobile_phone(Integer mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_info.email
     *
     * @return the value of users_info.email
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_info.email
     *
     * @param email the value for users_info.email
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_info.create_time
     *
     * @return the value of users_info.create_time
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_info.create_time
     *
     * @param create_time the value for users_info.create_time
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_info.last_modify
     *
     * @return the value of users_info.last_modify
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public Date getLast_modify() {
        return last_modify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_info.last_modify
     *
     * @param last_modify the value for users_info.last_modify
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    public void setLast_modify(Date last_modify) {
        this.last_modify = last_modify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_info
     *
     * @mbg.generated Tue Aug 30 00:49:17 CDT 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", login_id=").append(login_id);
        sb.append(", name=").append(name);
        sb.append(", birthday=").append(birthday);
        sb.append(", gender=").append(gender);
        sb.append(", mobile_phone=").append(mobile_phone);
        sb.append(", email=").append(email);
        sb.append(", create_time=").append(create_time);
        sb.append(", last_modify=").append(last_modify);
        sb.append("]");
        return sb.toString();
    }
}