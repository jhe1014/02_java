package book.dao;


public class ConnectionInfo {
	// DB 커넥션 정보를 static 상수로 선언
		public static final String URL = "jdbc:oracle:thin:@//localhost:1521/XE";
		public static final String MY_SQL_URL = "jdbc:mysql://127.0.0.1:3306/emp?serverTimezone=Asia/Seoul";
		public static final String USER = "SCOTT";
		public static final String PASSWORD = "TIGER";
		public static final String DRIVER = "oracle.jdbc.OracleDriver";
		public static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
}
