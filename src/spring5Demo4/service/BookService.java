package spring5Demo4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring5Demo4.dao.BookDao;
import spring5Demo4.entity.Book;

import java.util.List;

/**
 * @author TJ
 * @create 2021-0915 19:13
 */

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加数据到数据库的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //更改数据库数据的方法
    public void updateBook(Book book){
        bookDao.update(book);
    }

    //删除数据库数据的方法
    public void deleteBook(Book book){
        bookDao.delete(book);
    }

    //查询表记录的方法
    public int findCount(){
        return bookDao.selectCount();
    }

    //查询返回对象
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }

    //查询返回集合
    public List<Book> findAll(){
        return bookDao.findAllBook();
    }

    //批量添加的操作
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }

    //批量修改的操作
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }

    //批量删除的操作
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDelete(batchArgs);
    }
}
