package spring5Demo5.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author TJ
 * @create 2021-0923 18:32
 */
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2!");
        log.warn("hello log4j2!");
    }
}
