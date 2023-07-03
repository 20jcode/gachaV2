package org.gacha.calLogic;

import java.util.Map;
import java.util.Set;

public class IsSky {

	/**
	 * 천장규칙, 횟수 : [획득 아이템1,획득 아이템2,...]
	 */
	protected Map<Integer,Set<String>> skyRule;
	protected Map<Integer,Set<String>> halfSkyRule;

	protected IsSky(){}
	public IsSky(Map<Integer,Set<String>> skyRule,Map<Integer,Set<String>> halfSkyRule){
		this.skyRule = skyRule;
		this.halfSkyRule = halfSkyRule;
	}

	/**
	 * 천장인지 확인
	 * @param num 지금까지 뽑기한 횟수
	 * @return 천장 유무
	 */
	public boolean isSky(int num){
		return skyRule.containsKey(num);
	}

	/**
	 * 반천장(확률적으로 특정 아이템을 얻음) 확인
	 * @param num 지금까지 뽑기한 횟수
	 * @return 반천장 유무
	 */
	public boolean isHalfSky(int num){
		return halfSkyRule.containsKey(num);
	}

	/**
	 * 천장으로 획득 가능한 아이템 조회
	 * @param num 지금까지 뽑기한 횟수
	 * @return 획득 아이템 이름들
	 */
	public Set<String> getSky(int num){
		return skyRule.get(num);
	}

	/**
	 * 반천장으로 획득 가능한 아이템 조회
	 * @param num 초기회된 뽑기 횟수
	 * @return 획득 가능한 아이템 이름
	 */
	public Set<String> getHalfSky(int num){
		return halfSkyRule.get(num);
	}


}
