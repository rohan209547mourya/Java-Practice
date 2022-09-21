package problem3;

import java.util.Comparator;
import java.util.Date;

public class Members {
	
	private int memberId;
	private String membershipNo;
	private String memberName;
	private Date memberShipEndDate;
	
	
	public Members() {
		
		
	}
	
	public Members(int memberId, String membershipNo, String memberName, Date memberShipEndDate) {
		super();
		this.memberId = memberId;
		this.membershipNo = membershipNo;
		this.memberName = memberName;
		this.memberShipEndDate = memberShipEndDate;
	}
	
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMembershipNo() {
		return membershipNo;
	}
	public void setMembershipNo(String membershipNo) {
		this.membershipNo = membershipNo;
	}
	public String getMemberName() {
		return memberName;
	}
	
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	public Date getMemberShipEndDate() {
		return memberShipEndDate;
	}
	
	
	public void setMemberShipEndDate(Date memberShipEndDate) {
		
		this.memberShipEndDate = memberShipEndDate;
	}
	
	
	
}
