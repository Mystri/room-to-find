package com.room.backend.data._generated.entity;

import java.io.Serializable;
import java.util.Date;

public class UsersPref implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_pref.u_id
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    private Integer u_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_pref.major
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    private String major;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_pref.social_rating
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    private Integer social_rating;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_pref.pet_rating
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    private Integer pet_rating;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_pref.cook_rating
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    private Integer cook_rating;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_pref.noise_tolerance
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    private Integer noise_tolerance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_pref.create_time
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    private Date create_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users_pref.last_modify
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    private Date last_modify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users_pref
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_pref.u_id
     *
     * @return the value of users_pref.u_id
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public Integer getU_id() {
        return u_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_pref.u_id
     *
     * @param u_id the value for users_pref.u_id
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_pref.major
     *
     * @return the value of users_pref.major
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public String getMajor() {
        return major;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_pref.major
     *
     * @param major the value for users_pref.major
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_pref.social_rating
     *
     * @return the value of users_pref.social_rating
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public Integer getSocial_rating() {
        return social_rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_pref.social_rating
     *
     * @param social_rating the value for users_pref.social_rating
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public void setSocial_rating(Integer social_rating) {
        this.social_rating = social_rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_pref.pet_rating
     *
     * @return the value of users_pref.pet_rating
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public Integer getPet_rating() {
        return pet_rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_pref.pet_rating
     *
     * @param pet_rating the value for users_pref.pet_rating
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public void setPet_rating(Integer pet_rating) {
        this.pet_rating = pet_rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_pref.cook_rating
     *
     * @return the value of users_pref.cook_rating
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public Integer getCook_rating() {
        return cook_rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_pref.cook_rating
     *
     * @param cook_rating the value for users_pref.cook_rating
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public void setCook_rating(Integer cook_rating) {
        this.cook_rating = cook_rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_pref.noise_tolerance
     *
     * @return the value of users_pref.noise_tolerance
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public Integer getNoise_tolerance() {
        return noise_tolerance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_pref.noise_tolerance
     *
     * @param noise_tolerance the value for users_pref.noise_tolerance
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public void setNoise_tolerance(Integer noise_tolerance) {
        this.noise_tolerance = noise_tolerance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_pref.create_time
     *
     * @return the value of users_pref.create_time
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_pref.create_time
     *
     * @param create_time the value for users_pref.create_time
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users_pref.last_modify
     *
     * @return the value of users_pref.last_modify
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public Date getLast_modify() {
        return last_modify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users_pref.last_modify
     *
     * @param last_modify the value for users_pref.last_modify
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    public void setLast_modify(Date last_modify) {
        this.last_modify = last_modify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_pref
     *
     * @mbg.generated Tue Mar 21 06:11:41 CDT 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", u_id=").append(u_id);
        sb.append(", major=").append(major);
        sb.append(", social_rating=").append(social_rating);
        sb.append(", pet_rating=").append(pet_rating);
        sb.append(", cook_rating=").append(cook_rating);
        sb.append(", noise_tolerance=").append(noise_tolerance);
        sb.append(", create_time=").append(create_time);
        sb.append(", last_modify=").append(last_modify);
        sb.append("]");
        return sb.toString();
    }
}