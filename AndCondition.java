package chapter1;

public class AndCondition {

	public static void main(String[] args) {
		final int USUALLY_CHARGE = 2000;		//通常料金(定数の宣言)
		final String FEMALE = "female";		//女性:"female"(定数の宣言)
		int charge = USUALLY_CHARGE;			//料金の宣言と初期化

		/* データの設定(本来は入力などの処理) */
		int nenrei = 17;						//年齢(17歳とした場合)
		String seibetsu = "female";			//性別("female"とした場合)

		/* 条件を判定 18歳未満でかつ女性のとき半額 */
		if ((nenrei < 18) && seibetsu.equals(FEMALE)) {
			charge /= 2;					//半額計算
		}

		/* 料金の表示 */
		System.out.println("入場料は" + charge + "円です");

	}

}
