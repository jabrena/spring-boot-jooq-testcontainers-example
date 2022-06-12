/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables.records;


import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.example.testcontainers.db.tables.StaffList;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StaffListRecord extends TableRecordImpl<StaffListRecord> implements Record8<Long, String, String, String, String, String, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.staff_list.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.staff_list.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.staff_list.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.staff_list.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.staff_list.address</code>.
     */
    public void setAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.staff_list.address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.staff_list.zip code</code>.
     */
    public void setZipCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.staff_list.zip code</code>.
     */
    public String getZipCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.staff_list.phone</code>.
     */
    public void setPhone(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.staff_list.phone</code>.
     */
    public String getPhone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.staff_list.city</code>.
     */
    public void setCity(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.staff_list.city</code>.
     */
    public String getCity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.staff_list.country</code>.
     */
    public void setCountry(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.staff_list.country</code>.
     */
    public String getCountry() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.staff_list.sid</code>.
     */
    public void setSid(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.staff_list.sid</code>.
     */
    public Long getSid() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, String, String, String, String, String, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, String, String, String, String, String, String, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return StaffList.STAFF_LIST.ID;
    }

    @Override
    public Field<String> field2() {
        return StaffList.STAFF_LIST.NAME;
    }

    @Override
    public Field<String> field3() {
        return StaffList.STAFF_LIST.ADDRESS;
    }

    @Override
    public Field<String> field4() {
        return StaffList.STAFF_LIST.ZIP_CODE;
    }

    @Override
    public Field<String> field5() {
        return StaffList.STAFF_LIST.PHONE;
    }

    @Override
    public Field<String> field6() {
        return StaffList.STAFF_LIST.CITY;
    }

    @Override
    public Field<String> field7() {
        return StaffList.STAFF_LIST.COUNTRY;
    }

    @Override
    public Field<Long> field8() {
        return StaffList.STAFF_LIST.SID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getAddress();
    }

    @Override
    public String component4() {
        return getZipCode();
    }

    @Override
    public String component5() {
        return getPhone();
    }

    @Override
    public String component6() {
        return getCity();
    }

    @Override
    public String component7() {
        return getCountry();
    }

    @Override
    public Long component8() {
        return getSid();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getAddress();
    }

    @Override
    public String value4() {
        return getZipCode();
    }

    @Override
    public String value5() {
        return getPhone();
    }

    @Override
    public String value6() {
        return getCity();
    }

    @Override
    public String value7() {
        return getCountry();
    }

    @Override
    public Long value8() {
        return getSid();
    }

    @Override
    public StaffListRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public StaffListRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public StaffListRecord value3(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public StaffListRecord value4(String value) {
        setZipCode(value);
        return this;
    }

    @Override
    public StaffListRecord value5(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public StaffListRecord value6(String value) {
        setCity(value);
        return this;
    }

    @Override
    public StaffListRecord value7(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public StaffListRecord value8(Long value) {
        setSid(value);
        return this;
    }

    @Override
    public StaffListRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StaffListRecord
     */
    public StaffListRecord() {
        super(StaffList.STAFF_LIST);
    }

    /**
     * Create a detached, initialised StaffListRecord
     */
    public StaffListRecord(Long id, String name, String address, String zipCode, String phone, String city, String country, Long sid) {
        super(StaffList.STAFF_LIST);

        setId(id);
        setName(name);
        setAddress(address);
        setZipCode(zipCode);
        setPhone(phone);
        setCity(city);
        setCountry(country);
        setSid(sid);
    }
}
