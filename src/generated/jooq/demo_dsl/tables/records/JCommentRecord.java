/*
 * This file is generated by jOOQ.
 */
package jooq.demo_dsl.tables.records;


import java.time.LocalDateTime;

import jooq.demo_dsl.tables.JComment;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JCommentRecord extends UpdatableRecordImpl<JCommentRecord> implements Record9<Long, LocalDateTime, LocalDateTime, String, String, Integer, Long, Long, Long> {

    private static final long serialVersionUID = -1989251202;

    /**
     * Setter for <code>mydb.comment.comment_id</code>.
     */
    public JCommentRecord setCommentId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mydb.comment.comment_id</code>.
     */
    public Long getCommentId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>mydb.comment.created_date</code>.
     */
    public JCommentRecord setCreatedDate(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mydb.comment.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>mydb.comment.modified_date</code>.
     */
    public JCommentRecord setModifiedDate(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>mydb.comment.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>mydb.comment.contents</code>.
     */
    public JCommentRecord setContents(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>mydb.comment.contents</code>.
     */
    public String getContents() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mydb.comment.delete_yn</code>.
     */
    public JCommentRecord setDeleteYn(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>mydb.comment.delete_yn</code>.
     */
    public String getDeleteYn() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mydb.comment.depth</code>.
     */
    public JCommentRecord setDepth(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>mydb.comment.depth</code>.
     */
    public Integer getDepth() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mydb.comment.thread</code>.
     */
    public JCommentRecord setThread(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>mydb.comment.thread</code>.
     */
    public Long getThread() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>mydb.comment.board_id</code>.
     */
    public JCommentRecord setBoardId(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>mydb.comment.board_id</code>.
     */
    public Long getBoardId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>mydb.comment.user_id</code>.
     */
    public JCommentRecord setUserId(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>mydb.comment.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, LocalDateTime, LocalDateTime, String, String, Integer, Long, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, LocalDateTime, LocalDateTime, String, String, Integer, Long, Long, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return JComment.COMMENT.COMMENT_ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return JComment.COMMENT.CREATED_DATE;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return JComment.COMMENT.MODIFIED_DATE;
    }

    @Override
    public Field<String> field4() {
        return JComment.COMMENT.CONTENTS;
    }

    @Override
    public Field<String> field5() {
        return JComment.COMMENT.DELETE_YN;
    }

    @Override
    public Field<Integer> field6() {
        return JComment.COMMENT.DEPTH;
    }

    @Override
    public Field<Long> field7() {
        return JComment.COMMENT.THREAD;
    }

    @Override
    public Field<Long> field8() {
        return JComment.COMMENT.BOARD_ID;
    }

    @Override
    public Field<Long> field9() {
        return JComment.COMMENT.USER_ID;
    }

    @Override
    public Long component1() {
        return getCommentId();
    }

    @Override
    public LocalDateTime component2() {
        return getCreatedDate();
    }

    @Override
    public LocalDateTime component3() {
        return getModifiedDate();
    }

    @Override
    public String component4() {
        return getContents();
    }

    @Override
    public String component5() {
        return getDeleteYn();
    }

    @Override
    public Integer component6() {
        return getDepth();
    }

    @Override
    public Long component7() {
        return getThread();
    }

    @Override
    public Long component8() {
        return getBoardId();
    }

    @Override
    public Long component9() {
        return getUserId();
    }

    @Override
    public Long value1() {
        return getCommentId();
    }

    @Override
    public LocalDateTime value2() {
        return getCreatedDate();
    }

    @Override
    public LocalDateTime value3() {
        return getModifiedDate();
    }

    @Override
    public String value4() {
        return getContents();
    }

    @Override
    public String value5() {
        return getDeleteYn();
    }

    @Override
    public Integer value6() {
        return getDepth();
    }

    @Override
    public Long value7() {
        return getThread();
    }

    @Override
    public Long value8() {
        return getBoardId();
    }

    @Override
    public Long value9() {
        return getUserId();
    }

    @Override
    public JCommentRecord value1(Long value) {
        setCommentId(value);
        return this;
    }

    @Override
    public JCommentRecord value2(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public JCommentRecord value3(LocalDateTime value) {
        setModifiedDate(value);
        return this;
    }

    @Override
    public JCommentRecord value4(String value) {
        setContents(value);
        return this;
    }

    @Override
    public JCommentRecord value5(String value) {
        setDeleteYn(value);
        return this;
    }

    @Override
    public JCommentRecord value6(Integer value) {
        setDepth(value);
        return this;
    }

    @Override
    public JCommentRecord value7(Long value) {
        setThread(value);
        return this;
    }

    @Override
    public JCommentRecord value8(Long value) {
        setBoardId(value);
        return this;
    }

    @Override
    public JCommentRecord value9(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public JCommentRecord values(Long value1, LocalDateTime value2, LocalDateTime value3, String value4, String value5, Integer value6, Long value7, Long value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JCommentRecord
     */
    public JCommentRecord() {
        super(JComment.COMMENT);
    }

    /**
     * Create a detached, initialised JCommentRecord
     */
    public JCommentRecord(Long commentId, LocalDateTime createdDate, LocalDateTime modifiedDate, String contents, String deleteYn, Integer depth, Long thread, Long boardId, Long userId) {
        super(JComment.COMMENT);

        set(0, commentId);
        set(1, createdDate);
        set(2, modifiedDate);
        set(3, contents);
        set(4, deleteYn);
        set(5, depth);
        set(6, thread);
        set(7, boardId);
        set(8, userId);
    }
}
