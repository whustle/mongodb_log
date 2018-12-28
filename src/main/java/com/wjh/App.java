package com.wjh;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = Logger.getLogger(App.class);

        for (int i = 0; i < 10000000; i++) {
            DBObject bson = new BasicDBObject();
            bson.put("name", "ryan"+i);
            logger.debug(bson);
        }
    }
}
