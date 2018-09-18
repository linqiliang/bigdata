package com.qiliang.b_di;

public class BookServiceImpl implements BookService {


    //private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void addBook() {
        this.bookDao.addBook();
    }
}
