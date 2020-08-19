package com.nvke.catalogQuery.bean;

public class Catalog {
    private  int bookId;
    private String bookName;
    private  int ql_id;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQl_id() {
        return ql_id;
    }

    public void setQl_id(int ql_id) {
        this.ql_id = ql_id;
    }

    @Override
    public String toString() {
        return "{ bookId=" + bookId + ", bookName='" + bookName + '\'' + ", ql_id=" + ql_id + '}';
    }
}
