package com.T.Tictactoe.controller.dto;

import com.T.Tictactoe.model.Player;
import lombok.Data;

@Data
public class ConnectRequest {
    private Player player;
    private String gameId;
}
