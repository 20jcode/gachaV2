package org.designpattern.model.gachaInterface;

/**
 * 소모하는 itemId에 대해서 몇번 소모하였을 때 어떤 item을 주는 지 알고 있다.
 */
public interface SkyRule {

	/**
	 * 동적으로 SkyRule에 대한 수정을 할 수 있다.
	 * @param useItemId 소모하는 itemId
	 * @param getItemId 획득하는 itemId
	 * @param count 몇번 뽑기에 대해서
	 */
	void setSky(int useItemId,int[] getItemId,int count);

	/**
	 * 뽑기 횟수에 따른 획득 ItemId를 얻는다.
	 * @param useItemId 소모하는 itemId
	 * @param count 뽑기횟수
	 * @return 획득 itemId
	 */
	int[] getSky(int useItemId,int count);
}
