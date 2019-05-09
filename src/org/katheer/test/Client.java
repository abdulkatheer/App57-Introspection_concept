package org.katheer.test;

import org.katheer.beans.Employee;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

public class Client {
    public static void main(String[] args) throws Exception {
        BeanInfo empBean = Introspector.getBeanInfo(Employee.class);

        //Getting properties details
        PropertyDescriptor[] properties = empBean.getPropertyDescriptors();
        System.out.println("Properties Details");
        System.out.println("------------------");
        for (PropertyDescriptor property : properties) {
            System.out.println("Prop Name   : " + property.getName());
            System.out.println("Prop Type   : " + property.getPropertyType());
            System.out.println("Read Method : " + (property.getReadMethod()
                    == null ? "" : property.getReadMethod().getName()));
            System.out.println("Write Method: " + (property.getWriteMethod()
                    == null ? "" : property.getWriteMethod().getName()));
            System.out.println();
        }
        System.out.println("-------------------------------------------------");

        //Getting Method details
        System.out.println("Method Details");
        System.out.println("--------------");
        MethodDescriptor[] methods = empBean.getMethodDescriptors();
        for (MethodDescriptor method : methods) {
            System.out.println(method);
        }
        System.out.println("-------------------------------------------------");
    }
}
