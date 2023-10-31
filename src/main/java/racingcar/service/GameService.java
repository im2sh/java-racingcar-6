package racingcar.service;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.InputManager;
import racingcar.domain.Movable;
import racingcar.domain.car.Car;
import racingcar.domain.car.Cars;
import racingcar.view.OutputView;

public class GameService {
    private static Cars cars;

    public static void racingStart(InputManager inputManager) {
        int round = inputManager.getGameProcessCount();
        List<Car> parsedCarList = inputManager.getParsedCarList();
        cars = new Cars(parsedCarList);
        OutputView.gameStartMessage();
        for (int i = 0; i < round; i++) {
            cars.oneRoundProgress(new Movable());
            OutputView.oneTurnResult(cars);
        }
    }

    public static String chooseWinner(){
        List<Car> winnerList = cars.getWinners();
        return winnerList.stream()
                .map(Car:: getName)
                .collect(Collectors.joining(", "));
    }

}
