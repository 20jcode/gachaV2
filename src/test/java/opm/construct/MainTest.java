package opm.construct;

import org.gacha.gabstract.GachaAbstract;
import org.gacha.gabstract.GachaManagerAbstract;
import org.gacha.gabstract.ItemManagerAbstract;
import org.gacha.gabstract.UserAbstract;
import org.gacha.opm.mainlogic.GachaManager;
import org.gacha.opm.mainlogic.ItemManager;
import org.gacha.opm.mainlogic.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

	@Test
	@DisplayName("처음 프로그램 실행 시 생성자 주입")
	void mainConstructor(){
		//when


		ItemManagerAbstract itemManager = new ItemManager(); //TODO : json형식으로 item 삽입
		GachaManagerAbstract gachaManager = new GachaManager(); //TODO : json형식으로 gacha 삽입

		UserAbstract user = new User(itemManager,gachaManager);

		String itemname = "blacktiket";

		user.calcurate(itemname);

		System.out.println(user.getGachaAns(itemname));


	}
}
