package spring5Demo5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import spring5Demo5.dao.UserDao;

/**
 * @author TJ
 * @create 2021-0917 14:58
 */

@Service
@Transactional(transactionManager = "transactionManager",propagation = Propagation.REQUIRED)
public class UserService {
    //注入DAO
    @Autowired
    private UserDao userDao;

    public void accountMoney(){

            //1.开启事务

            //2.进行业务操作
            userDao.reduceMoney();



            userDao.addMoney();

            //3.没有发生异常，提交事务


            //4.出现异常，事务回滚


    }
}
