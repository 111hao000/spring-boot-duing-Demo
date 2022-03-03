package com.duing;

import com.duing.bean.Guest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class GuestValidTest {
    public static void main(String[] args) {
        //通过validator创建一个validator实例 (普通模式)
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        //快速失败模式
        Validator validationFastFail = Validation.byDefaultProvider().configure()
                .addProperty("hibernate.validator.fail_fast","true")
                .buildValidatorFactory().getValidator();
        //创建不符合要求的bean
        Guest guest = new Guest("","zsq");
        //开始验证接收验证结果
        Set<ConstraintViolation<Guest>> violationSet =  validator.validate(guest);

        for (ConstraintViolation validation : violationSet){
            System.out.println(validation.getPropertyPath()+"--"+validation.getMessage());
        }

        Set<ConstraintViolation<Guest>> validationFastFailSet =  validationFastFail.validate(guest);
        for (ConstraintViolation validation : validationFastFailSet){
            System.out.println(validation.getPropertyPath()+"--"+validation.getMessage());
        }
    }
}
