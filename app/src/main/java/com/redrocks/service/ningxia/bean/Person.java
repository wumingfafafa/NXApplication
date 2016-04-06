/**
 * Person.java [V 1.0.0]
 * classes :　com.crayfish.json.Person
 * crayfish create at 2015-4-24 下午1:30:37
 */
package com.redrocks.service.ningxia.bean;

/**
 * com.crayfish.json.Person
 * @author crayfish   <br/>
 * create at 2015-4-24 下午1:30:37
 */
public class Person {


    /**
     * address : 宁波江东区
     * id : 1001
     * name : jack
     */

    private String address;
    private int id;
    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
