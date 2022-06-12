/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.example.testcontainers.db.Indexes;
import org.jooq.example.testcontainers.db.Keys;
import org.jooq.example.testcontainers.db.Public;
import org.jooq.example.testcontainers.db.tables.records.StoreRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Store extends TableImpl<StoreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.store</code>
     */
    public static final Store STORE = new Store();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoreRecord> getRecordType() {
        return StoreRecord.class;
    }

    /**
     * The column <code>public.store.store_id</code>.
     */
    public final TableField<StoreRecord, Long> STORE_ID = createField(DSL.name("store_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.store.manager_staff_id</code>.
     */
    public final TableField<StoreRecord, Long> MANAGER_STAFF_ID = createField(DSL.name("manager_staff_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.store.address_id</code>.
     */
    public final TableField<StoreRecord, Long> ADDRESS_ID = createField(DSL.name("address_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.store.last_update</code>.
     */
    public final TableField<StoreRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    private Store(Name alias, Table<StoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private Store(Name alias, Table<StoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.store</code> table reference
     */
    public Store(String alias) {
        this(DSL.name(alias), STORE);
    }

    /**
     * Create an aliased <code>public.store</code> table reference
     */
    public Store(Name alias) {
        this(alias, STORE);
    }

    /**
     * Create a <code>public.store</code> table reference
     */
    public Store() {
        this(DSL.name("store"), null);
    }

    public <O extends Record> Store(Table<O> child, ForeignKey<O, StoreRecord> key) {
        super(child, key, STORE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_UNQ_MANAGER_STAFF_ID);
    }

    @Override
    public Identity<StoreRecord, Long> getIdentity() {
        return (Identity<StoreRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<StoreRecord> getPrimaryKey() {
        return Keys.STORE_PKEY;
    }

    @Override
    public List<UniqueKey<StoreRecord>> getKeys() {
        return Arrays.<UniqueKey<StoreRecord>>asList(Keys.STORE_PKEY);
    }

    @Override
    public List<ForeignKey<StoreRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StoreRecord, ?>>asList(Keys.STORE__STORE_MANAGER_STAFF_ID_FKEY, Keys.STORE__STORE_ADDRESS_ID_FKEY);
    }

    private transient Staff _staff;
    private transient Address _address;

    public Staff staff() {
        if (_staff == null)
            _staff = new Staff(this, Keys.STORE__STORE_MANAGER_STAFF_ID_FKEY);

        return _staff;
    }

    public Address address() {
        if (_address == null)
            _address = new Address(this, Keys.STORE__STORE_ADDRESS_ID_FKEY);

        return _address;
    }

    @Override
    public Store as(String alias) {
        return new Store(DSL.name(alias), this);
    }

    @Override
    public Store as(Name alias) {
        return new Store(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Store rename(String name) {
        return new Store(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Store rename(Name name) {
        return new Store(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, Long, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
