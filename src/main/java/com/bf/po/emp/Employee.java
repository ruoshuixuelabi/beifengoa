package com.bf.po.emp;
import java.io.Serializable;
import com.bf.po.dep.Department;
import com.bf.po.user.User;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Employee implements Serializable {
    private int emp_id;
    private String emp_name;
    private String emp_sn;
    private String emp_sex;
    private String emp_address;
    private String emp_phone;
    private String emp_job;
    private String emp_img;
    private Department dep;
    private int flag;
    private User user;
}
