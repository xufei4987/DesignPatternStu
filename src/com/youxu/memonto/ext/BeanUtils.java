package com.youxu.memonto.ext;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {
    //将Bean中的所有属性及值存入map中
    public static HashMap<String,Object> backupProp(Object bean){
        HashMap<String, Object> result = new HashMap<>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors){
                String fieldName = propertyDescriptor.getName();
                Method readMethod = propertyDescriptor.getReadMethod();
                Object fieldValue = readMethod.invoke(bean, new Object[]{});
                if (!fieldName.equalsIgnoreCase("class")) {
                    result.put(fieldName,fieldValue);
                }
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }

    //将map中的属性赋值给bean中的属性
    public static void restoreProp(Object bean, HashMap<String,Object> map){
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor descriptor : propertyDescriptors){
                if (!"class".equalsIgnoreCase(descriptor.getName())) {
                    Method writeMethod = descriptor.getWriteMethod();
                    writeMethod.invoke(bean,map.get(descriptor.getName()));
                }
            }

        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
