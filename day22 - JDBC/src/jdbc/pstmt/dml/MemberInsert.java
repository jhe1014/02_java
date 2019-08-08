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

public class MemberInsert {

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
			String sql = "INSERT INTO MEMBER(MEMBER_ID, MEMBER_NAME)"
					+ "	  VALUES (?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			// 수정자 메소드로 id, name 필드 입력
			// 아래 구문의 값들에는 수정자 메소드로 세팅
			Member member = new Member();
			member.setMemberId("M010");
			member.setMemberName("홍길동");
			
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberName());
			
			//pstmt.setString(1, "M010");
			//pstmt.setString(2, "홍길동");
			
			// 4. 쿼리 실행 : ?가 사전에 모두 매핑된 pstmt 객체를 통해서 쿼리 실행
			int addCnt = pstmt.executeUpdate();
			
			// 5. DML 결과 처리 : executeUpdate()를 통해서 몇 건의 데이터가 처리되었는지를 나타내는 정수 리턴값으로 처리 가능
			if(addCnt > 0) {
				System.out.printf("%d 행이 입력되었습니다.%n", addCnt);
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
