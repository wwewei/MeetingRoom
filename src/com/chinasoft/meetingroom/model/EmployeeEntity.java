package com.chinasoft.meetingroom.model;

/**
 * Created by wei on 15/6/2.
 */
public class EmployeeEntity {
    private Integer employeeId;
    private String employeeName;
    private String userName;
    private String userPwd;
    private String phone;
    private String email;
    private Integer employeeStatus;
    private String remark;
    private DepartmentEntity departmentByDepartmentId;
    private RoleEntity roleByRoleid;


    public EmployeeEntity() {}

    public EmployeeEntity(String employeeName, String userName,
                          String userPwd, String phone, String email,
                          DepartmentEntity departmentByDepartmentId
                          ) {
        RoleEntity role = new RoleEntity();
        role.setRoleId(2);
        this.employeeName = employeeName;
        this.userName = userName;
        this.userPwd = userPwd;
        this.phone = phone;
        this.email = email;
        this.employeeStatus = 0;
        this.remark = "";
        this.departmentByDepartmentId = departmentByDepartmentId;
        this.roleByRoleid = role;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(Integer employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity that = (EmployeeEntity) o;

        if (employeeId != null ? !employeeId.equals(that.employeeId) : that.employeeId != null) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPwd != null ? !userPwd.equals(that.userPwd) : that.userPwd != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (employeeStatus != null ? !employeeStatus.equals(that.employeeStatus) : that.employeeStatus != null)
            return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId != null ? employeeId.hashCode() : 0;
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPwd != null ? userPwd.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (employeeStatus != null ? employeeStatus.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    public DepartmentEntity getDepartmentByDepartmentId() {
        return departmentByDepartmentId;
    }

    public void setDepartmentByDepartmentId(DepartmentEntity departmentByDepartmentId) {
        this.departmentByDepartmentId = departmentByDepartmentId;
    }

    public RoleEntity getRoleByRoleid() {
        return roleByRoleid;
    }

    public void setRoleByRoleid(RoleEntity roleByRoleid) {
        this.roleByRoleid = roleByRoleid;
    }
}
