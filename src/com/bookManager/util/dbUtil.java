package com.bookManager.util;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * ���ݿ⹤����
 * @author 22276
 *
 */
public class dbUtil {

	private String dbUrl="jdbc:mysql://localhost:3306/bookMagager";
	private String dbUserName = "root";
	private String dbPassword = "clq758748";
	private String jdbcName = "com.mysql.cj.jdbc.Driver";
	
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws Exception
	 */
	public Connection getConnection() throws Exception{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;  
	}

	/**
	 * �ر�����
	 * @param con
	 * @throws Exception
	 */
	public void closeConnection(Connection con) throws Exception{
		if(con!=null) {
			con.close();
		}
	}
	
	public static void main(String[] args) {
		dbUtil dbutil = new dbUtil();
		try {
			dbutil.getConnection();
			System.out.println("���ݿ����ӳɹ�");
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
	}
	
}
