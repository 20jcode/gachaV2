package gimplement;

import org.gacha.gimplement.Gacha;
import org.gacha.gimplement.Item;
import org.gacha.ginterface.GachaInterface;
import org.gacha.ginterface.ItemInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Gacha에 대한 로직에 대한 테스트
 *
 */
public class GachaTest {

	@Nested
	@DisplayName("가챠가 생성 되는가?")
	public class CreateTest{
		private Item item;

		@Test
		@DisplayName("생성자 테스트")
		void canCreate(){

			//given

			item = new Item();

			//when
			GachaInterface gacha = new Gacha(item);
			// 가챠에서는 item에서 어떤 정보를 원하는가?
			// 해당 item을 만들기 위한 정보


		}
	}

	@Nested
	@DisplayName("가챠의 계산이 가능한가?")
	public class CalTest{

		private Map<Integer, Map<Integer,Integer>> ans; //GachaManager에서 사용 시 입력받는 형식
		private GachaInterface gacha;

		@Test
		@DisplayName("계산 결과가 출력 되는가?")
		void canCal(){

			//given
			double a = 0.01d;
			double b = 0.02d;

			ans = new LinkedHashMap<>();

			//when

			ans.put()
		}

	}

}
