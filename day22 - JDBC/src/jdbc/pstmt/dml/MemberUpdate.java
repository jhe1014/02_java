package jdbc.pstmt.dml;

import static jdbc.ConnectionInfo.DRIVER;
import static jdbc.ConnectionInfo.PASSWORD;
import static jdbc.ConnectionInfo.URL;
import static jdbc.ConnectionInfo.USER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.pstmt.dql.Member;

public class MemberUpdate {

	public static void main(String[] args) {
		// 필요한 변수들 먼저 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			
			// 2. 커넥션 맺기
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 쿼리 준비
			String sql = "UPDATE MEMBER m"
					 +   "	SET m.phone = ?"
					 +   "	  , m.major = ? "		     
					 +	 "	  , m.birth_month = ?"	     
					 +	 "    , m.gender = ?"
					 +   " WHERE m.member_id = ?";
			pstmt = conn.prepareStatement(sql);
			
			// ? 매핑
			Member member = new Member();
			member.setPhone("0000");
			member.setMajor("도술");
			member.setBirthMonth(12);
			member.setGender("M");
			member.setMemberId("M010");
			
			pstmt.setString(1, member.getPhone());
			pstmt.setString(2, member.getMajor());
			pstmt.setInt(3, member.getBirthMonth());
			pstmt.setString(4, member.getGender());
			pstmt.setString(5, member.getMemberId());
			
//			pstmt.setString(1, "0000");
//			pstmt.setString(2, "도술");
//			pstmt.setInt(3, 12);
//			pstmt.setString(4, "M");
//			pstmt.setString(5, "M010");
			
			// 4. 쿼리 실행 : ?가 사전에 모두 매핑된 pstmt 객체를 통해서 쿼리 실행
			int UpdCnt = pstmt.executeUpdate();
			
			// 5. DML 결과 처리 : executeUpdate()를 통해서 몇 건의 데이터가 처리되었는지를 나타내는 정수 리턴값으로 처리 가능
			if(UpdCnt > 0) {
				System.out.printf("%d 행이 수정되었습니다.%n", UpdCnt);
			}
		} catch (SQLException e){
			System.err.println("SQL 구문 오류!" + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 오류!" + e.getMessage());
			e.printStackTrace();
		} finally {
			// 6. 자원 해제
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.err.println("자원해제 오류!" + e.getMessage());
				e.printStackTrace();
			}
		}	
	}

}
