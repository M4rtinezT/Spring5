package spring5Demo4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import spring5Demo4.entity.Book;

import java.util.List;

/**
 * @author TJ
 * @create 2021-0915 19:13
 */

@Repository
public class BookDaoImpl implements BookDao{

    //注入JDBCTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加的方法
    @Override
    public void add(Book book) {
        //创建SQL语句
        String sql = "insert into t_book values(?,?,?)" ;
        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUserName(), book.getUstatus());

    }

    //修改的方法
    @Override
    public void update(Book book) {
        //创建SQL语句
        String sql = "update t_book set username = ? ,ustatus = ? where user_id =?" ;
        int update = jdbcTemplate.update(sql,book.getUserName(), book.getUstatus(), book.getUserId());

    }

    //删除的方法
    @Override
    public void delete(Book book) {
        //创建SQL语句
        String sql = "delete from t_book  where user_id =?" ;
        int update = jdbcTemplate.update(sql,book.getUserId());
    }

    //查询返回值
    @Override
    public int selectCount() {
        //创建SQL语句
        String sql = "select count(*) from t_book" ;
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    //查询返回对象
    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where user_id = ?";
        //调用方法
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    //查询返回集合
    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        //调用方法
        List<Book> book = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return book;
    }

    //批量添加
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql ="insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
    }

    //批量修改
    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql ="update t_book set username = ? ,ustatus = ? where user_id =?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
    }

    //批量删除
    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql ="delete from t_book where user_id =?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
    }
}
