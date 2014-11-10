package MembersCard;

public class MembersCard {
	/**
	 * 会員番号
	 */
	int memberId;
	/**
	 * 氏名
	 */
	String name;
	/**
	 * 累計ポイント
	 */
	int points;
	/**
	 * 会員データの閲覧
	 */
	void show(){
		System.out.println("会員番号は" + memberId + "番");
		System.out.println("氏名は" + name);
		System.out.println("累計ポイントは" + points + "点です.");
	}
}
