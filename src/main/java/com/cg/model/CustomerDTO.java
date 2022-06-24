package com.cg.model;

public class CustomerDTO {

    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private Long provinceId;
    private String provinceName;


    public CustomerDTO() {
    }

    public CustomerDTO(Long id, String fullName, String email, String phone, Long provinceId, String provinceName) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.provinceId = provinceId;
        this.provinceName = provinceName;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", provinceId='" + provinceId + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
