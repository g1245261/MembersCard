package MembersCard;

public class MembersCard {
	/**
	 * 会員番号
	 */
	private int memberId;
	
	/**
	 * 氏名
	 */
	private String name;
	
	/**
	 * 累計ポイント
	 */
	private int points;
	
	/**
	 * 会員番号のカウント
	 */
	private static int numberOfMembers = 1;
	
	/**
	 * フィールドの初期化コンストラクタ
	 */
	public MembersCard(String name, int point){
		setMemberId(numberOfMembers);
		setName(name);
		addPoints(point);
		numberOfMembers++;
	}
	
	/**
	 * フィールドの初期化コンストラクタ
	 */
	public MembersCard(String name){
		setMemberId(numberOfMembers);
		setName(name);
		addPoints(50);
		numberOfMembers++;
	}
	
	/*
	/**
	 * フィールドの初期化メソッド
	 */
	/*
	void init(int memberId, String name, int point){
		setMemberId(memberId);
		setName(name);
		addPoints(point);
	}
	*/
	
	/**
	 * フィールドnameに代入するメソッド
	 */
	void setName(String name){
		this.name = name;
	}
	
	/**
	 * フィールドmemberIdに代入するメソッド
	 */
	void setMemberId(int memberId){
		this.memberId = memberId;
	}
	
	/**
	 * 現在のポイントにポイントを追加するメソッド
	 */
	void addPoints(int point){
		points += point;
	}
	
	/**
	 * 使用するポイントを減算するメソッド
	 */
	int usePoints(int point){
		boolean totalDiffUse = (points > point);
		if(totalDiffUse){
			points -= point;
			return point;
		}
		else{
			point = points;
			points -= point;
			return point;
		}
	}
	
	/**
	 * 会員データの閲覧
	 */
	void show(){
		System.out.println("会員番号は" + memberId + "番");
		System.out.println("氏名は" + name);
		System.out.println("累計ポイントは" + points + "点です.");
	}
}
