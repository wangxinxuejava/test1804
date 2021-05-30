package com.bjpowernode.settings.domain;

import org.springframework.stereotype.Component;

@Component
public class User {
    public User() {
    }

    /**
     *  时间
     *  yyyy-MM-dd  10位字符
     *
     *  yyyy-MM-dd HH:mm:ss 19位字符\
     *
     *   关于登录的信息
     *   通过判断User.getName 和User.getLoginPwd 来判断登录信息
     *   sql   select loginAct,loginPwd from tbl_user where longAct=#{longAct} and loginPwd=#{loginPwd}
     *   这个时候只能说明账号密码正确 但是不能确定是否是垃圾数据导致
     *   进而
     *   继续判断
     *   lochState 失效时间
     *   allowIps  允许访问的地址
     *   expireTime  失效时间
     *
     */
   private String id ;//主键
   private String loginAct; //登录账号
   private String name;//用户真实姓名
   private String loginPwd ; //登录密码
   private String email;//用户名真实邮箱
   private String expireTime; //失效时间
   private String lockState; //锁定状态  0为锁定 1位启用
   private String deptno ; //部门编号
   private String allowIps ; //允许访问的地址
   private String createTime ; //创建时间
   private String createBy;//创建人
   private String editTime; //修改时间
   private String editBy;//修改人

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginAct() {
        return loginAct;
    }

    public void setLoginAct(String loginAct) {
        this.loginAct = loginAct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getLockState() {
        return lockState;
    }

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getAllowIps() {
        return allowIps;
    }

    public void setAllowIps(String allowIps) {
        this.allowIps = allowIps;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", loginAct='" + loginAct + '\'' +
                ", name='" + name + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", email='" + email + '\'' +
                ", expireTime='" + expireTime + '\'' +
                ", lockState='" + lockState + '\'' +
                ", deptno='" + deptno + '\'' +
                ", allowIps='" + allowIps + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createBy='" + createBy + '\'' +
                ", editTime='" + editTime + '\'' +
                ", editBy='" + editBy + '\'' +
                '}';
    }
}
