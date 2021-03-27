/*
 * This file is generated by jOOQ.
 */
package jooq.demo_dsl.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import jooq.demo_dsl.JMydb;
import jooq.demo_dsl.Keys;
import jooq.demo_dsl.tables.records.JCommentRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JComment extends TableImpl<JCommentRecord> {

    private static final long serialVersionUID = 352938443;

    /**
     * The reference instance of <code>mydb.comment</code>
     */
    public static final JComment COMMENT = new JComment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JCommentRecord> getRecordType() {
        return JCommentRecord.class;
    }

    /**
     * The column <code>mydb.comment.comment_id</code>.
     */
    public final TableField<JCommentRecord, Long> COMMENT_ID = createField(DSL.name("comment_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>mydb.comment.created_date</code>.
     */
    public final TableField<JCommentRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>mydb.comment.modified_date</code>.
     */
    public final TableField<JCommentRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>mydb.comment.contents</code>.
     */
    public final TableField<JCommentRecord, String> CONTENTS = createField(DSL.name("contents"), org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>mydb.comment.delete_yn</code>.
     */
    public final TableField<JCommentRecord, String> DELETE_YN = createField(DSL.name("delete_yn"), org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.field("'N'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mydb.comment.depth</code>.
     */
    public final TableField<JCommentRecord, Integer> DEPTH = createField(DSL.name("depth"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mydb.comment.thread</code>.
     */
    public final TableField<JCommentRecord, Long> THREAD = createField(DSL.name("thread"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>mydb.comment.board_id</code>.
     */
    public final TableField<JCommentRecord, Long> BOARD_ID = createField(DSL.name("board_id"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>mydb.comment.user_id</code>.
     */
    public final TableField<JCommentRecord, Long> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>mydb.comment</code> table reference
     */
    public JComment() {
        this(DSL.name("comment"), null);
    }

    /**
     * Create an aliased <code>mydb.comment</code> table reference
     */
    public JComment(String alias) {
        this(DSL.name(alias), COMMENT);
    }

    /**
     * Create an aliased <code>mydb.comment</code> table reference
     */
    public JComment(Name alias) {
        this(alias, COMMENT);
    }

    private JComment(Name alias, Table<JCommentRecord> aliased) {
        this(alias, aliased, null);
    }

    private JComment(Name alias, Table<JCommentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> JComment(Table<O> child, ForeignKey<O, JCommentRecord> key) {
        super(child, key, COMMENT);
    }

    @Override
    public Schema getSchema() {
        return JMydb.MYDB;
    }

    @Override
    public Identity<JCommentRecord, Long> getIdentity() {
        return Keys.IDENTITY_COMMENT;
    }

    @Override
    public UniqueKey<JCommentRecord> getPrimaryKey() {
        return Keys.KEY_COMMENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<JCommentRecord>> getKeys() {
        return Arrays.<UniqueKey<JCommentRecord>>asList(Keys.KEY_COMMENT_PRIMARY);
    }

    @Override
    public List<ForeignKey<JCommentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JCommentRecord, ?>>asList(Keys.FKLIJ9OOR1NAV89JEAT35S6KBP1, Keys.FK8KCUM44FVPUPYW6F5BACCX25C);
    }

    public JBoard board() {
        return new JBoard(this, Keys.FKLIJ9OOR1NAV89JEAT35S6KBP1);
    }

    public JUser user() {
        return new JUser(this, Keys.FK8KCUM44FVPUPYW6F5BACCX25C);
    }

    @Override
    public JComment as(String alias) {
        return new JComment(DSL.name(alias), this);
    }

    @Override
    public JComment as(Name alias) {
        return new JComment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JComment rename(String name) {
        return new JComment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JComment rename(Name name) {
        return new JComment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, LocalDateTime, LocalDateTime, String, String, Integer, Long, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
