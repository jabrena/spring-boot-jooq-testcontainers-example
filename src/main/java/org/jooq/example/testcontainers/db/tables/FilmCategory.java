/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.example.testcontainers.db.Keys;
import org.jooq.example.testcontainers.db.Public;
import org.jooq.example.testcontainers.db.tables.records.FilmCategoryRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmCategory extends TableImpl<FilmCategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.film_category</code>
     */
    public static final FilmCategory FILM_CATEGORY = new FilmCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmCategoryRecord> getRecordType() {
        return FilmCategoryRecord.class;
    }

    /**
     * The column <code>public.film_category.film_id</code>.
     */
    public final TableField<FilmCategoryRecord, Long> FILM_ID = createField(DSL.name("film_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.film_category.category_id</code>.
     */
    public final TableField<FilmCategoryRecord, Long> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.film_category.last_update</code>.
     */
    public final TableField<FilmCategoryRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    private FilmCategory(Name alias, Table<FilmCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private FilmCategory(Name alias, Table<FilmCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.film_category</code> table reference
     */
    public FilmCategory(String alias) {
        this(DSL.name(alias), FILM_CATEGORY);
    }

    /**
     * Create an aliased <code>public.film_category</code> table reference
     */
    public FilmCategory(Name alias) {
        this(alias, FILM_CATEGORY);
    }

    /**
     * Create a <code>public.film_category</code> table reference
     */
    public FilmCategory() {
        this(DSL.name("film_category"), null);
    }

    public <O extends Record> FilmCategory(Table<O> child, ForeignKey<O, FilmCategoryRecord> key) {
        super(child, key, FILM_CATEGORY);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<FilmCategoryRecord> getPrimaryKey() {
        return Keys.FILM_CATEGORY_PKEY;
    }

    @Override
    public List<UniqueKey<FilmCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<FilmCategoryRecord>>asList(Keys.FILM_CATEGORY_PKEY);
    }

    @Override
    public List<ForeignKey<FilmCategoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FilmCategoryRecord, ?>>asList(Keys.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY, Keys.FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY);
    }

    private transient Film _film;
    private transient Category _category;

    public Film film() {
        if (_film == null)
            _film = new Film(this, Keys.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY);

        return _film;
    }

    public Category category() {
        if (_category == null)
            _category = new Category(this, Keys.FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY);

        return _category;
    }

    @Override
    public FilmCategory as(String alias) {
        return new FilmCategory(DSL.name(alias), this);
    }

    @Override
    public FilmCategory as(Name alias) {
        return new FilmCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmCategory rename(String name) {
        return new FilmCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmCategory rename(Name name) {
        return new FilmCategory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
