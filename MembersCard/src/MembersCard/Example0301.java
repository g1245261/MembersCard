package MembersCard;

public class Example0301 {

	public static void main(String[] args) {
		MembersCard m1;
		m1 = new MembersCard();
		m1.memberId = 1;
		m1.name = "山下";
		m1.points = 100;
		
		System.out.println("会員番号は" + m1.memberId + "番");
		System.out.println("会員氏名は" + m1.name);
		System.out.println("累計ポイントは" + m1.points + "点です.");

	}

}
