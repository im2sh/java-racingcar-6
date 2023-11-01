package racingcar.utils;

public enum GameMessage {
    GAME_START_COMMENT("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_TRY_COUNT("시도할 횟수는 몇회인가요?"),
    ONE_TURN_MESSAGE("실행 결과"),
    ANNOUNCE_WINNER("최종 우승자 : ");
    private final String message;

    GameMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
