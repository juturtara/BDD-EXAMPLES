package com.capg.log4.ProjectLog4j;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger logger = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
       logger.info( "Hello Tara!" );
    }
}
