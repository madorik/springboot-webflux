/*
 * This file is generated by jOOQ.
 */
package jooq.demo_dsl.tables.records;


import java.time.LocalDateTime;

import jooq.demo_dsl.tables.JBoard;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JBoardRecord extends UpdatableRecordImpl<JBoardRecord> implements Record9<Long, LocalDateTime, LocalDateTime, String, String, Integer, String, Long, Long> {

    private static final long serialVersionUID = -1158577213;

    /**
     * Setter for <code>mydb.board.board_id</code>.
     */
    public JBoardRecord setBoardId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mydb.board.board_id</code>.
     */
    public Long getBoardId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>mydb.board.created_date</code>.
     */
    public JBoardRecord setCreatedDate(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mydb.board.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>mydb.board.modified_date</code>.
     */
    public JBoardRecord setModifiedDate(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>mydb.board.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>mydb.board.contents</code>.
     */
    public JBoardRecord setContents(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>mydb.board.contents</code>.
     */
    public String getContents() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mydb.board.delete_yn</code>.
     */
    public JBoardRecord setDeleteYn(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>mydb.board.delete_yn</code>.
     */
    public String getDeleteYn() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mydb.board.depth</code>.
     */
    public JBoardRecord setDepth(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>mydb.board.depth</code>.
     */
    public Integer getDepth() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mydb.board.subject</code>.
     */
    public JBoardRecord setSubject(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>mydb.board.subject</code>.
     */
    public String getSubject() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mydb.board.thread</code>.
     */
    public JBoardRecord setThread(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>mydb.board.thread</code>.
     */
    public Long getThread() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>mydb.board.user_id</code>.
     */
    public JBoardRecord setUserId(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>mydb.board.user_id</code>.
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
    public Row9<Long, LocalDateTime, LocalDateTime, String, String, Integer, String, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, LocalDateTime, LocalDateTime, String, String, Integer, String, Long, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return JBoard.BOARD.BOARD_ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return JBoard.BOARD.CREATED_DATE;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return JBoard.BOARD.MODIFIED_DATE;
    }

    @Override
    public Field<String> field4() {
        return JBoard.BOARD.CONTENTS;
    }

    @Override
    public Field<String> field5() {
        return JBoard.BOARD.DELETE_YN;
    }

    @Override
    public Field<Integer> field6() {
        return JBoard.BOARD.DEPTH;
    }

    @Override
    public Field<String> field7() {
        return JBoard.BOARD.SUBJECT;
    }

    @Override
    public Field<Long> field8() {
        return JBoard.BOARD.THREAD;
    }

    @Override
    public Field<Long> field9() {
        return JBoard.BOARD.USER_ID;
    }

    @Override
    public Long component1() {
        return getBoardId();
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
    public String component7() {
        return getSubject();
    }

    @Override
    public Long component8() {
        return getThread();
    }

    @Override
    public Long component9() {
        return getUserId();
    }

    @Override
    public Long value1() {
        return getBoardId();
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
    public String value7() {
        return getSubject();
    }

    @Override
    public Long value8() {
        return getThread();
    }

    @Override
    public Long value9() {
        return getUserId();
    }

    @Override
    public JBoardRecord value1(Long value) {
        setBoardId(value);
        return this;
    }

    @Override
    public JBoardRecord value2(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public JBoardRecord value3(LocalDateTime value) {
        setModifiedDate(value);
        return this;
    }

    @Override
    public JBoardRecord value4(String value) {
        setContents(value);
        return this;
    }

    @Override
    public JBoardRecord value5(String value) {
        setDeleteYn(value);
        return this;
    }

    @Override
    public JBoardRecord value6(Integer value) {
        setDepth(value);
        return this;
    }

    @Override
    public JBoardRecord value7(String value) {
        setSubject(value);
        return this;
    }

    @Override
    public JBoardRecord value8(Long value) {
        setThread(value);
        return this;
    }

    @Override
    public JBoardRecord value9(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public JBoardRecord values(Long value1, LocalDateTime value2, LocalDateTime value3, String value4, String value5, Integer value6, String value7, Long value8, Long value9) {
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
     * Create a detached JBoardRecord
     */
    public JBoardRecord() {
        super(JBoard.BOARD);
    }

    /**
     * Create a detached, initialised JBoardRecord
     */
    public JBoardRecord(Long boardId, LocalDateTime createdDate, LocalDateTime modifiedDate, String contents, String deleteYn, Integer depth, String subject, Long thread, Long userId) {
        super(JBoard.BOARD);

        set(0, boardId);
        set(1, createdDate);
        set(2, modifiedDate);
        set(3, contents);
        set(4, deleteYn);
        set(5, depth);
        set(6, subject);
        set(7, thread);
        set(8, userId);
    }
}
