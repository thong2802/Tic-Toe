package com.T.Tictactoe.model;

import lombok.Data;

@Data
public class GamePlay {
    private TicToe type;
    private Integer coordinateX;
    private Integer coordinateY;
    private String gameId;
}
