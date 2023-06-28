package org.gacha.ginterface;

public interface UserInterface {

    /**
     * 프로그램의 메인 사용부분
     * 계산하고자 하는 이름 입력 시 계산결과 반환
     *
     * @param itemName 계산하고자 하는 아이템의 이름
     * @return json 직렬화된 계산결과
     */
    String calcurate (String itemName);

    
}
