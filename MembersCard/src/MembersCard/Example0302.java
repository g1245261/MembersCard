package MembersCard;

public class Example0302 {
	public static void main(String[] args){
		int points;
		MembersCard m1;
		m1 = new MembersCard();
		m1.init(1, "山下", 100);
		points = m1.usePoints(10);
		
		/*
		m1.setMemberId(1);
		m1.setName("山下");
		m1.addPoints(100);
		*/
		
		/*
		m1.memberId = 1;
		m1.name = "山下";
		m1.points = 100;
		*/
		
		m1.show();
		
		MembersCard m2;
		m2 = new MembersCard();
		m2.init(2, "山口", 200);
		points = m2.usePoints(300);
		m2.show();
	}
}
