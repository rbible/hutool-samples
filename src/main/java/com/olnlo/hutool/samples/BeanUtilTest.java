package com.olnlo.hutool.samples;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONUtil;
import lombok.Data;
import org.junit.Test;

import java.beans.PropertyDescriptor;

public class BeanUtilTest extends BeanUtil {


    /**
     * 获取类的属性和属性的读写方法
     */
    @Test
    public void getPropertyDescriptors() {
        DemoBean demoBean = new DemoBean();
        PropertyDescriptor[] propertyDescriptors = getPropertyDescriptors(demoBean.getClass());
        System.out.println(JSONUtil.toJsonStr(propertyDescriptors));
    }

    /**
     * 判断类是否为 bean,判断方法：每个属性是否存在 set 方法
     */
    @Test
    public void isBean() {
        boolean result = isBean(DemoBean.class);
        System.out.println("isBean:" + result);
    }
}


@Data
class DemoBean {
    private int age;
    private String Name;
    private String desc;
}