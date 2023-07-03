package org.gacha.calLogic;

import java.util.Map;
import java.util.Set;

public class IsSky {

	/**
	 * 천장규칙, 횟수 : [획득 아이템1,획득 아이템2,...]
	 */
	protected Map<Integer,Set<String>> skyRole;

	protected IsSky(){}
	public IsSky(Map<Integer,Set<String>> skyRole){
		this.skyRole = skyRole;
	}

	public Set<String> getSky(int count){
		return skyRole.get(count);
	}


}
